package br.com.fiap.controller;

import br.com.fiap.bo.LeituraBo;
import br.com.fiap.entities.leitura.Leitura;
import br.com.fiap.excecoes.ExcecoesRegraNegocio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.sql.SQLException;
import java.util.ArrayList;

@RestController
@RequestMapping("/leitura")
public class LeituraController {

    LeituraBo leituraBo = new LeituraBo();

    @GetMapping
    public ArrayList<Leitura> selecionarRs() throws SQLException, ClassNotFoundException {
        return leituraBo.selecionarBo();
    }

    @GetMapping("/{id}")
    public Leitura buscarRs(@PathVariable int id) throws SQLException, ClassNotFoundException {
        return leituraBo.buscarBo(id);
    }

    @PostMapping
    public ResponseEntity<Void> inserirRs(@RequestBody Leitura leitura)
            throws SQLException, ClassNotFoundException, ExcecoesRegraNegocio {
        leituraBo.inserirBo(leitura);
        URI location = URI.create("/leitura/" + leitura.getId());
        return ResponseEntity.created(location).build();
    }

    @PutMapping
    public ResponseEntity<Void> atualizarRs(@RequestBody Leitura leitura)
            throws SQLException, ClassNotFoundException, ExcecoesRegraNegocio {
        leituraBo.atualizarBo(leitura);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarRs(@PathVariable int id) throws SQLException, ClassNotFoundException {
        leituraBo.deletarBo(id);
        return ResponseEntity.ok().build();
    }
}
