package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Fotografia", "Introdução a fotografia", 3);
		Curso curso2 = new Curso("Violão", "Introdução ao violão básico", 5);
		Mentoria mentoria1 = new Mentoria("Composição", "Ajudando a desmistificar a composição", LocalDate.now());
		Mentoria mentoria2 = new Mentoria("Música e café", "Um bate papo sobre música com cafézinho", LocalDate.now());
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("O Poder da Autoria");
		bootcamp.setDescricao("Curso de fotografia para achar a sua autoria");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(mentoria1);
		
		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setNome("Introdutório de violão");
		bootcamp1.setDescricao("Curso de violão para iniciantes");
		bootcamp1.getConteudos().add(curso2);
		bootcamp1.getConteudos().add(mentoria2);
		
		Dev devMatheus = new Dev();
		devMatheus.setNome("Matheus");
		devMatheus.inscrever(bootcamp);
		System.out.println("Conteúdos inscritos Matheus: " + devMatheus.getConteudoInscrito());
		devMatheus.progredir();
		System.out.println(" - Progrediu - ");
		devMatheus.progredir();
		System.out.println(" - Progrediu - ");
		System.out.println("Conteúdos inscritos Matheus: " + devMatheus.getConteudoInscrito());
		System.out.println("Conteúdos concluídos Matheus: " + devMatheus.getConteudoConcluido());
		System.out.println("XP adquirido: " + devMatheus.calcularTotalXP());

		System.out.println("\n----------------------------\n");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscrever(bootcamp1);
		System.out.println("Conteúdos inscritos João: " + devJoao.getConteudoInscrito());
		devJoao.progredir();
		System.out.println(" - Progrediu - ");
		System.out.println("Conteúdos inscritos João: " + devJoao.getConteudoInscrito());
		System.out.println("Conteúdos concluídos João: " + devJoao.getConteudoConcluido());
		System.out.println("XP adquirido: " + devJoao.calcularTotalXP());
	}
}
