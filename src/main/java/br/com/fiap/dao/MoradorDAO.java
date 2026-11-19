package br.com.fiap.dao;

import br.com.fiap.conexoes.ConexaoFactory;
import br.com.fiap.entities.morador.Morador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MoradorDAO {

    public Connection minhaConexao;

    public MoradorDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    public String inserir(Morador morador) throws SQLException {
        try (PreparedStatement stmt = minhaConexao.prepareStatement(
                "INSERT INTO MORADOR (NOME, TELEFONE, RUA, NUMERO, QUARTEIRAO) VALUES (?,?,?,?,?)",
                new String[] { "ID_MORADOR" })) {
            stmt.setString(1, morador.getNome());
            stmt.setString(2, morador.getTelefone());
            stmt.setString(3, morador.getRua());
            stmt.setString(4, morador.getNumero());
            stmt.setString(5, morador.getQuarteirao());
            stmt.executeUpdate();
            morador.setId(obterIdGerado(stmt));
        }
        return "Morador cadastrado com sucesso!";
    }

    public String atualizar(Morador morador) throws SQLException {
        try (PreparedStatement stmt = minhaConexao.prepareStatement(
                "UPDATE MORADOR SET NOME=?, TELEFONE=?, RUA=?, NUMERO=?, QUARTEIRAO=? WHERE ID_MORADOR=?")) {
            stmt.setString(1, morador.getNome());
            stmt.setString(2, morador.getTelefone());
            stmt.setString(3, morador.getRua());
            stmt.setString(4, morador.getNumero());
            stmt.setString(5, morador.getQuarteirao());
            stmt.setInt(6, morador.getId());
            int linhas = stmt.executeUpdate();
            return linhas > 0
                    ? "Morador atualizado com sucesso!"
                    : "Morador nao encontrado!";
        }
    }

    public String deletar(int id) throws SQLException {
        try (PreparedStatement stmt = minhaConexao.prepareStatement(
                "DELETE FROM MORADOR WHERE ID_MORADOR=?")) {
            stmt.setInt(1, id);
            int linhas = stmt.executeUpdate();
            return linhas > 0
                    ? "Morador deletado com sucesso!"
                    : "Morador nao encontrado!";
        }
    }

    public Morador buscar(int id) throws SQLException {
        try (PreparedStatement stmt = minhaConexao.prepareStatement(
                "SELECT * FROM MORADOR WHERE ID_MORADOR=?")) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return mapMorador(rs);
                }
            }
        }
        return null;
    }

    public List<Morador> selecionar() throws SQLException {
        List<Morador> moradores = new ArrayList<>();
        try (PreparedStatement stmt = minhaConexao.prepareStatement(
                "SELECT * FROM MORADOR ORDER BY ID_MORADOR");
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                moradores.add(mapMorador(rs));
            }
        }
        return moradores;
    }

    private Morador mapMorador(ResultSet rs) throws SQLException {
        return new Morador(
                rs.getInt("ID_MORADOR"),
                rs.getString("NOME"),
                rs.getString("TELEFONE"),
                rs.getString("RUA"),
                rs.getString("NUMERO"),
                rs.getString("QUARTEIRAO"));
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
