package br.com.desafiocalculadora.actions;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



/**
 * A principio nao sei se sera necessario utilizar essa classe para controlar o fechamento
 * da janela da calculadora, resolvi meu problema de fechar somente uma calculadora e nao
 * todas, mudando o atributo do JFrame de "EXIT_ON_CLOSE" para "DISPOSE_ON_CLOSE"
 * Não sei se futuramente (qndo estiver realizando as operações matematicas na calculadora)
 * isso vai atrapalhar
 * @author Marcos Ribeiro
 */

public class AcaoTelaCalculadora {
	
	public class FecharJanela implements WindowListener {

		
		@Override
		public void windowClosing(WindowEvent e) {
			
			
		}
		
		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
	}

}
