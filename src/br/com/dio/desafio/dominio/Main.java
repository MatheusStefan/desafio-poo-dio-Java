package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Fotografia", "Introdução a fotografia", 2);
		Curso curso2 = new Curso("Violão", "Introdução ao violão básico", 5);
		Mentoria mentoria1 = new Mentoria("Composição", "Ajudando a desmistificar a composição", LocalDate.now());
		Mentoria mentoria2 = new Mentoria("Música e café", "Um bate papo sobre música com cafézinho", LocalDate.of(2022, 10, 9));
		
		System.out.println(curso1);
		System.out.println(mentoria1);
		System.out.println(curso2);
		System.out.println(mentoria2);
	}
}
