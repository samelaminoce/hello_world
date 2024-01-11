package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-objetivos-aprendizagem")
public class ListaObjetivosAprendizagem {
	@GetMapping
	public String listaObjetivosAprendizagem() {
		return " Compreender de fato o conteúdo que estou absorvendo. Para isso devo: Reler o conteúdo, rever os tutoriais e vídeo aular e refazer os exercícios passados.";
	}
	

}
