package br.com.desafiocalculadora.telas2;

import javax.swing.SwingUtilities;

public class TelaInicial {
	
	public static void main(String[] args) {
			
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new TelaCalculadora2();
			}
		});
		
	}

}