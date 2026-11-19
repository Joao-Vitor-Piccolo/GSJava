package br.com.fiap.controller;

import br.com.fiap.bo.MoradorBo;
import br.com.fiap.entities.morador.Morador;
import br.com.fiap.excecoes.ExcecoesRegraNegocio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.sql.SQLException;
import java.util.ArrayList;

@RestController
@RequestMapping("/morador")
public class MoradorController {

    MoradorBo moradorBo = new MoradorBo();

    @GetMapping
    public ArrayList<Morador> selecionarRs() throws SQLException, ClassNotFoundException {
        return moradorBo.selecionarBo();
    }

    @GetMapping("/{id}")
    public Morador buscarRs(@PathVariable int id) throws SQLException, ClassNotFoundException {
        return moradorBo.buscarBo(id);
    }

    @PostMapping
    public ResponseEntity<Void> inserirRs(@RequestBody Morador morador)
            throws SQLException, ClassNotFoundException, ExcecoesRegraNegocio {
        moradorBo.inserirBo(morador);
        URI location = URI.create("/morador/" + morador.getId());
        return ResponseEntity.created(location).build();
    }

    @PutMapping
    public ResponseEntity<Void> atualizarRs(@RequestBody Morador morador)
            throws SQLException, ClassNotFoundException, ExcecoesRegraNegocio {
        moradorBo.atualizarBo(morador);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarRs(@PathVariable int id) throws SQLException, ClassNotFoundException {
        moradorBo.deletarBo(id);
        return ResponseEntity.ok().build();
    }
}
