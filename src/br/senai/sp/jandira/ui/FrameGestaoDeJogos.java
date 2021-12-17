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
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

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
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

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
		lblTituloJogo.setBounds(5, 51, 120, 21);
		lblTituloJogo.setBackground(new Color(255, 255, 255));
		lblTituloJogo.setFont(new Font("MS PGothic", Font.BOLD, 15));
		contentPane.add(lblTituloJogo);

		textTituloJogo = new JTextField();
		textTituloJogo.setBounds(113, 51, 209, 20);
		textTituloJogo.setBackground(new Color(255, 255, 255));
		textTituloJogo.setFont(new Font("MS PGothic", Font.ITALIC, 14));
		contentPane.add(textTituloJogo);
		textTituloJogo.setColumns(10);

		JLabel lblFabricante = new JLabel("Fabricante:");
		lblFabricante.setForeground(new Color(255, 255, 255));
		lblFabricante.setFont(new Font("MS PGothic", Font.BOLD, 15));
		lblFabricante.setBounds(5, 87, 82, 14);
		contentPane.add(lblFabricante);

		JComboBox<String> comboBoxFabricante = new JComboBox<String>();
		comboBoxFabricante.setFont(new Font("MS PGothic", Font.BOLD, 12));
		comboBoxFabricante.setModel(new DefaultComboBoxModel<String>(
				new String[] { "", "SEGA", "CAPCOM", "BANDAI NANCO", "UBISOFT", "ROCKSTAR" }));
		comboBoxFabricante.setBackground(new Color(255, 255, 255));
		comboBoxFabricante.setForeground(new Color(0, 0, 0));
		comboBoxFabricante.setBounds(113, 83, 209, 22);
		contentPane.add(comboBoxFabricante);

		JLabel lblZerado = new JLabel("Zerado:");
		lblZerado.setForeground(new Color(255, 255, 255));
		lblZerado.setFont(new Font("MS PGothic", Font.BOLD, 15));
		lblZerado.setBounds(5, 132, 55, 14);
		contentPane.add(lblZerado);

		JCheckBox chckbxZerado = new JCheckBox("");
		chckbxZerado.setBounds(66, 123, 21, 23);
		contentPane.add(chckbxZerado);
		
		JLabel lblConsole = new JLabel("Console:");
		lblConsole.setForeground(new Color(255, 255, 255));
		lblConsole.setFont(new Font("MS PGothic", Font.BOLD, 15));
		lblConsole.setBounds(5, 170, 70, 14);
		contentPane.add(lblConsole);

		JLabel lblValorEstimado = new JLabel("Valor Estimado:");
		lblValorEstimado.setForeground(new Color(255, 255, 255));
		lblValorEstimado.setFont(new Font("Garamond", Font.BOLD, 15));
		lblValorEstimado.setBounds(113, 132, 105, 14);
		contentPane.add(lblValorEstimado);

		JLabel lblObservacoes = new JLabel("Observa\u00E7\u00F5es:");
		lblObservacoes.setForeground(new Color(255, 255, 255));
		lblObservacoes.setFont(new Font("MS PGothic", Font.BOLD, 15));
		lblObservacoes.setBounds(5, 211, 98, 14);
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
		textValorEstimado.setBounds(217, 129, 110, 20);
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
		comboConsole.setBounds(66, 166, 261, 22);
		contentPane.add(comboConsole);

		DefaultListModel<String> modelJogos = new DefaultListModel<String>();
		listJogos.setModel(modelJogos);
		
		JEditorPane editorPaneObservacoes = new JEditorPane();
		editorPaneObservacoes.setFont(new Font("MS PGothic", Font.BOLD, 12));
		editorPaneObservacoes.setBounds(113, 206, 215, 111);
		contentPane.add(editorPaneObservacoes);

		
		JogoRepository joguinho = new JogoRepository(2);

		
		btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Jogo jogo = new Jogo();
				jogo.setNomeJogo(textTituloJogo.getText());
				jogo.setValorEstimado(textValorEstimado.getText());
				jogo.setZerado(chckbxZerado.isSelected());
				jogo.setConsole(comboConsole.getSelectedIndex());
				jogo.setObservacoes(editorPaneObservacoes.getText());
				jogo.setFabricante(comboBoxFabricante.getSelectedIndex());

				
				joguinho.gravarJogos(jogo, posicao);

				posicao++;

				modelJogos.addElement(jogo.getNomeJogo());
				if (posicao == joguinho.getTamanho()) {
					btnSalvar.setEnabled(false);
					JOptionPane.showMessageDialog(null, "A lista já está completa", "cheio",
							JOptionPane.WARNING_MESSAGE);
				}

			}
		});


		JButton btnMostarJogos = new JButton("Mostar Jogos Salvos");
		btnMostarJogos.setFont(new Font("MS PGothic", Font.BOLD, 12));
		btnMostarJogos.setForeground(Color.WHITE);
		btnMostarJogos.setBackground(Color.BLACK);
		btnMostarJogos.setBounds(342, 352, 185, 23);
		contentPane.add(btnMostarJogos);
		
		JLabel lblNewLabel = new JLabel("GEST\u00C3O DE JOGOS");
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(98, 11, 174, 22);
		contentPane.add(lblNewLabel);
		
		
		btnMostarJogos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (Jogo jogo : joguinho.listarJogos()) {
					System.out.println(jogo.getNomeJogo());
					System.out.println(jogo.getObservacoes());
					System.out.println(jogo.getConsole());
					System.out.println(jogo.getValorEstimado());
					System.out.println(jogo.getFabricante());
				}
			}
		});

		listJogos.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				Jogo jogo = joguinho.listarJogos(listJogos.getSelectedIndex());
				
				textTituloJogo.setText(jogo.getNomeJogo());
				textValorEstimado.setText(jogo.getValorEstimado());
				comboConsole.setSelectedIndex(jogo.getConsole());
				editorPaneObservacoes.setText(jogo.getObservacoes());
				comboBoxFabricante.setSelectedIndex(jogo.getFabricante());
				chckbxZerado.setSelected(jogo.getZerado());
			}
		});

	}
	
	@SuppressWarnings("unused")
	private Fabricante determinarFabricante(int fabricanteSelecionado) {

		if (fabricanteSelecionado == 0) {
			return Fabricante.SEGA;
		} else if (fabricanteSelecionado == 1) {
			return Fabricante.CAPCOM;
		} else if (fabricanteSelecionado == 2) {
			return Fabricante.BANDAINANCO;
		} else if (fabricanteSelecionado == 3) {
			return Fabricante.UBISOFT;
		} else{
			return Fabricante.ROCKSTAR;
		}
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
