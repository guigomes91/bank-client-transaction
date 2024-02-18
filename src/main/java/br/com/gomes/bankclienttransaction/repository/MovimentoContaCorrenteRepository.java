package br.com.gomes.bankclienttransaction.repository;

import br.com.gomes.bankclienttransaction.documents.MovimentoContaCorrenteDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MovimentoContaCorrenteRepository extends MongoRepository<MovimentoContaCorrenteDocument, UUID> {
}
