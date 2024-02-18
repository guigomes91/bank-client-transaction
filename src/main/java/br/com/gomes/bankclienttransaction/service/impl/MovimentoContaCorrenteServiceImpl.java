package br.com.gomes.bankclienttransaction.service.impl;

import br.com.gomes.bankclienttransaction.documents.MovimentoContaCorrenteDocument;
import br.com.gomes.bankclienttransaction.repository.MovimentoContaCorrenteRepository;
import br.com.gomes.bankclienttransaction.service.MovimentoContaCorrenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.module.ModuleDescriptor;
import java.util.Objects;

@Service
public class MovimentoContaCorrenteServiceImpl implements MovimentoContaCorrenteService {

    @Autowired
    private MovimentoContaCorrenteRepository movimentoRepository;

    @Override
    public MovimentoContaCorrenteDocument registrarMovimento(MovimentoContaCorrenteDocument movimento) {
        Objects.requireNonNull(movimento);

        return movimentoRepository.save(movimento);
    }
}
