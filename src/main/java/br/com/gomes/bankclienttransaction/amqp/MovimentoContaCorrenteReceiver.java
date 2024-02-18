package br.com.gomes.bankclienttransaction.amqp;

import br.com.gomes.bankclienttransaction.documents.MovimentoContaCorrenteDocument;
import br.com.gomes.bankclienttransaction.dto.MovimentoInputDTO;
import br.com.gomes.bankclienttransaction.service.MovimentoContaCorrenteService;
import br.com.gomes.bankclienttransaction.utils.AMQPConstantes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MovimentoContaCorrenteReceiver {

	@Autowired
	private MovimentoContaCorrenteService movimentoService;

	@RabbitListener(queues = AMQPConstantes.QUEUE_NAME_CLIENT_TRANSACTION)
	public void transacaoContaCorrenteListener(MovimentoInputDTO input) {
		log.info("Received {} moviment transaction with document: {}", input.getNumeroDocumento());

		movimentoService.registrarMovimento(MovimentoContaCorrenteDocument.dtoToMovimentoContaCorrenteDocument(input));
	}
}
