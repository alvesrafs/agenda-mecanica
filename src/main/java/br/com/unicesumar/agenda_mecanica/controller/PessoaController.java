package br.com.unicesumar.agenda_mecanica.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unicesumar.agenda_mecanica.domain.PessoaFisica;


@RestController
@RequestMapping("/pessoas")
public class PessoaController {

	private PessoaFisica pessoa = new PessoaFisica("Rafael Cara de Pastel", "0123456789");
	
	@GetMapping
	public String exibePessoa() {
		return pessoa.getNome().toString();
	}
	
}
