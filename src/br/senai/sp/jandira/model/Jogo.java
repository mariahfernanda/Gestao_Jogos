package br.senai.sp.jandira.model;

public class Jogo {

	private String tituloJogo;
	private Console console;
	private double valorEstimado;
	private String observacoes;
	private Boolean zerado;

	public String wii;

	public String getNomeJogo() {
		return tituloJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.tituloJogo = nomeJogo;
	}

	public Console getConsole() {
		return console;
	}

	public void setConsole(Console console) {
		this.console = console;
	}

	public double getValorEstimado() {
		return valorEstimado;
	}

	public void setValorEstimado(double valorEstimado) {
		this.valorEstimado = valorEstimado;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public boolean isZerado() {
		return zerado;
	}

	public void setZerado(Boolean zerado) {
		this.zerado = zerado;
	}

}
