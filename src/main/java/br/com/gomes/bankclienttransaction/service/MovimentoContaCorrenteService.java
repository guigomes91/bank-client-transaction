package br.com.gomes.bankclienttransaction.service;

import br.com.gomes.bankclienttransaction.documents.MovimentoContaCorrenteDocument;
import br.com.gomes.bankclienttransaction.repository.MovimentoContaCorrenteRepository;

public interface MovimentoContaCorrenteService {
    MovimentoContaCorrenteDocument registrarMovimento(MovimentoContaCorrenteDocument movimento);
}
