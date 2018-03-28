package br.com.desafiocalculadora.exemplos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class NovoLayout {
	
	JFrame frame;
	JPanel mainPanel, grid;
		
	public NovoLayout() {
		frame = new JFrame();
		frame.setTitle("Teste de Layout");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(500, 500));
		
		
		grid = new JPanel(new GridBagLayout());
		grid.setPreferredSize(new Dimension(500, 100));
		grid.setBackground(Color.BLUE);
		mainPanel.add(grid);
		
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 1;
		c.anchor = GridBagConstraints.NORTHWEST;
		//c.insets = new Insets(0, 10, 0, 0);
		
		JLabel nome = new JLabel("Nome: ");
		
		grid.add(nome, c);
		
		frame.getContentPane().add(mainPanel);
	}

	public static void main(String[] args) {
		
		new NovoLayout();

	}

}
