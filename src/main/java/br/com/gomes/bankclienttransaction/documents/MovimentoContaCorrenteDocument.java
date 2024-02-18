package br.com.gomes.bankclienttransaction.documents;

import br.com.gomes.bankclienttransaction.dto.MovimentoInputDTO;
import br.com.gomes.bankclienttransaction.enums.TipoMovimento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Builder
@Document(collation = "transaction")
public class MovimentoContaCorrenteDocument {
	@Id
	private String id;

	private LocalDateTime dataHoraMovimento = LocalDateTime.now();

	private String numeroDocumento;

	private BigDecimal valor = BigDecimal.ZERO;

	private String descricao;

	private TipoMovimento tipoMovimento;

	private UUID contaId;

	public static MovimentoContaCorrenteDocument dtoToMovimentoContaCorrenteDocument(MovimentoInputDTO input) {
		return MovimentoContaCorrenteDocument
				.builder()
				.contaId(input.getConta().getId())
				.dataHoraMovimento(input.getDataHoraMovimento())
				.id(input.getId().toString())
				.valor(input.getValor())
				.descricao(input.getDescricao())
				.numeroDocumento(input.getNumeroDocumento())
				.tipoMovimento(input.getTipoMovimento())
				.build();
	}
}
