package br.com.desafiocalculadora.telas;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

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
		//fecharJanela();
	}
	
	//Metodo para adicionar e alinhar os objetos na tela da calculadora
	public void adicionaComponentes() {
		edit = new JTextField();//instancia o objeto
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
		edit.addKeyListener(new AcaoTeclado(this.getJTextField()));
	}
	
	public void formataBotoes() {
		Font fonteBotao = new Font("arial", Font.BOLD, 20);
		b7.setFont(fonteBotao);
		b8.setFont(fonteBotao);
		b9.setFont(fonteBotao);
		bDiv.setFont(fonteBotao);
		b4.setFont(fonteBotao);
		b5.setFont(fonteBotao);
		b6.setFont(fonteBotao);
		bMulti.setFont(fonteBotao);
		b1.setFont(fonteBotao);
		b2.setFont(fonteBotao);
		b3.setFont(fonteBotao);
		bSub.setFont(fonteBotao);
		b0.setFont(fonteBotao);
		bVirgula.setFont(fonteBotao);
		
		Font fonteBotao2 = new Font("arial", Font.BOLD, 19);
		bSoma.setFont(fonteBotao2);
		bIgual.setFont(fonteBotao2);
		
		Font fonteBotao3 = new Font("arial", Font.BOLD, 15);
		bBack.setFont(fonteBotao3);
		bClear.setFont(fonteBotao3);
	}
	
	public JTextField getJTextField() {
		return this.edit;
	}

}
