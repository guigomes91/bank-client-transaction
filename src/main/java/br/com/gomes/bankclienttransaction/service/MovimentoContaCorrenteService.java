package br.com.gomes.bankclienttransaction.service;

import br.com.gomes.bankclienttransaction.documents.MovimentoContaCorrenteDocument;

public interface MovimentoContaCorrenteService {
    MovimentoContaCorrenteDocument registrarMovimento(MovimentoContaCorrenteDocument movimento);
}
