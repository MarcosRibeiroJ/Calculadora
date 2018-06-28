package br.com.desafiocalculadora.telas;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import br.com.desafiocalculadora.actions.AcaoBotoes;
import br.com.desafiocalculadora.actions.AcaoTeclado;
import br.com.desafiocalculadora.menu.Menu;

/**
 * Classe que cria a tela da calculadora
 * A tela eh composta por um JFrame sem gerenciador de layout (preferi fazer desta forma para definir a posição ideal de cada objeto na janela),
 * Um JTextField e JButtons
 * @author Marcos Ribeiro
 */

public class TelaCalculadora {
	
	//Declaracao dos atributos privados
	private JFrame telaCalc = new JFrame("Calculadora");
	private Menu barraMenu = new Menu();
	private JButton b7, b8, b9, bDiv,bClear, b4, b5, b6, bMulti;
	private JButton bBack, b1, b2, b3, bSub, bIgual, b0, bVirgula, bSoma;
	private JTextField edit;
	
	//Construtor da classe
	public TelaCalculadora() {
		telaCalc.setVisible(true);//deixar janela visivel
		telaCalc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//somente encerrar o programa apos a ultima janela ser fechada
		telaCalc.setLayout(null);//retirar o gerenciador de layout
		telaCalc.setSize(300, 400);//tamanho da tela
		telaCalc.setJMenuBar(barraMenu.getJMenuBar());//adiciona o menu
		telaCalc.setResizable(false);//bloqueia o redimensionamento da tela
		adicionaComponentes();//metodo que adiciona os componentes na janela
		formataEdit();//formata o campo para digitar
		formataBotoes();//formata o texto dos botoes
		adicionaAcaoBotoes();
		//fecharJanela();
	}
	
	//Metodo para adicionar e alinhar os objetos na tela da calculadora
	public void adicionaComponentes() {
		edit = new JTextField("0");//instancia o objeto
		edit.setHorizontalAlignment(JTextField.RIGHT);//alinha o cursor a direita
		edit.setBounds(14, 20, 267, 100);//quanto se distancia da esquerda para direita, quanto se distancia de cima pra baixo, largura do objeto, altura do objeto
		telaCalc.add(edit);//adiciona componente a janela
		
		b7 = new JButton("7");
		b7.setBounds(14, 130, 45, 45);
		telaCalc.add(b7);
		
		b8 = new JButton("8");
		b8.setBounds(69, 130, 45, 45);
		telaCalc.add(b8);
		
		b9 = new JButton("9");
		b9.setBounds(124, 130, 45, 45);
		telaCalc.add(b9);
		
		bDiv = new JButton("/");
		bDiv.setBounds(179, 130, 45, 45);
		telaCalc.add(bDiv);
		
		bClear = new JButton("C");
		bClear.setBounds(234, 130, 45, 45);
		telaCalc.add(bClear);
		
		b4 = new JButton("4");
		b4.setBounds(14, 185, 45, 45);
		telaCalc.add(b4);
		
		b5 = new JButton("5");
		b5.setBounds(69, 185, 45, 45);
		telaCalc.add(b5);
		
		b6 = new JButton("6");
		b6.setBounds(124, 185, 45, 45);
		telaCalc.add(b6);
		
		bMulti = new JButton("*");
		bMulti.setBounds(179, 185, 45, 45);
		telaCalc.add(bMulti);
		
		bBack = new JButton("B");
		bBack.setBounds(234, 185, 45, 45);
		telaCalc.add(bBack);
		
		b1 = new JButton("1");
		b1.setBounds(14, 240, 45, 45);
		telaCalc.add(b1);
		
		b2 = new JButton("2");
		b2.setBounds(69, 240, 45, 45);
		telaCalc.add(b2);
		
		b3 = new JButton("3");
		b3.setBounds(124, 240, 45, 45);
		telaCalc.add(b3);
		
		bSub = new JButton("-");
		bSub.setBounds(179, 240, 45, 45);
		telaCalc.add(bSub);
		
		bIgual = new JButton("=");
		bIgual.setBounds(234, 240, 45, 100);
		telaCalc.add(bIgual);
		
		b0 = new JButton("0");
		b0.setBounds(14, 295, 100, 45);
		telaCalc.add(b0);
		
		bVirgula = new JButton(",");
		bVirgula.setBounds(124, 295, 45, 45);
		telaCalc.add(bVirgula);
		
		bSoma = new JButton("+");
		bSoma.setBounds(179, 295, 45, 45);
		telaCalc.add(bSoma);
	}
		
