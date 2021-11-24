package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Jogo;

public class JogoRepository {

	private Jogo[] cadastroJogos;

	public JogoRepository(int qtdJogos) {
		cadastroJogos = new Jogo[qtdJogos];
	}

	public void gravarJogos(Jogo jogos, int posicaoJogo) {
		cadastroJogos[posicaoJogo] = jogos;
	}

	public Jogo listarJogos(int posicaoJogos) {
		return cadastroJogos[posicaoJogos];
	}

	public Jogo[] listarJogos() {
		return cadastroJogos;
	}

	public int getTamanho() {
		return cadastroJogos.length;
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
