package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Fotografia", "Introdu��o a fotografia", 3);
		Curso curso2 = new Curso("Viol�o", "Introdu��o ao viol�o b�sico", 5);
		Mentoria mentoria1 = new Mentoria("Composi��o", "Ajudando a desmistificar a composi��o", LocalDate.now());
		Mentoria mentoria2 = new Mentoria("M�sica e caf�", "Um bate papo sobre m�sica com caf�zinho", LocalDate.now());
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("O Poder da Autoria");
		bootcamp.setDescricao("Curso de fotografia para achar a sua autoria");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(mentoria1);
		
		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setNome("Introdut�rio de viol�o");
		bootcamp1.setDescricao("Curso de viol�o para iniciantes");
		bootcamp1.getConteudos().add(curso2);
		bootcamp1.getConteudos().add(mentoria2);
		
		Dev devMatheus = new Dev();
		devMatheus.setNome("Matheus");
		devMatheus.inscrever(bootcamp);
		System.out.println("Conte�dos inscritos Matheus: " + devMatheus.getConteudoInscrito());
		devMatheus.progredir();
		System.out.println(" - Progrediu - ");
		devMatheus.progredir();
		System.out.println(" - Progrediu - ");
		System.out.println("Conte�dos inscritos Matheus: " + devMatheus.getConteudoInscrito());
		System.out.println("Conte�dos conclu�dos Matheus: " + devMatheus.getConteudoConcluido());
		System.out.println("XP adquirido: " + devMatheus.calcularTotalXP());

		System.out.println("\n----------------------------\n");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscrever(bootcamp1);
		System.out.println("Conte�dos inscritos Jo�o: " + devJoao.getConteudoInscrito());
		devJoao.progredir();
		System.out.println(" - Progrediu - ");
		System.out.println("Conte�dos inscritos Jo�o: " + devJoao.getConteudoInscrito());
		System.out.println("Conte�dos conclu�dos Jo�o: " + devJoao.getConteudoConcluido());
		System.out.println("XP adquirido: " + devJoao.calcularTotalXP());
	}
}
