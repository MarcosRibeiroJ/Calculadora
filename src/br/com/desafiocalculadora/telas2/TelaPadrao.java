package br.com.desafiocalculadora.telas2;

import javax.swing.JFrame;

public class TelaPadrao {
	
	protected JFrame tela = new JFrame();//criando um JFrame que sera a tela
		
	public TelaPadrao() {
		tela.setTitle("Calculadora");//adicionando titulo da janela
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//definindo que o programa encerrara ao fechar a janela
		tela.setSize(500, 500);//definindo o tamanho da janela
		tela.setVisible(true);
		adicionaMenu();
	}
	
	public void adicionaMenu() {
		MenuPrincipal menu = new MenuPrincipal();
		tela.setJMenuBar(menu.getJMenuBar());
	}

}
