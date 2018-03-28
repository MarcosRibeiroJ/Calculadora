package br.com.desafiocalculadora.actions;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import br.com.desafiocalculadora.telas.TelaSobre;

/**
 * Classe criada para realizar as acoes da janela Sobre, que eh aberta com clique no botao do menu
 * Possui uma classe interna que controla o fechamento da janela
 * Foi necessario criar essa classe, para garantir que o modelo singleton funcionasse
 * Toda vez que a janela era fechada usando DISPOSE_ON_CLOSE, na verdade o objeto permanecia
 * ativo, sendo assim, nao era gerada uma nova instancia caso a janela fosse fechada.
 * Utilizando o WindowListener, mais especificamente o metodo windowClosing, eh possivel definir
 * que toda vez que o usuario clicar no botao fechar da janela, o objeto deve morrer, permitindo assim
 * que outro novo seja criado, somente qndo necessario
 * 	Obs: Sou obrigado a sobrescrever todos os metodos da interface WindowListener, mesmo que esteja utilizando somente um.
 * @author Marcos Ribeiro
 */

//BIBLIOGRAFIA DE REFERENCIA

//https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/events/WindowEventDemoProject/src/events/WindowEventDemo.java
//https://stackoverflow.com/questions/5281262/how-to-close-the-window-in-awt
//https://stackoverflow.com/questions/16622462/windowclosing-method
//http://www.guj.com.br/t/botao-cancelar-que-fecha-usando-o-evento-windowclosing/226450/6

public class AcaoTelaSobre {
	
	public class FecharJanela implements WindowListener {

		@Override
		public void windowClosing(WindowEvent e) {
			if(TelaSobre.getTelaFrame().isDisplayable()) {
				TelaSobre.getTelaFrame().dispose();
			}
			
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
