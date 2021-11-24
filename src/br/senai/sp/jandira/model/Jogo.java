package br.senai.sp.jandira.model;

import javax.swing.JTextField;

public class Jogo {

	private String tituloJogo;
	private int console;
	private String valorEstimado;
	private String observacoes;
	private Boolean zerado;

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

	public boolean isZerado() {
		return zerado;
	}

	public void setZerado(Boolean zerado) {
		this.zerado = zerado;
	}

}
