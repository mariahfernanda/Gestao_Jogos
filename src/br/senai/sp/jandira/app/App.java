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
		
		FrameGestaoDeJogos frame = new FrameGestaoDeJogos();
		frame.setVisible(true);

	}

}
