package br.senai.sp.jandira.model;

import javax.swing.JTextField;

public class Jogo {

	private String tituloJogo;
	private Console console;
	private JTextField valorEstimado;
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

	public JTextField getValorEstimado() {
		return valorEstimado;
	}

	public void setValorEstimado(JTextField textValorEstimado) {
		this.valorEstimado = textValorEstimado;
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
