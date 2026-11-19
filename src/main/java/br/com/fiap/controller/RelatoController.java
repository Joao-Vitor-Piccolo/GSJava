package br.com.fiap.controller;

import br.com.fiap.bo.RelatoBo;
import br.com.fiap.entities.relato.Relato;
import br.com.fiap.excecoes.ExcecoesRegraNegocio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.sql.SQLException;
import java.util.ArrayList;

@RestController
@RequestMapping("/relato")
public class RelatoController {

    RelatoBo relatoBo = new RelatoBo();

    @GetMapping
    public ArrayList<Relato> selecionarRs() throws SQLException, ClassNotFoundException {
        return relatoBo.selecionarBo();
    }

    @GetMapping("/{id}")
    public Relato buscarRs(@PathVariable int id) throws SQLException, ClassNotFoundException {
        return relatoBo.buscarBo(id);
    }

    @PostMapping
    public ResponseEntity<Void> inserirRs(@RequestBody Relato relato)
            throws SQLException, ClassNotFoundException, ExcecoesRegraNegocio {
        relatoBo.inserirBo(relato);
        URI location = URI.create("/relato/" + relato.getId());
        return ResponseEntity.created(location).build();
    }

    @PutMapping
    public ResponseEntity<Void> atualizarRs(@RequestBody Relato relato)
            throws SQLException, ClassNotFoundException, ExcecoesRegraNegocio {
        relatoBo.atualizarBo(relato);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarRs(@PathVariable int id) throws SQLException, ClassNotFoundException {
        relatoBo.deletarBo(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}/confirmar")
    public ResponseEntity<Void> confirmarRs(@PathVariable int id)
            throws SQLException, ClassNotFoundException, ExcecoesRegraNegocio {
        relatoBo.confirmarBo(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}/descartar")
    public ResponseEntity<Void> descartarRs(@PathVariable int id)
            throws SQLException, ClassNotFoundException, ExcecoesRegraNegocio {
        relatoBo.descartarBo(id);
        return ResponseEntity.ok().build();
    }
}
