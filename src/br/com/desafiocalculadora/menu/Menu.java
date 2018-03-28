package br.com.desafiocalculadora.menu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import br.com.desafiocalculadora.actions.AcaoMenu;

/**
 * Classe que cria uma barra de menu superior na tela da calculadora
 * O menu contem dois itens, cada um com um submenu
 * O primeiro item Arquivo possuí um submenu Novo
 * O segundo item Ajuda possuí um submenu Sobre
 * @author Marcos Ribeiro
 */

public class Menu {
	
	private JMenuBar menu = new JMenuBar();//criando a barra de menu
	private JMenu arquivo = new JMenu("Arquivo");//criando a opcao Arquivo da barra de menu
	private JMenuItem novo = new JMenuItem("Novo");//criando o item Novo da opcao Arquivo
	private JMenu ajuda = new JMenu("Ajuda");//criando a opcao Ajuda da barra de menu
	private JMenuItem sobre = new JMenuItem("Sobre");//criando o item Sobre da opcao Ajuda
	
	public Menu() {
		menu.add(arquivo);//adicionando a opcao Arquivo do menu
		arquivo.add(novo);//adicionando o item Novo da opcao arquivo
		menu.add(ajuda);//adicionando a opcao Ajuda do menu
		ajuda.add(sobre);//adicionando o item Sobre da opcao Ajuda
		acaoMenu();//chamada do metodo que executa as acoes do menu
	}
	
	public void acaoMenu() {
		AcaoMenu acao = new AcaoMenu();//criando uma instancia da classe que contem as acoes do menu
		sobre.addActionListener(acao. new AcaoMenuSobre());//criando uma instancia da subclasse que contem a acao do item sobre do menu
		novo.addActionListener(acao.new AcaoMenuNovo());//criando uma instancia da subclasse que contem a acao do item novo do menu
	}
	
	public JMenuBar getJMenuBar() {
		return menu;
	}

}
