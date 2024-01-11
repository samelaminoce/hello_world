package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsms")
public class BsmsController {
	@GetMapping
	public String bsms() {
		return "Mentalidades: Persistência, Mentalidade de Crescimento, Responsabilidade Pessoal e Orientação ao Futuro. Competências: Comunicação, Proatividade, Orientação ao Detalhe e Trabalho em Equipe.";
	}

}
