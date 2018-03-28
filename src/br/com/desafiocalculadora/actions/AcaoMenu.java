package br.com.desafiocalculadora.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import br.com.desafiocalculadora.telas.TelaCalculadora;
import br.com.desafiocalculadora.telas.TelaSobre;

/**
 * Classe que centraliza as acoes da barra de menu
 * Cada subclasse implementa um ActionListener responsavel por tratar somente um item do menu
 * Tenho duas subclasses, uma para a acao "Novo" e outra para a acao "Sobre" do menu
 * @author Marcos Ribeiro
 */

//BIBLIOGRAFIA DE REFERENCIA

//http://www.guj.com.br/t/abrir-apenas-uma-janela-independente-do-numero-de-clicks-no-botao/329699/2
//https://wmagician.wordpress.com/2008/01/02/padrao-singleton-em-java/
//http://www.guj.com.br/t/jframe-abrir-somente-uma-vez-resolvido/139583/7

public class AcaoMenu {
	
	public class AcaoMenuSobre implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) { //metodo que recebe a acao do clique no item sobre do menu e diz o que o programa deve fazer a seguir
			TelaSobre.getTela();
		}
	}
	
	public class AcaoMenuNovo implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			SwingUtilities.invokeLater(new Runnable() {
				
				@Override
				public void run() {
					TelaCalculadora tela = new TelaCalculadora();
					tela.getTelaCalculadora();
				}
			});
			
		}
		
	}

}
