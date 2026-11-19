package br.com.fiap.bo;

import br.com.fiap.dao.MoradorDAO;
import br.com.fiap.entities.morador.Morador;
import br.com.fiap.excecoes.ExcecoesRegraNegocio;

import java.sql.SQLException;
import java.util.ArrayList;

public class MoradorBo {

    MoradorDAO moradorDAO;

    public ArrayList<Morador> selecionarBo() throws SQLException, ClassNotFoundException {
        moradorDAO = new MoradorDAO();
        return (ArrayList<Morador>) moradorDAO.selecionar();
    }

    public Morador buscarBo(int id) throws SQLException, ClassNotFoundException {
        MoradorDAO moradorDao = new MoradorDAO();
        return moradorDao.buscar(id);
    }

    public void inserirBo(Morador morador) throws SQLException, ClassNotFoundException, ExcecoesRegraNegocio {
        validarCampos(morador);
        MoradorDAO moradorDao = new MoradorDAO();
        moradorDao.inserir(morador);
    }

    public void atualizarBo(Morador morador) throws SQLException, ClassNotFoundException, ExcecoesRegraNegocio {
        validarCampos(morador);
        MoradorDAO moradorDao = new MoradorDAO();
        moradorDao.atualizar(morador);
    }

    public void deletarBo(int id) throws SQLException, ClassNotFoundException {
        MoradorDAO moradorDao = new MoradorDAO();
        moradorDao.deletar(id);
    }

    private void validarCampos(Morador morador) throws ExcecoesRegraNegocio {
        if (morador.getNome() == null || morador.getNome().isBlank()
                || morador.getTelefone() == null || morador.getTelefone().isBlank()
                || morador.getRua() == null || morador.getRua().isBlank()
                || morador.getNumero() == null || morador.getNumero().isBlank()
                || morador.getQuarteirao() == null || morador.getQuarteirao().isBlank()) {
            throw new ExcecoesRegraNegocio("O valor nao pode ficar vazio.");
        }
    }
}
