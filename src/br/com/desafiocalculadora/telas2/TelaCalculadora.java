package br.com.desafiocalculadora.telas2;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;



public class TelaCalculadora extends TelaPadrao{
	
	private JPanel telaLayout, panelNorth, panelCenter, panelEast, panelWest, panelSouth;
	private JTextField edit;
			
	public TelaCalculadora() {
		super();
		telaLayout = new JPanel();
		telaLayout.setLayout(new BorderLayout());
		
		panelNorth = new JPanel();
		
		edit = new JTextField();
		
		panelNorth.add(edit);
		
		/**panelNorth.setBackground(Color.BLUE);
		panelNorth.setSize(300, 100);
		
		panelCenter = new JPanel();
		panelCenter.setBackground(Color.BLACK);
		
		panelEast = new JPanel();
		panelEast.setBackground(Color.GREEN);
		
		panelWest = new JPanel();
		panelWest.setBackground(Color.RED);
		
		panelSouth = new JPanel();
		panelSouth.setBackground(Color.YELLOW);
		
		telaLayout.add(panelNorth, BorderLayout.NORTH);
		telaLayout.add(panelCenter, BorderLayout.CENTER);
		telaLayout.add(panelEast, BorderLayout.EAST);
		telaLayout.add(panelWest, BorderLayout.WEST);
		telaLayout.add(panelSouth, BorderLayout.SOUTH);*/
		
		telaLayout.add(panelNorth, BorderLayout.NORTH);
		
		tela.add(telaLayout);
		
	}

}
