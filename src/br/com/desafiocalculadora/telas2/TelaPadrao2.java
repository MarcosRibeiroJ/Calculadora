package br.com.desafiocalculadora.telas2;

import javax.swing.JFrame;

public class TelaPadrao2 {
	
	protected JFrame tela;
	protected MenuPrincipal menu;
		
	public TelaPadrao2() {
		this.tela = new JFrame();
		
	}
	
	public void formataTela() {
		this.tela.setTitle("Calculadora");//adicionando titulo da janela
		this.tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//definindo que o programa encerrara ao fechar a janela
		//this.tela.setSize(231, 321); calc do windows
		this.tela.setSize(300, 400);//definindo o tamanho da janela
		this.tela.setVisible(true);
		adicionaMenu();
	}
	
	public void adicionaMenu() {
		this.menu = new MenuPrincipal();
		this.tela.setJMenuBar(menu.getJMenuBar());
	}
	
	public JFrame getTela() {
		return this.tela;
	}

}
