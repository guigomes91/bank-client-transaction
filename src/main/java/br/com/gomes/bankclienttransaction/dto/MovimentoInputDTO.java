package br.com.gomes.bankclienttransaction.dto;

import br.com.gomes.bankclienttransaction.enums.TipoMovimento;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovimentoInputDTO {
	
	private UUID id;
	
	private LocalDateTime dataHoraMovimento = LocalDateTime.now();
	
	@NotNull
	@NotBlank
	private String numeroDocumento;
	
	private BigDecimal valor = BigDecimal.ZERO;
	
	@NotNull
	@NotBlank
	private String descricao;
	
	private TipoMovimento tipoMovimento;

	private Conta conta;
}
