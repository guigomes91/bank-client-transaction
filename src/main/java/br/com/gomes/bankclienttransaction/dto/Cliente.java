package br.com.gomes.bankclienttransaction.dto;

import br.com.gomes.bankclienttransaction.enums.SituacaoCliente;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.*;

@Data
@AllArgsConstructor
public class Cliente {
	private UUID id;
	private String nome;
	private long cpf;
	private LocalDate dataNascimento;
	private String email;
	private String endereco;
	private String bairro;
	private String cidade;
	private int cep;
	private String estado;
	private String telefone;
	private String senha;
	private SituacaoCliente situacao;

    private Date dataCriacao;
	protected Set<Integer> perfis = new HashSet<>();
	
	@Override
	public int hashCode() {
		return Objects.hash(cpf, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(id, other.id);
	}
}
