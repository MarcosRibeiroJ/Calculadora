package br.com.desafiocalculadora.telas;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import br.com.desafiocalculadora.actions.AcaoTelaSobre;

/**
 * Classe que cria a tela de informacoes sobre o programa
 * Possui um JFrame e um JTextArea
 * @author Marcos Ribeiro
 */

    public class TelaSobre {
	private static JFrame telaSobre;
	private JTextArea texto;
	private static TelaSobre tela;
	
		
	private TelaSobre() {
		TelaSobre.telaSobre = new JFrame();
		this.texto = new JTextArea();
		montarTela();
	}

	public void montarTela() {
		telaSobre.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //nunca fechar (mantive esse parametro assim pq configurei o fechamento da janela manualmente)
		telaSobre.setVisible(true); //manter a janela visivel
		telaSobre.setAlwaysOnTop(true); //sempre abrir a janela em primeiro plano
		telaSobre.setSize(400, 300); //tamanho da janela
		telaSobre.setResizable(false); //nao permite alterar o tamanho da janela
		texto.setText("Sobre o programa\n\nEste programa foi desenvolvido por Marcos Ribeiro para atender ao desafio de criar uma calculadora em Java usando a classe Swing");
		texto.setEditable(false); //desativa a edicao do texto
		texto.setLineWrap(true); //quebra linha automaticamente conforme o tamanho da tela
		texto.setWrapStyleWord(true); //quebra a linha mantendo sempre a palavra inteira no final da linha
		telaSobre.getContentPane().add(texto);//adicionando texto ao jframe
		fecharJanela(); //metodo que configura o fechamento da janela
	}
	
	//Metodo utilizando o modelo singleton
	//Verifica e somente instancia um objeto da propria classe caso este nunca tenha sido
	//instanciado ou caso ja tenha sido instanciado uma vez, mas esta indisponivel (janela foi fechada)
	public static synchronized TelaSobre getTela() {
		if(telaSobre == null || telaSobre.isDisplayable() == false) {
			tela = new TelaSobre();
			return tela;
		} else {
			return tela;
		}
	}
	
	public static JFrame getTelaFrame() {
		return telaSobre;
	}

	public void fecharJanela() {
		AcaoTelaSobre fechar = new AcaoTelaSobre();
		telaSobre.addWindowListener(fechar.new FecharJanela());
	}
	
}