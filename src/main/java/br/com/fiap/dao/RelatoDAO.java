package br.com.fiap.dao;

import br.com.fiap.conexoes.ConexaoFactory;
import br.com.fiap.entities.relato.Relato;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RelatoDAO {

    public Connection minhaConexao;

    public RelatoDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    public String inserir(Relato relato) throws SQLException {
        try (PreparedStatement stmt = minhaConexao.prepareStatement(
                "INSERT INTO RELATO (FK_MORADOR, TIPO, LOCAL, STATUS) VALUES (?,?,?,?)",
                new String[] { "ID_RELATO" })) {
            stmt.setInt(1, relato.getFk_morador());
            stmt.setString(2, relato.getTipo());
            stmt.setString(3, relato.getLocal());
            stmt.setString(4, relato.getStatus());
            stmt.executeUpdate();
            relato.setId(obterIdGerado(stmt));
        }
        return "Relato cadastrado com sucesso!";
    }

    public String atualizar(Relato relato) throws SQLException {
        try (PreparedStatement stmt = minhaConexao.prepareStatement(
                "UPDATE RELATO SET FK_MORADOR=?, TIPO=?, LOCAL=?, STATUS=? WHERE ID_RELATO=?")) {
            stmt.setInt(1, relato.getFk_morador());
            stmt.setString(2, relato.getTipo());
            stmt.setString(3, relato.getLocal());
            stmt.setString(4, relato.getStatus());
            stmt.setInt(5, relato.getId());
            int linhas = stmt.executeUpdate();
            return linhas > 0
                    ? "Relato atualizado com sucesso!"
                    : "Relato nao encontrado!";
        }
    }

    public String deletar(int id) throws SQLException {
        try (PreparedStatement stmt = minhaConexao.prepareStatement(
                "DELETE FROM RELATO WHERE ID_RELATO=?")) {
            stmt.setInt(1, id);
            int linhas = stmt.executeUpdate();
            return linhas > 0
                    ? "Relato deletado com sucesso!"
                    : "Relato nao encontrado!";
        }
    }

    public Relato buscar(int id) throws SQLException {
        try (PreparedStatement stmt = minhaConexao.prepareStatement(
                "SELECT * FROM RELATO WHERE ID_RELATO=?")) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return mapRelato(rs);
                }
            }
        }
        return null;
    }

    public List<Relato> selecionar() throws SQLException {
        List<Relato> relatos = new ArrayList<>();
        try (PreparedStatement stmt = minhaConexao.prepareStatement(
                "SELECT * FROM RELATO ORDER BY ID_RELATO");
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                relatos.add(mapRelato(rs));
            }
        }
        return relatos;
    }

    public String confirmar(int id) throws SQLException {
        try (PreparedStatement stmt = minhaConexao.prepareStatement(
                "UPDATE RELATO SET STATUS = 'CONFIRMADO' "
                        + "WHERE ID_RELATO = ? AND STATUS = 'AGUARDANDO'")) {
            stmt.setInt(1, id);
            int updated = stmt.executeUpdate();
            if (updated == 0) {
                return "Relato nao encontrado ou nao pode ser confirmado!";
            }
            return "Relato confirmado com sucesso!";
        }
    }

    public String descartar(int id) throws SQLException {
        try (PreparedStatement stmt = minhaConexao.prepareStatement(
                "UPDATE RELATO SET STATUS = 'DESCARTADO' "
                        + "WHERE ID_RELATO = ? AND STATUS = 'AGUARDANDO'")) {
            stmt.setInt(1, id);
            int updated = stmt.executeUpdate();
            if (updated == 0) {
                return "Relato nao encontrado ou nao pode ser descartado!";
            }
            return "Relato descartado com sucesso!";
        }
    }

    private Relato mapRelato(ResultSet rs) throws SQLException {
        return new Relato(
                rs.getInt("ID_RELATO"),
                rs.getInt("FK_MORADOR"),
                rs.getString("TIPO"),
                rs.getString("LOCAL"),
                rs.getString("STATUS"));
    }

    private int obterIdGerado(PreparedStatement stmt) throws SQLException {
        try (ResultSet rs = stmt.getGeneratedKeys()) {
            if (rs.next()) {
                return rs.getInt(1);
            }
        }
        throw new SQLException("O banco nao retornou o ID gerado.");
    }
}
