package br.dev.eduardo.tabuada.giu;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class TelaTabuada {
	
	//JLabel se refere ao nome (rotulo) da caixa de texto
	private JLabel labelMultiplicando;
	private JLabel labelMinimoMultiplicador;
	private JLabel labelMaximoMultiplicador;
	
	//JTextField se refere a campo de texto, o lugar onde o usuario poderá digitar a informação
	private JTextField textMultiplicando;
	private JTextField textMinimoMultiplicador;
	private JTextField textMaximoMultiplicador;
	
	//JButton se refere ao botão
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	
	//JScrollPane se refere a uma tela de rolagem, podendo visualizar uma informação maior do que a tela
	private JScrollPane scrollTabuada;
	
	//JList se refere a própria tabuada, a qual será representada como uma lista
	private JList listTabuada;
	
	
	private void exibirTabuada() {
		
	}
	
	private void limparTabuada() {
		
	}
	
	public void criarTelaTabuada() {
		
		JFrame tela = new JFrame();
		tela.setTitle("Tabuada");
		tela.setSize(400, 700);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Faz o layout ser livre, o dev que escolhe onde ficará (quanto maior o y, mais pra baixo estará o conteudo, e quanto menor o y, o conteudo irá subir)
		tela.setLayout(null);
		
		// Criação dos componentes da tela
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando: ");
		labelMultiplicando.setBounds(20, 20, 150, 30);
		
		textMultiplicando = new JTextField();
		textMultiplicando.setBounds(170, 20, 50, 30);
		
		labelMinimoMultiplicador = new JLabel();
		labelMinimoMultiplicador.setText("Min.Multiplicador: ");
		labelMinimoMultiplicador.setBounds(20, 55, 150, 30);
		
		textMinimoMultiplicador = new JTextField();
		textMinimoMultiplicador.setBounds(170, 55, 50, 30);
		
		labelMaximoMultiplicador = new JLabel();
		labelMaximoMultiplicador.setText("Max.Multiplicador: ");
		labelMaximoMultiplicador.setBounds(20, 90, 150, 30);
		
		textMaximoMultiplicador = new JTextField();
		textMaximoMultiplicador.setBounds(170, 90, 50, 30);
		
		buttonCalcular = new JButton();
		buttonCalcular.setText("CALCULAR");
		buttonCalcular.setBounds(20, 130, 130, 30);
		
		buttonLimpar = new JButton();
		buttonLimpar.setText("LIMPAR");
		buttonLimpar.setBounds(170, 130, 130, 30);
		
		scrollTabuada = new JScrollPane();
		scrollTabuada.setBounds(20, 180, 300, 450);
		
		// Obtemos o painel de conteudo (ContentPane) e adicionamos o labelMultiplicando nesse painel
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(labelMinimoMultiplicador);
		tela.getContentPane().add(labelMaximoMultiplicador);
		
		tela.getContentPane().add(textMultiplicando);
		tela.getContentPane().add(textMinimoMultiplicador);
		tela.getContentPane().add(textMaximoMultiplicador);
		
		tela.getContentPane().add(buttonCalcular);
		tela.getContentPane().add(buttonLimpar);
		
		tela.getContentPane().add(scrollTabuada);
		
		// Essa linha deve ser a ultima linha desse método
		tela.setVisible(true);
		
	}
}
