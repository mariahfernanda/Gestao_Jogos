package br.senai.sp.jandira.model;


public class Jogo {

	private String tituloJogo;
	private int console;
	private String valorEstimado;
	private String observacoes;
	private Boolean zerado;
	private int fabricante;
	private int dificuldade;

	public String getNomeJogo() {
		return tituloJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.tituloJogo = nomeJogo;
	}

	public int getConsole() {
		return console;
	}

	public void setConsole(int i) {
		this.console = i;
	}

	public String getValorEstimado() {
		return valorEstimado;
	}

	public void setValorEstimado(String string) {
		this.valorEstimado = string;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public boolean getZerado() {
		return zerado;
	}

	public void setZerado(boolean zerado) {
		this.zerado = zerado;
	}

	public int getFabricante() {
		return fabricante;
	}

	public void setFabricante(int a) {
		this.fabricante = a;
	}

	public int getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
	}

}
