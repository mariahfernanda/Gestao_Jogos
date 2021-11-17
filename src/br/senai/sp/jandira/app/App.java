package br.senai.sp.jandira.app;

import br.senai.sp.jandira.model.Console;
import br.senai.sp.jandira.model.Fabricante;
import br.senai.sp.jandira.model.Jogo;
import br.senai.sp.jandira.repository.FabricanteRepository;
import br.senai.sp.jandira.repository.JogoRepository;
import br.senai.sp.jandira.ui.FrameGestaoDeJogos;

public class App {

	public static void main(String[] args) {

		JogoRepository joguinhos = new JogoRepository(3);
		FabricanteRepository fabricantes = new FabricanteRepository(0);

		Jogo um = new Jogo();
		um.setConsole(Console.PLAYSTATION4);
		um.setNomeJogo("dois");
		um.setObservacoes("muito bom");
		um.setValorEstimado(2344);
		um.setZerado(true);

		Jogo dois = new Jogo();
		dois.setConsole(Console.PLAYSTATION4);
		dois.setNomeJogo("mario");
		dois.setObservacoes("muito bom");
		dois.setValorEstimado(800.8);
		dois.setZerado(true);

		Fabricante tres = new Fabricante();
		tres.setFabricanteJogo("Apple");

		System.out.println(um.getNomeJogo());
		System.out.println(um.getObservacoes());
		System.out.println(um.getValorEstimado());
		System.out.println(um.isZerado());
		System.out.println(fabricantes.listarFabricantes().length);
		System.out.println(Console.PLAYSTATION4.getDescricao());
		System.out.println("-------------------------------");
		System.out.println(dois.getNomeJogo());
		System.out.println(dois.getObservacoes());
		System.out.println(dois.getValorEstimado());
		System.out.println(dois.isZerado());
		System.out.println(fabricantes.listarFabricantes().length);
		System.out.println(Console.PLAYSTATION4.getDescricao());

		FrameGestaoDeJogos frame = new FrameGestaoDeJogos();
		frame.setVisible(true);

	}

}
