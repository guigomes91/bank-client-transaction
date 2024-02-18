package br.com.gomes.bankclienttransaction.dto;

import br.com.gomes.bankclienttransaction.enums.SituacaoConta;
import br.com.gomes.bankclienttransaction.enums.TipoConta;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Data
public class Conta {
    private UUID id;

    private int numeroConta;
    private int agencia;
    private Cliente cliente;

    private BigDecimal saldo;
    private TipoConta tipoConta;
    private LocalDate dataCriacao = LocalDate.now();
    private SituacaoConta situacaoConta;
}
