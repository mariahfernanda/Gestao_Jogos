package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Jogo;

public class JogoRepository {

	private Jogo[] nomeJogos;

	public JogoRepository(int qtdJogos) {
		nomeJogos = new Jogo[qtdJogos];
	}

	public void gravarJogos(Jogo jogos, int posicaoJogo) {
		nomeJogos[posicaoJogo] = jogos;
	}

	public Jogo listarJogos(int posicaoJogos) {
		return nomeJogos[posicaoJogos];
	}

	public Jogo[] listarJogos() {
		return nomeJogos;
	}

	public int getTamanho() {
		return nomeJogos.length;
	}

	public void Zerado(boolean zerouJogo) {
		System.out.println("Zerado: ");
		if (zerouJogo == true) {
			System.out.println("Jogo zerado");
		} else {
			System.out.println("Jogo não zerado");
		}
	}
}
