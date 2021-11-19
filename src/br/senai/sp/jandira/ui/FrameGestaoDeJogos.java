package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

import br.senai.sp.jandira.model.Console;
import br.senai.sp.jandira.model.Jogo;
import br.senai.sp.jandira.repository.JogoRepository;

import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.DropMode;
import javax.swing.JSlider;
import javax.swing.JProgressBar;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameGestaoDeJogos extends JFrame {

	private JPanel contentPane;
	private JTextField textTituloJogo;
	private JTextField textValorEstimado;

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
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\21276378\\Downloads\\emoji-png-88 1.png"));
		lblNewLabel_3.setBounds(310, 195, 30, 24);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\21276378\\Downloads\\emoji-png-04 1.png"));
		lblNewLabel_2.setBounds(149, 195, 18, 24);
		contentPane.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(332, 50, 195, 291);
		contentPane.add(scrollPane);
		
		
		
		JList listJogos = new JList();
		scrollPane.setViewportView(listJogos);
		listJogos.setFont(new Font("MS PGothic", Font.ITALIC, 14));
		listJogos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 51, 0), new Color(0, 0, 0)));
		listJogos.setBackground(new Color(255, 255, 255));
		
		DefaultListModel<String> modelJogos = new DefaultListModel<String>();
		listJogos.setModel(modelJogos);

		JogoRepository lista = new JogoRepository(32);
	
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
		
		JComboBox comboBoxFabricante = new JComboBox();
		comboBoxFabricante.setModel(new DefaultComboBoxModel(new String[] {"", "SEGA", "CAPCOM", "BANDAI NANCO", "UBISOFT", "ROCKSTAR"}));
		comboBoxFabricante.setBackground(new Color(255, 255, 255));
		comboBoxFabricante.setForeground(new Color(0, 0, 0));
		comboBoxFabricante.setBounds(113, 67, 209, 22);
		contentPane.add(comboBoxFabricante);
		
		JSpinner spinnerZerado = new JSpinner();
		spinnerZerado.setFont(new Font("MS PGothic", Font.ITALIC, 14));
		spinnerZerado.setBounds(67, 98, 30, 20);
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
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btnSalvar.setForeground(new Color(255, 255, 255));
		btnSalvar.setBackground(new Color(0, 0, 0));
		btnSalvar.setFont(new Font("MS PGothic", Font.ITALIC, 15));
		btnSalvar.setBounds(34, 328, 195, 37);
		contentPane.add(btnSalvar);
		
		textValorEstimado = new JTextField();
		textValorEstimado.setFont(new Font("MS PGothic", Font.ITALIC, 14));
		textValorEstimado.setBounds(212, 100, 110, 20);
		contentPane.add(textValorEstimado);
		textValorEstimado.setColumns(10);
		
		JComboBox <String> comboConsole = new JComboBox<String>();
		DefaultComboBoxModel<String> comboModelConsole = new DefaultComboBoxModel<String>();
		
		for(Console descricao : Console.values()) {
			comboModelConsole.addElement(descricao.getDescricao());
		}
		
		comboConsole.setModel(comboModelConsole);
		comboConsole.setToolTipText("");
		comboConsole.setFont(new Font("MS PGothic", Font.BOLD, 12));
		comboConsole.setBounds(67, 137, 261, 22);
		contentPane.add(comboConsole);
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Jogo jogo = new Jogo();
				jogo.setNomeJogo(textTituloJogo.getText());
				jogo.setValorEstimado(textValorEstimado);
				
				jogo.setConsole(determinarConsole(comboConsole.getSelectedIndex()));
				
			}
		});
		
		
		
		JSlider slider = new JSlider();
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(10);
		slider.setMaximum(2);
		slider.setValue(0);
		slider.setToolTipText("");
		slider.setBounds(149, 170, 179, 24);
		contentPane.add(slider);
		
		JLabel lblNewLabel = new JLabel("Grau De Dificuldade:\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("MS PGothic", Font.BOLD, 15));
		lblNewLabel.setBounds(5, 183, 152, 14);
		contentPane.add(lblNewLabel);
		
		JEditorPane editorPaneObservacoes = new JEditorPane();
		editorPaneObservacoes.setBounds(113, 230, 215, 87);
		contentPane.add(editorPaneObservacoes);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\21276378\\Downloads\\emoji-png-65 1.png"));
		lblNewLabel_4.setBounds(229, 195, 30, 24);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\21276378\\eclipse-workspace\\Gestao_Jogos\\img\\a8d86f74643e1a54489e3bd56a706a81.jpg"));
		lblNewLabel_1.setBounds(-440, -68, 1096, 723);
		contentPane.add(lblNewLabel_1);

	
	}
	private Console determinarConsole (int consoleSelecionado ) {
		
		if(consoleSelecionado == 0) {
			return Console.PLAYSTATION4;
		}else if (consoleSelecionado == 1) {
			return Console.PLAYSTATION5;
		}else if(consoleSelecionado == 2) {
			return Console.XBOXONE;
		}else if(consoleSelecionado == 3) {
			return Console.XBOX360;
		}else if(consoleSelecionado == 4) {
			return Console.NINTENDOSWITCH;
		}else {
			return Console.NINTENDOWIIU;
		}
	}
	
}
