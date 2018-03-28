package br.com.desafiocalculadora.exemplos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcaoMenu {
	
	public class AcaoSobre implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new Sobre();
			
		}
		
	}

}
