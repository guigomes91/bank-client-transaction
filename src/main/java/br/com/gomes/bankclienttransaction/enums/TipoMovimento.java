package br.com.gomes.bankclienttransaction.enums;

public enum TipoMovimento {

	DEBITO(0, "DEBITO_EM_CONTA"), 
	CREDITO(1, "CREDITO_EM_CONTA"),
	TRANSFERENCIA_CONTA_CORRENTE_CREDITO(2, "Transferência de conta corrente entrada"),
	TRANSFERENCIA_CONTA_CORRENTE_DEBITO(3, "Transferência de conta corrente saida");
	
	private Integer codigo;
	private String descricao;
	
	private TipoMovimento(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoMovimento toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		}
		
		for (TipoMovimento tm : TipoMovimento.values()) {
			if (codigo.equals(tm.getCodigo())) {
				return tm;
			}
		}
		
		throw new IllegalArgumentException("Tipo de conta inválido");
	}
}
