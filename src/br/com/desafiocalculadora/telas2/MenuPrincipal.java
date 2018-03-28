package br.com.desafiocalculadora.telas2;

import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import br.com.desafiocalculadora.exemplos.AcaoMenu;

public class MenuPrincipal {
	
	private JMenuBar menu = new JMenuBar();//criando a barra de menu
	private JMenu arquivo = new JMenu("Arquivo");//criando a opcao Arquivo da barra de menu
	private JMenuItem novo = new JMenuItem("Novo");//criando o item Novo da opcao Arquivo
	private JMenu ajuda = new JMenu("Ajuda");//criando a opcao Ajuda da barra de menu
	private JMenuItem sobre = new JMenuItem("Sobre");//criando o item Sobre da opcao Ajuda
	
	
	public MenuPrincipal() {
		menu.add(arquivo);//adicionando a opcao Arquivo do menu
		arquivo.add(novo);//adicionando o item Novo da opcao arquivo
		menu.add(ajuda);//adicionando a opcao Ajuda do menu
		ajuda.add(sobre);//adicionando o item Sobre da opcao Ajuda
		programaBotoes();
	}
	
	public JMenuBar getJMenuBar() {
		return menu;
	}
	
	public void programaBotoes() {
		AcaoMenu acao = new AcaoMenu();
		sobre.addActionListener(acao.new AcaoSobre());
	}
	

}
