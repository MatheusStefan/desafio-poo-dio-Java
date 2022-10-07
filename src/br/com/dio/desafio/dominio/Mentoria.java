package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private String titulo;
	private String descricao;
	private LocalDate data;

	public Mentoria() {

	}

	public Mentoria(String titulo, String descricao, LocalDate data) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.data = data;
	}
	@Override
	public double calcularXP() {
		
		return XP_PADRAO + 20.0;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mentoria= ");
		builder.append(titulo);
		builder.append(", descricao= ");
		builder.append(descricao);
		builder.append(", data= ");
		builder.append(data);
		builder.append(", XP adquirido= ");
		builder.append(calcularXP());
		return builder.toString();
	}


}
