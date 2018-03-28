package br.com.desafiocalculadora.exemplos;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Sobre {
		private JFrame tela;
		private JTextArea textao;
	public Sobre() {
		this.tela = new JFrame();
		this.textao = new JTextArea();
		montarTela();
	}
	
	public void montarTela() {
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		tela.setVisible(true);
		tela.setSize(400, 300);
		textao.setText("Sobre o programa\n\nEste programa foi desenvolvido por Marcos Ribeiro para atender ao desafio de criar uma calculadora em Java usando a classe Swing");
		textao.setEditable(false);
		textao.setLineWrap(true);
		textao.setWrapStyleWord(true);
		tela.getContentPane().add(textao);
	}

}
