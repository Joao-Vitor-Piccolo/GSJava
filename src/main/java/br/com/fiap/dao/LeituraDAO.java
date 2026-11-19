package br.com.fiap.dao;

import br.com.fiap.conexoes.ConexaoFactory;
import br.com.fiap.entities.leitura.Leitura;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LeituraDAO {

    public Connection minhaConexao;

    public LeituraDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    public String inserir(Leitura leitura) throws SQLException {
        try (PreparedStatement stmt = minhaConexao.prepareStatement(
                "INSERT INTO LEITURA (CODIGO_SENTINELA, OVOS, NIVEL_AGUA, TEMPERATURA, UMIDADE, DATA_HORA) VALUES (?,?,?,?,?,?)",
                new String[] { "ID_LEITURA" })) {
            stmt.setString(1, leitura.getCodigo());
            stmt.setInt(2, leitura.getOvos());
            stmt.setDouble(3, leitura.getNivel_agua());
            stmt.setDouble(4, leitura.getTemperatura());
            stmt.setDouble(5, leitura.getUmidade());
            stmt.setTimestamp(6, leitura.getData_hora());
            stmt.executeUpdate();
            leitura.setId(obterIdGerado(stmt));
        }
        return "Leitura cadastrada com sucesso!";
    }

    public String atualizar(Leitura leitura) throws SQLException {
        try (PreparedStatement stmt = minhaConexao.prepareStatement(
                "UPDATE LEITURA SET CODIGO_SENTINELA=?, OVOS=?, NIVEL_AGUA=?, TEMPERATURA=?, UMIDADE=?, DATA_HORA=? WHERE ID_LEITURA=?")) {
            stmt.setString(1, leitura.getCodigo());
            stmt.setInt(2, leitura.getOvos());
            stmt.setDouble(3, leitura.getNivel_agua());
            stmt.setDouble(4, leitura.getTemperatura());
            stmt.setDouble(5, leitura.getUmidade());
            stmt.setTimestamp(6, leitura.getData_hora());
            stmt.setInt(7, leitura.getId());
            int linhas = stmt.executeUpdate();
            return linhas > 0
                    ? "Leitura atualizada com sucesso!"
                    : "Leitura nao encontrada!";
        }
    }

    public String deletar(int id) throws SQLException {
        try (PreparedStatement stmt = minhaConexao.prepareStatement(
                "DELETE FROM LEITURA WHERE ID_LEITURA=?")) {
            stmt.setInt(1, id);
            int linhas = stmt.executeUpdate();
            return linhas > 0
                    ? "Leitura deletada com sucesso!"
                    : "Leitura nao encontrada!";
        }
    }

    public Leitura buscar(int id) throws SQLException {
        try (PreparedStatement stmt = minhaConexao.prepareStatement(
                "SELECT * FROM LEITURA WHERE ID_LEITURA=?")) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return mapLeitura(rs);
                }
            }
        }
        return null;
    }

    public List<Leitura> selecionar() throws SQLException {
        List<Leitura> leituras = new ArrayList<>();
        try (PreparedStatement stmt = minhaConexao.prepareStatement(
                "SELECT * FROM LEITURA ORDER BY ID_LEITURA");
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                leituras.add(mapLeitura(rs));
            }
        }
        return leituras;
    }

    private Leitura mapLeitura(ResultSet rs) throws SQLException {
        return new Leitura(
                rs.getInt("ID_LEITURA"),
                rs.getString("CODIGO_SENTINELA"),
                rs.getInt("OVOS"),
                rs.getDouble("NIVEL_AGUA"),
                rs.getDouble("TEMPERATURA"),
                rs.getDouble("UMIDADE"),
                rs.getTimestamp("DATA_HORA"));
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
