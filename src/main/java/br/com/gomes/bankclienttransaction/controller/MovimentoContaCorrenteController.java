package br.com.gomes.bankclienttransaction.controller;

import br.com.gomes.bankclienttransaction.documents.MovimentoContaCorrenteDocument;
import br.com.gomes.bankclienttransaction.service.MovimentoContaCorrenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bank-client-transaction")
public class MovimentoContaCorrenteController {
    @Autowired
    private MovimentoContaCorrenteService movimentoService;

    @PostMapping
    public ResponseEntity<MovimentoContaCorrenteDocument> registrarMovimento(
            @RequestBody MovimentoContaCorrenteDocument movimento) {
        MovimentoContaCorrenteDocument movimentoContaCorrenteDocument = movimentoService.registrarMovimento(movimento);
        return new ResponseEntity<>(movimentoContaCorrenteDocument, HttpStatus.CREATED);
    }
}
