package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Fotografia", "Introdu��o a fotografia", 2);
		Curso curso2 = new Curso("Viol�o", "Introdu��o ao viol�o b�sico", 5);
		Mentoria mentoria1 = new Mentoria("Composi��o", "Ajudando a desmistificar a composi��o", LocalDate.now());
		Mentoria mentoria2 = new Mentoria("M�sica e caf�", "Um bate papo sobre m�sica com caf�zinho", LocalDate.of(2022, 10, 9));
		
		System.out.println(curso1);
		System.out.println(mentoria1);
		System.out.println(curso2);
		System.out.println(mentoria2);
	}
}
