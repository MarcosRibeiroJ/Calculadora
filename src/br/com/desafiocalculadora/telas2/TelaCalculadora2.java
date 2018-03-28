package br.com.desafiocalculadora.telas2;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCalculadora2 extends TelaPadrao2 {
	
	private JPanel painelVisor, painelBase, painelBotoes;
	private JTextField edit;
	private JButton b7, b8, b9, bDiv,bClear, b4, b5, b6, bMulti, bBack, b1, b2, b3, bSub, bIgual, b0, bVirgula, bSoma;
			
	public TelaCalculadora2() {
		super();
		super.formataTela();
		adicionaJPanel();
	}
	
	public void adicionaJPanel() {
		
		//painel Base
		this.painelBase = new JPanel();
		painelBase.setBackground(Color.RED);
		painelBase.setLayout(new FlowLayout());
		
		//painel Visor
		this.painelVisor = new JPanel();
		painelVisor.setBackground(Color.ORANGE);
		painelVisor.setLayout(new GridBagLayout());
		painelVisor.setPreferredSize(new Dimension(264,100));
		
		//edit do visor
		this.edit = new JTextField();
		edit.setPreferredSize(new Dimension(264,100));
		
		GridBagConstraints c = new GridBagConstraints();
		
		//alinhamento do visor
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 1;
		c.anchor = GridBagConstraints.NORTHWEST;
				
		//adicionando visor alinhado
		painelVisor.add(edit, c);
		
		//adicionando painel do visor ao painel base
		painelBase.add(painelVisor);
		
		
		//painel Botoes
		this.painelBotoes = new JPanel();
		painelBotoes.setBackground(Color.GREEN);
		painelBotoes.setLayout(new GridBagLayout());
		painelBotoes.setPreferredSize(new Dimension(264,200));
		
		//criando botao 7
		this.b7 = new JButton();
		b7.setText("7");
		
		//alinhamento do botao 7
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 1;
		c.anchor = GridBagConstraints.NORTHWEST;
		c.insets = new Insets(0,10,10,5);
		
		//adiconando botao 7 ao painel dos botoes
		painelBotoes.add(b7, c);
		
		//criando botao 8
		this.b8 = new JButton();
		b8.setText("8");
		
		//alinhamento do botao 8
		c.gridx = 1;
		c.gridy = 0;
		c.weightx = 40;
		c.weighty = 40;
		c.anchor = GridBagConstraints.NORTHWEST;
		c.insets = new Insets(0,0,10,5);
		
		//adiconando botao 8 ao painel dos botoes
		painelBotoes.add(b8, c);
		
		//criando botao 9
		this.b9 = new JButton();
		b9.setText("9");
		
		//alinhamento do botao 9
		c.gridx = 2;
		c.gridy = 0;
		c.weightx = 2500;
		c.weighty = 2500;
		c.anchor = GridBagConstraints.NORTHWEST;
		c.insets = new Insets(0,0,10,5);
		
		//adiconando botao 9 ao painel dos botoes
		painelBotoes.add(b9, c);
		
		/**this.painelBotoes = new JPanel();
		painelBotoes.setBackground(Color.GREEN);
		painelBotoes.setLayout(new GridLayout(4, 5, 10, 10));
		painelBotoes.setPreferredSize(new Dimension(264,200));
		
		//criando botao 7
		this.b7 = new JButton();
		b7.setText("7");
				
		//adiconando botao 7 ao painel dos botoes
		painelBotoes.add(b7);
		
		//criando botao 4
		this.b4 = new JButton();
		b4.setText("4");
		
		//adiconando botao 4 ao painel dos botoes
		painelBotoes.add(b4);
		
		//criando botao 1
		this.b1 = new JButton();
		b1.setText("1");
		
		//adiconando botao 1 ao painel dos botoes
		painelBotoes.add(b1);
		
		//criando botao 0
		this.b0 = new JButton();
		b0.setText("0");
		
		//adiconando botao dividir ao painel dos botoes
		painelBotoes.add(b0);
		
		//criando botao 8
		this.b8 = new JButton();
		b8.setText("8");
		
		//adiconando botao dividir ao painel dos botoes
		painelBotoes.add(b8);*/
		
		//adicionando painel dos botoes ao painel base	
		painelBase.add(painelBotoes);
		
				
		//adicionando painel base a tela principal
		this.getTela().getContentPane().add(painelBase);
		
				
	}

}
