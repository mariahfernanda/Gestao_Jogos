package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.Caret;

import br.senai.sp.jandira.model.Console;
import br.senai.sp.jandira.model.Fabricante;
import br.senai.sp.jandira.model.Jogo;
import br.senai.sp.jandira.repository.JogoRepository;

public class FrameGestaoDeJogos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTituloJogo;
	private JTextField textValorEstimado;

	private int posicao = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameGestaoDeJogos frame = new FrameGestaoDeJogos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameGestaoDeJogos() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 430);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblRaiva = new JLabel("");
		lblRaiva.setIcon(
				new ImageIcon("C:\\Users\\21276378\\eclipse-workspace\\GestaoDeJogos\\img\\emoji-png-88 1.png"));
		lblRaiva.setBounds(313, 194, 24, 21);
		contentPane.add(lblRaiva);

		JLabel lblTriste = new JLabel("");
		lblTriste.setIcon(
				new ImageIcon("C:\\Users\\21276378\\eclipse-workspace\\GestaoDeJogos\\img\\emoji-png-65 1.png"));
		lblTriste.setBounds(229, 194, 24, 25);
		contentPane.add(lblTriste);

		JLabel lblFeliz = new JLabel("");
		lblFeliz.setIcon(
				new ImageIcon("C:\\Users\\21276378\\eclipse-workspace\\GestaoDeJogos\\img\\emoji-png-04 1.png"));
		lblFeliz.setBounds(149, 194, 24, 25);
		contentPane.add(lblFeliz);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(332, 50, 195, 291);
		contentPane.add(scrollPane);

		JList<String> listJogos = new JList<String>();
		scrollPane.setViewportView(listJogos);
		listJogos.setFont(new Font("MS PGothic", Font.ITALIC, 14));
		listJogos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 51, 0), new Color(0, 0, 0)));
		listJogos.setBackground(new Color(255, 255, 255));

		JLabel lblListaJogos = new JLabel("Meus Jogos:");
		lblListaJogos.setForeground(new Color(255, 255, 255));
		lblListaJogos.setBounds(332, 21, 120, 28);
		lblListaJogos.setFont(new Font("MS PGothic", Font.BOLD, 14));
		contentPane.add(lblListaJogos);

		JLabel lblTituloJogo = new JLabel("Titulo Do Jogo:");
		lblTituloJogo.setForeground(new Color(255, 255, 255));
		lblTituloJogo.setBounds(5, 35, 120, 21);
		lblTituloJogo.setBackground(new Color(255, 255, 255));
		lblTituloJogo.setFont(new Font("MS PGothic", Font.BOLD, 15));
		contentPane.add(lblTituloJogo);

		textTituloJogo = new JTextField();
		textTituloJogo.setBounds(113, 35, 209, 20);
		textTituloJogo.setBackground(new Color(255, 255, 255));
		textTituloJogo.setFont(new Font("MS PGothic", Font.ITALIC, 14));
		contentPane.add(textTituloJogo);
		textTituloJogo.setColumns(10);

		JLabel lblFabricante = new JLabel("Fabricante:");
		lblFabricante.setForeground(new Color(255, 255, 255));
		lblFabricante.setFont(new Font("MS PGothic", Font.BOLD, 15));
		lblFabricante.setBounds(15, 70, 82, 14);
		contentPane.add(lblFabricante);

		JComboBox<String> comboBoxFabricante = new JComboBox<String>();
		comboBoxFabricante.setFont(new Font("MS PGothic", Font.BOLD, 12));
		comboBoxFabricante.setModel(new DefaultComboBoxModel<String>(
				new String[] { "", "SEGA", "CAPCOM", "BANDAI NANCO", "UBISOFT", "ROCKSTAR" }));
		comboBoxFabricante.setBackground(new Color(255, 255, 255));
		comboBoxFabricante.setForeground(new Color(0, 0, 0));
		comboBoxFabricante.setBounds(113, 67, 209, 22);
		contentPane.add(comboBoxFabricante);

		JSpinner spinnerZerado = new JSpinner();
		spinnerZerado.setFont(new Font("MS PGothic", Font.BOLD, 14));
		spinnerZerado.setBounds(59, 98, 44, 20);
		contentPane.add(spinnerZerado);

		JLabel lblZerado = new JLabel("Zerado:");
		lblZerado.setForeground(new Color(255, 255, 255));
		lblZerado.setFont(new Font("MS PGothic", Font.BOLD, 15));
		lblZerado.setBounds(5, 101, 55, 14);
		contentPane.add(lblZerado);

		JLabel lblConsole = new JLabel("Console:");
		lblConsole.setForeground(new Color(255, 255, 255));
		lblConsole.setFont(new Font("MS PGothic", Font.BOLD, 15));
		lblConsole.setBounds(5, 141, 70, 14);
		contentPane.add(lblConsole);

		JLabel lblValorEstimado = new JLabel("Valor Estimado:");
		lblValorEstimado.setForeground(new Color(255, 255, 255));
		lblValorEstimado.setFont(new Font("Garamond", Font.BOLD, 15));
		lblValorEstimado.setBounds(113, 104, 105, 14);
		contentPane.add(lblValorEstimado);

		JLabel lblObservacoes = new JLabel("Observa\u00E7\u00F5es:");
		lblObservacoes.setForeground(new Color(255, 255, 255));
		lblObservacoes.setFont(new Font("MS PGothic", Font.BOLD, 15));
		lblObservacoes.setBounds(5, 230, 98, 14);
		contentPane.add(lblObservacoes);

		JButton btnSalvar = new JButton("Salvar");
		contentPane.add(btnSalvar);

		btnSalvar.setForeground(new Color(255, 255, 255));
		btnSalvar.setBackground(new Color(0, 0, 0));
		btnSalvar.setFont(new Font("MS PGothic", Font.BOLD, 15));
		btnSalvar.setBounds(34, 328, 195, 37);
		contentPane.add(btnSalvar);

		textValorEstimado = new JTextField();
		textValorEstimado.setFont(new Font("MS PGothic", Font.BOLD, 14));
		textValorEstimado.setBounds(212, 100, 110, 20);
		contentPane.add(textValorEstimado);
		textValorEstimado.setColumns(10);

		JComboBox<String> comboConsole = new JComboBox<String>();
		DefaultComboBoxModel<String> comboModelConsole = new DefaultComboBoxModel<String>();

		for (Console descricao : Console.values()) {
			comboModelConsole.addElement(descricao.getDescricao());
		}

		comboConsole.setModel(comboModelConsole);
		comboConsole.setToolTipText("");
		comboConsole.setFont(new Font("MS PGothic", Font.BOLD, 12));
		comboConsole.setBounds(67, 137, 261, 22);
		contentPane.add(comboConsole);

		DefaultListModel<String> modelJogos = new DefaultListModel<String>();
		listJogos.setModel(modelJogos);

		JogoRepository joguinho = new JogoRepository(5);

		btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Jogo jogo = new Jogo();
				jogo.setNomeJogo(textTituloJogo.getText());
				jogo.setValorEstimado(textValorEstimado.getSelectedText());
				jogo.setZerado(null);
				jogo.setConsole(comboConsole.getSelectedIndex());

				Fabricante fabricante = new Fabricante();
				fabricante.setFabricanteJogo(comboBoxFabricante.getSelectedIndex());

				joguinho.gravarJogos(jogo, posicao);

				posicao++;

				modelJogos.addElement(jogo.getNomeJogo());
				if (posicao == joguinho.getTamanho()) {
					btnSalvar.setEnabled(false);
					JOptionPane.showMessageDialog(null, "A turma já está completa", "cheio",
							JOptionPane.WARNING_MESSAGE);
				}

			}
		});

		JSlider sliderGrauDificuldade = new JSlider();
		sliderGrauDificuldade.setPaintTicks(true);
		sliderGrauDificuldade.setMajorTickSpacing(10);
		sliderGrauDificuldade.setMaximum(2);
		sliderGrauDificuldade.setValue(0);
		sliderGrauDificuldade.setToolTipText("");
		sliderGrauDificuldade.setBounds(149, 170, 179, 24);
		contentPane.add(sliderGrauDificuldade);

		JLabel lblGrauDificuldade = new JLabel("Grau De Dificuldade:\r\n");
		lblGrauDificuldade.setForeground(new Color(255, 255, 255));
		lblGrauDificuldade.setFont(new Font("MS PGothic", Font.BOLD, 15));
		lblGrauDificuldade.setBounds(5, 183, 152, 14);
		contentPane.add(lblGrauDificuldade);

		JEditorPane editorPaneObservacoes = new JEditorPane();
		editorPaneObservacoes.setFont(new Font("MS PGothic", Font.BOLD, 12));
		editorPaneObservacoes.setBounds(113, 230, 215, 87);
		contentPane.add(editorPaneObservacoes);

		JButton btnMostarJogos = new JButton("Mostar Jogos Salvos");
		btnMostarJogos.setFont(new Font("MS PGothic", Font.BOLD, 12));
		btnMostarJogos.setForeground(Color.WHITE);
		btnMostarJogos.setBackground(Color.BLACK);
		btnMostarJogos.setBounds(342, 352, 185, 23);
		contentPane.add(btnMostarJogos);
		btnMostarJogos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (Jogo jogo : joguinho.listarJogos()) {
					System.out.println(jogo.getNomeJogo());
					System.out.println(jogo.getObservacoes());
					System.out.println(jogo.getConsole());
					System.out.println(jogo.getValorEstimado());
					System.out.println(Fabricante.class);
				}
			}
		});

		JLabel lblPlanoDeFundo = new JLabel("New label");
		lblPlanoDeFundo.setIcon(new ImageIcon(
				"C:\\Users\\21276378\\eclipse-workspace\\GestaoDeJogos\\img\\a8d86f74643e1a54489e3bd56a706a81.jpg"));
		lblPlanoDeFundo.setBounds(-324, -55, 1096, 723);
		contentPane.add(lblPlanoDeFundo);

		listJogos.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				Jogo jogo = joguinho.listarJogos(listJogos.getSelectedIndex());
				textTituloJogo.setText(jogo.getNomeJogo());
				textValorEstimado.setText(jogo.getValorEstimado());
				comboConsole.setSelectedIndex(jogo.getConsole());
				editorPaneObservacoes.setText(jogo.getObservacoes());
				comboBoxFabricante.setSelectedItem(comboBoxFabricante.getSelectedItem());
				
			}
		});

	}

	@SuppressWarnings("unused")
	private Console determinarConsole(int consoleSelecionado) {

		if (consoleSelecionado == 0) {
			return Console.PLAYSTATION4;
		} else if (consoleSelecionado == 1) {
			return Console.PLAYSTATION5;
		} else if (consoleSelecionado == 2) {
			return Console.XBOXONE;
		} else if (consoleSelecionado == 3) {
			return Console.XBOX360;
		} else if (consoleSelecionado == 4) {
			return Console.NINTENDOSWITCH;
		} else {
			return Console.NINTENDOWIIU;
		}
	}

}
