package br.com.desafiocalculadora.exemplos;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LayoutCalc {
	
	public static void adicionaComponentes(Container painel) {
		painel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		JButton b7, b8, b9, bDiv,bClear, b4, b5, b6, bMulti, bBack, b1, b2, b3, bSub, bIgual, b0, bVirgula, bSoma;
		JTextField edit;
				
		b7 = new JButton("7");
		c.fill = GridBagConstraints.BOTH;
	    c.weightx = 0.5;
		c.ipady = 10;
		c.gridx = 0;
		c.gridy = 1;
		c.insets = new Insets(8,16,0,8);
		painel.add(b7, c);
		
		b8 = new JButton("8");
		c.fill = GridBagConstraints.BOTH;
	    c.weightx = 0.5;
	    c.ipady = 10;
		c.gridx = 1;
		c.gridy = 1;
		c.insets = new Insets(8,0,0,8);
		painel.add(b8, c);
		
		b9 = new JButton("9");
		c.fill = GridBagConstraints.BOTH;
	    c.weightx = 0.5;
	    c.ipady = 10;
		c.gridx = 2;
		c.gridy = 1;
		c.insets = new Insets(8,0,0,8);
		painel.add(b9, c);
		
		bDiv = new JButton("/");
		c.fill = GridBagConstraints.BOTH;
	    c.weightx = 0.5;
	    c.ipady = 10;
		c.gridx = 3;
		c.gridy = 1;
		c.insets = new Insets(8,0,0,8);
		painel.add(bDiv, c);
		
		bClear = new JButton("C");
		c.fill = GridBagConstraints.BOTH;
	    c.weightx = 0.5;
	    c.ipady = 10;
		c.gridx = 4;
		c.gridy = 1;
		c.insets = new Insets(8,0,0,16);
		painel.add(bClear, c);
		
		b4 = new JButton("4");
		c.fill = GridBagConstraints.BOTH;
	    c.weightx = 0.5;
		c.ipady = 10;
		c.gridx = 0;
		c.gridy = 2;
		c.insets = new Insets(8,16,0,8);
		painel.add(b4, c);
		
		b5 = new JButton("5");
		c.fill = GridBagConstraints.BOTH;
	    c.weightx = 0.5;
	    c.ipady = 10;
		c.gridx = 1;
		c.gridy = 2;
		c.insets = new Insets(8,0,0,8);
		painel.add(b5, c);
		
		b6 = new JButton("6");
		c.fill = GridBagConstraints.BOTH;
	    c.weightx = 0.5;
	    c.ipady = 10;
		c.gridx = 2;
		c.gridy = 2;
		c.insets = new Insets(8,0,0,8);
		painel.add(b6, c);
		
		bMulti = new JButton("*");
		c.fill = GridBagConstraints.BOTH;
	    c.weightx = 0.5;
	    c.ipady = 10;
		c.gridx = 3;
		c.gridy = 2;
		c.insets = new Insets(8,0,0,8);
		painel.add(bMulti, c);
		
		bBack = new JButton("<=");
		c.fill = GridBagConstraints.BOTH;
	    c.weightx = 0.5;
	    c.ipady = 10;
		c.gridx = 4;
		c.gridy = 2;
		c.insets = new Insets(8,0,0,16);
		painel.add(bBack, c);
		
		b1 = new JButton("1");
		c.fill = GridBagConstraints.BOTH;
	    c.weightx = 0.5;
		c.ipady = 10;
		c.gridx = 0;
		c.gridy = 3;
		c.insets = new Insets(8,16,0,8);
		painel.add(b1, c);
		
		b2 = new JButton("2");
		c.fill = GridBagConstraints.BOTH;
	    c.weightx = 0.5;
	    c.ipady = 10;
		c.gridx = 1;
		c.gridy = 3;
		c.insets = new Insets(8,0,0,8);
		painel.add(b2, c);
		
		b3 = new JButton("3");
		c.fill = GridBagConstraints.BOTH;
	    c.weightx = 0.5;
	    c.ipady = 10;
		c.gridx = 2;
		c.gridy = 3;
		c.insets = new Insets(8,0,0,8);
		painel.add(b3, c);
		
		bSub = new JButton("-");
		c.fill = GridBagConstraints.BOTH;
	    c.weightx = 0.5;
	    c.ipady = 10;
		c.gridx = 3;
		c.gridy = 3;
		c.insets = new Insets(8,0,0,8);
		painel.add(bSub, c);
		
		bIgual = new JButton("=");
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0.5;
		c.ipady = 10;
		c.gridx = 4;
		c.gridy = 3;
		c.gridheight = 2;
		c.insets = new Insets(8,0,16,16);
		painel.add(bIgual, c);
		
		b0 = new JButton("0");
		c.fill = GridBagConstraints.BOTH;
	    c.weightx = 0.5;
	    c.ipadx = 0;
	    c.ipady = 10;
		c.gridx = 0;
		c.gridy = 4;
		c.gridheight = 1;
		c.gridwidth = 2;
		c.insets = new Insets(8,16,16,8);
		painel.add(b0, c);
		
		bVirgula = new JButton(",");
		c.fill = GridBagConstraints.BOTH;
	    c.weightx = 0.5;
	    c.ipady = 10;
		c.gridx = 2;
		c.gridy = 4;
		c.gridheight = 1;
		c.gridwidth = 1;
		c.insets = new Insets(8,0,16,8);
		painel.add(bVirgula, c);
		
		bSoma = new JButton("+");
		c.fill = GridBagConstraints.BOTH;
	    c.weightx = 0.5;
	    c.ipady = 10;
		c.gridx = 3;
		c.gridy = 4;
		c.gridheight = 1;
		c.gridwidth = 1;
		c.insets = new Insets(8,0,16,8);
		painel.add(bSoma, c);
		
		edit = new JTextField();
		c.fill = GridBagConstraints.BOTH;
		c.gridheight = 1;
		c.weightx = 0;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 5;
		c.ipady = 80;
		c.insets = new Insets(16,16,0,16);
		painel.add(edit, c);
	}
	
	public static void criaTela() {
		JFrame tela = new JFrame("Calculadora");
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		adicionaComponentes(tela.getContentPane());
		
		tela.pack();
		tela.setVisible(true);
	}

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				criaTela();
				
			}
		});

	}

}
