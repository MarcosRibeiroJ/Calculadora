package br.com.desafiocalculadora.exemplos;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridBagLayoutExemplo1 extends JPanel {
	
	JButton b1, b2, b3, b4, b5;
	GridBagConstraints alinhamento = new GridBagConstraints();
	
	public GridBagLayoutExemplo1() {
		
		setLayout(new GridBagLayout());
		
		alinhamento.insets = new Insets(5, 5, 5, 5);
		
		b1 = new JButton("Botao 1");
		//b1.setPreferredSize(new Dimension(50,60));
		
		alinhamento.gridx = 0;
		alinhamento.gridy = 0;
		add(b1, alinhamento);
		
		b2 = new JButton("Botao 2");
		alinhamento.gridx = 1;
		alinhamento.gridy = 1;
		add(b2, alinhamento);
		
		b3 = new JButton("Botao 3");
		alinhamento.gridx = 2;
		alinhamento.gridy = 2;
		add(b3, alinhamento);
		
		b4 = new JButton("Botao 4");
		alinhamento.gridx = 3;
		alinhamento.gridy = 3;
		add(b4, alinhamento);
		
		b5 = new JButton("Botao 5");
		alinhamento.gridx = 1;
		alinhamento.gridy = 4;
		
		alinhamento.gridwidth = 3;
		alinhamento.fill = GridBagConstraints.HORIZONTAL;
		
		add(b5, alinhamento);
	}

	public static void main(String[] args) {
		
		GridBagLayoutExemplo1 tela = new GridBagLayoutExemplo1();
		JFrame frame = new JFrame();
		frame.setTitle("Exemplo de GridBagLayout");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(tela);

	}

}
