package br.com.unicesumar.agenda_mecanica.domain;

import lombok.Data;

@Data
public class PessoaFisica {
	
	private String nome;
	private String cpf;
	

	public PessoaFisica(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
}
	
