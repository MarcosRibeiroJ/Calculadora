package br.com.desafiocalculadora;

import javax.swing.SwingUtilities;

import br.com.desafiocalculadora.telas.TelaCalculadora;


/**
 * Classe Principal do Projeto Calculadora
 * @author Marcos Ribeiro
 */

public class Calculadora {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				TelaCalculadora tela = new TelaCalculadora();
				tela.getTelaCalculadora();
			}
		});

	}

}
