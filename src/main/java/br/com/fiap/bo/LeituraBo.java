package br.com.fiap.bo;

import br.com.fiap.dao.LeituraDAO;
import br.com.fiap.entities.leitura.Leitura;
import br.com.fiap.excecoes.ExcecoesRegraNegocio;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

public class LeituraBo {

    LeituraDAO leituraDAO;

    public ArrayList<Leitura> selecionarBo() throws SQLException, ClassNotFoundException {
        leituraDAO = new LeituraDAO();
        return (ArrayList<Leitura>) leituraDAO.selecionar();
    }

    public Leitura buscarBo(int id) throws SQLException, ClassNotFoundException {
        LeituraDAO leituraDao = new LeituraDAO();
        return leituraDao.buscar(id);
    }

    public void inserirBo(Leitura leitura) throws SQLException, ClassNotFoundException, ExcecoesRegraNegocio {
        validarCampos(leitura);
        if (leitura.getData_hora() == null) {
            leitura.setData_hora(new Timestamp(System.currentTimeMillis()));
        }
        LeituraDAO leituraDao = new LeituraDAO();
        leituraDao.inserir(leitura);
    }

    public void atualizarBo(Leitura leitura) throws SQLException, ClassNotFoundException, ExcecoesRegraNegocio {
        LeituraDAO leituraDao = new LeituraDAO();
        Leitura atual = leituraDao.buscar(leitura.getId());
        if (atual == null) {
            throw new ExcecoesRegraNegocio("Leitura nao encontrada.");
        }
        validarCampos(leitura);
        if (leitura.getData_hora() == null) {
            leitura.setData_hora(atual.getData_hora());
        }
        leituraDao.atualizar(leitura);
    }

    public void deletarBo(int id) throws SQLException, ClassNotFoundException {
        LeituraDAO leituraDao = new LeituraDAO();
        leituraDao.deletar(id);
    }

    private void validarCampos(Leitura leitura) throws ExcecoesRegraNegocio {
        if (leitura.getCodigo() == null || leitura.getCodigo().isBlank()
                || leitura.getOvos() == null
                || leitura.getNivel_agua() == null
                || leitura.getTemperatura() == null
                || leitura.getUmidade() == null) {
            throw new ExcecoesRegraNegocio("O valor nao pode ficar vazio.");
        }
        if (leitura.getOvos() < 0 || leitura.getNivel_agua() < 0) {
            throw new ExcecoesRegraNegocio("O valor nao pode ser negativo.");
        }
        if (leitura.getUmidade() < 0 || leitura.getUmidade() > 100) {
            throw new ExcecoesRegraNegocio("Umidade fora da faixa.");
        }
        if (leitura.getTemperatura() > 60) {
            throw new ExcecoesRegraNegocio("Temperatura fora da faixa.");
        }
    }
}