	public JFrame getTelaCalculadora() {
		return telaCalc;
	}
	
	/**public void fecharJanela() {
		AcaoTelaCalculadora fechar = new AcaoTelaCalculadora();
		telaCalc.addWindowListener(fechar.new FecharJanela());
	}*/
	
	public void formataEdit() {
		Font fonteEdit = new Font("arial", Font.PLAIN, 50);//fonte
		edit.setHorizontalAlignment(JTextField.RIGHT);//alinhamento do cursor
		edit.setFont(fonteEdit);//adiciona fonte
		edit.setBackground(Color.WHITE);
		edit.setEditable(false);
		edit.addKeyListener(new AcaoTeclado(this.getJTextField()));//adicionando um listener para o teclado e passando como parametro o JTextField
	}
	
	public void formataBotoes() {
		Font fonteBotao = new Font("arial", Font.BOLD, 20);
		b7.setFont(fonteBotao);
		b7.setFocusable(false);
		b8.setFont(fonteBotao);
		b8.setFocusable(false);
		b9.setFont(fonteBotao);
		b9.setFocusable(false);
		bDiv.setFont(fonteBotao);
		bDiv.setFocusable(false);
		b4.setFont(fonteBotao);
		b4.setFocusable(false);
		b5.setFont(fonteBotao);
		b5.setFocusable(false);
		b6.setFont(fonteBotao);
		b6.setFocusable(false);
		bMulti.setFont(fonteBotao);
		bMulti.setFocusable(false);
		b1.setFont(fonteBotao);
		b1.setFocusable(false);
		b2.setFont(fonteBotao);
		b2.setFocusable(false);
		b3.setFont(fonteBotao);
		b3.setFocusable(false);
		bSub.setFont(fonteBotao);
		bSub.setFocusable(false);
		b0.setFont(fonteBotao);
		b0.setFocusable(false);
		bVirgula.setFont(fonteBotao);
		bVirgula.setFocusable(false);
		
		Font fonteBotao2 = new Font("arial", Font.BOLD, 19);
		bSoma.setFont(fonteBotao2);
		bSoma.setFocusable(false);
		bIgual.setFont(fonteBotao2);
		bIgual.setFocusable(false);
		
		Font fonteBotao3 = new Font("arial", Font.BOLD, 15);
		bBack.setFont(fonteBotao3);
		bBack.setFocusable(false);
		bClear.setFont(fonteBotao3);
		bClear.setFocusable(false);
	}
	
	public JTextField getJTextField() {
		return this.edit;
	}
	
	public void adicionaAcaoBotoes() {
		AcaoBotoes acao = new AcaoBotoes();
		b7.addActionListener(acao.new AcaoBotao7(this.getJTextField()));
		b8.addActionListener(acao.new AcaoBotao8(this.getJTextField()));
		b9.addActionListener(acao.new AcaoBotao9(this.getJTextField()));
		bDiv.addActionListener(acao.new AcaoBotaoDiv(this.getJTextField()));
		b4.addActionListener(acao.new AcaoBotao4(this.getJTextField()));
		b5.addActionListener(acao.new AcaoBotao5(this.getJTextField()));
		b6.addActionListener(acao.new AcaoBotao6(this.getJTextField()));
		bMulti.addActionListener(acao.new AcaoBotaoMulti(this.getJTextField()));
		b1.addActionListener(acao.new AcaoBotao1(this.getJTextField()));
		b2.addActionListener(acao.new AcaoBotao2(this.getJTextField()));
		b3.addActionListener(acao.new AcaoBotao3(this.getJTextField()));
		bSub.addActionListener(acao.new AcaoBotaoSub(this.getJTextField()));
		b0.addActionListener(acao.new AcaoBotao0(this.getJTextField()));
		bVirgula.addActionListener(acao.new AcaoBotaoVirgula(this.getJTextField()));
		bSoma.addActionListener(acao.new AcaoBotaoSoma(this.getJTextField()));
		bClear.addActionListener(acao.new AcaoBotaoClear(this.getJTextField()));
	}

}
