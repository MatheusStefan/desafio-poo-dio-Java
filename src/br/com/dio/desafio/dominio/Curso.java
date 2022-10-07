package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

	private String titulo;
	private String descricao;
	private int cargaHoraria;

	public Curso() {

	}

	public Curso(String titulo, String descricao, int cargaHoraria) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public double calcularXP() {

		return XP_PADRAO * cargaHoraria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Curso= ");
		builder.append(titulo);
		builder.append(", descricao= ");
		builder.append(descricao);
		builder.append(", cargaHoraria= ");
		builder.append(cargaHoraria);
		builder.append(", XP adquirido= ");
		builder.append(calcularXP());
		return builder.toString();
	}


}
