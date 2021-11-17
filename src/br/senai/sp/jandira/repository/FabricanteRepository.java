package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Fabricante;

public class FabricanteRepository {

	private Fabricante[] fabricante;

	public FabricanteRepository(int qtdFabricantes) {
		fabricante = new Fabricante[qtdFabricantes];
	}

	public void gravarFabricante(Fabricante fabricantes, int posicaoFabricante) {
		fabricante[posicaoFabricante] = fabricantes;
	}

	public Fabricante listarFabricantes(int posicaoFabricantes) {
		return fabricante[posicaoFabricantes];
	}

	public Fabricante[] listarFabricantes() {
		return fabricante;
	}

}
