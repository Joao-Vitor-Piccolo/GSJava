package br.com.fiap.bo;

import br.com.fiap.dao.MoradorDAO;
import br.com.fiap.dao.RelatoDAO;
import br.com.fiap.entities.relato.Relato;
import br.com.fiap.excecoes.ExcecoesRegraNegocio;

import java.sql.SQLException;
import java.util.ArrayList;

public class RelatoBo {

    RelatoDAO relatoDAO;

    public ArrayList<Relato> selecionarBo() throws SQLException, ClassNotFoundException {
        relatoDAO = new RelatoDAO();
        return (ArrayList<Relato>) relatoDAO.selecionar();
    }

    public Relato buscarBo(int id) throws SQLException, ClassNotFoundException {
        RelatoDAO relatoDao = new RelatoDAO();
        return relatoDao.buscar(id);
    }

    public void inserirBo(Relato relato) throws SQLException, ClassNotFoundException, ExcecoesRegraNegocio {
        validarCampos(relato);
        relato.setStatus("AGUARDANDO");
        RelatoDAO relatoDao = new RelatoDAO();
        relatoDao.inserir(relato);
    }

    public void atualizarBo(Relato relato) throws SQLException, ClassNotFoundException, ExcecoesRegraNegocio {
        RelatoDAO relatoDao = new RelatoDAO();
        Relato atual = relatoDao.buscar(relato.getId());
        if (atual == null) {
            throw new ExcecoesRegraNegocio("Relato nao encontrado.");
        }
        validarCampos(relato);
        relato.setStatus(atual.getStatus());
        relatoDao.atualizar(relato);
    }

    public void deletarBo(int id) throws SQLException, ClassNotFoundException {
        RelatoDAO relatoDao = new RelatoDAO();
        relatoDao.deletar(id);
    }

    public void confirmarBo(int id) throws SQLException, ClassNotFoundException, ExcecoesRegraNegocio {
        RelatoDAO relatoDao = new RelatoDAO();
        Relato relato = relatoDao.buscar(id);
        if (relato == null) {
            throw new ExcecoesRegraNegocio("Relato nao encontrado.");
        }
        if (!"AGUARDANDO".equals(relato.getStatus())) {
            throw new ExcecoesRegraNegocio("Relato nao pode ser confirmado.");
        }
        String resultado = relatoDao.confirmar(id);
        if (resultado.contains("nao")) {
            throw new ExcecoesRegraNegocio(resultado);
        }
    }

    public void descartarBo(int id) throws SQLException, ClassNotFoundException, ExcecoesRegraNegocio {
        RelatoDAO relatoDao = new RelatoDAO();
        Relato relato = relatoDao.buscar(id);
        if (relato == null) {
            throw new ExcecoesRegraNegocio("Relato nao encontrado.");
        }
        if (!"AGUARDANDO".equals(relato.getStatus())) {
            throw new ExcecoesRegraNegocio("Relato nao pode ser descartado.");
        }
        String resultado = relatoDao.descartar(id);
        if (resultado.contains("nao")) {
            throw new ExcecoesRegraNegocio(resultado);
        }
    }

    private void validarCampos(Relato relato) throws SQLException, ClassNotFoundException, ExcecoesRegraNegocio {
        if (relato.getTipo() == null || relato.getTipo().isBlank()
                || relato.getLocal() == null || relato.getLocal().isBlank()) {
            throw new ExcecoesRegraNegocio("O valor nao pode ficar vazio.");
        }
        if (relato.getFk_morador() == null || new MoradorDAO().buscar(relato.getFk_morador()) == null) {
            throw new ExcecoesRegraNegocio("Morador nao encontrado.");
        }
    }
}
