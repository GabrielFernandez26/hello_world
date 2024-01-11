package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade1")
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Persistência,\r\n"
				+ "Mentalidade de Crescimento,\r\n"
				+ "Orientação ao Futuro,\r\n"
				+ "Responsabilidade Pessoal, \r\n"
				+ "Proatividade, \r\n"
				+ "Comunicação, \r\n"
				+ "Atenção aos Detalhes\r\n"
				+ "Trabalho em Equipe";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "1. Entender o Spring;\r\n"
				+ "2- Praticar exemplos no Spring; \r\n"
				+ "3 - Estudar mais sobre REST API";
	}
}
