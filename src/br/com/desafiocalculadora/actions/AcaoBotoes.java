package br.com.desafiocalculadora.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

/**
 * Classe que criara as acoes dos botoes da calculadora
 * Toda vez que um botao for pressionado, seu valor corresponde sera exibido no visor
 * @author Marcos Ribeiro
 */

public class AcaoBotoes {
		
	public class AcaoBotao7 implements ActionListener {
		private JTextField edit;
		
		public AcaoBotao7 (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(edit.getText().equals("0")) {
				edit.setText("7");
			} else {
				edit.setText(edit.getText() + "7");
			}
		}
	}
	
	public class AcaoBotao8 implements ActionListener {
		private JTextField edit;
		
		public AcaoBotao8 (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(edit.getText().equals("0")) {
				edit.setText("8");
			} else {
				edit.setText(edit.getText() + "8");
			}
		}
	}
	
	public class AcaoBotao9 implements ActionListener {
		private JTextField edit;
		
		public AcaoBotao9 (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(edit.getText().equals("0")) {
				edit.setText("9");
			} else {
				edit.setText(edit.getText() + "9");
			}
		}
	}
	
	public class AcaoBotaoDiv implements ActionListener {
		private JTextField edit;
		
		public AcaoBotaoDiv (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			edit.setText("/");
		}
	}
	
	public class AcaoBotao4 implements ActionListener {
		private JTextField edit;
		
		public AcaoBotao4 (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(edit.getText().equals("0")) {
				edit.setText("4");
			} else {
				edit.setText(edit.getText() + "4");
			}
		}
	}
	
	public class AcaoBotao5 implements ActionListener {
		private JTextField edit;
		
		public AcaoBotao5 (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(edit.getText().equals("0")) {
				edit.setText("5");
			} else {
				edit.setText(edit.getText() + "5");
			}
		}
	}
	
	public class AcaoBotao6 implements ActionListener {
		private JTextField edit;
		
		public AcaoBotao6 (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(edit.getText().equals("0")) {
				edit.setText("6");
			} else {
				edit.setText(edit.getText() + "6");
			}
		}
	}
	
	public class AcaoBotaoMulti implements ActionListener {
		private JTextField edit;
		
		public AcaoBotaoMulti (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			edit.setText("*");
		}
	}
	
	public class AcaoBotao1 implements ActionListener {
		private JTextField edit;
		
		public AcaoBotao1 (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(edit.getText().equals("0")) {
				edit.setText("1");
			} else {
				edit.setText(edit.getText() + "1");
			}
		}
	}
	
	public class AcaoBotao2 implements ActionListener {
		private JTextField edit;
		
		public AcaoBotao2 (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(edit.getText().equals("0")) {
				edit.setText("2");
			} else {
				edit.setText(edit.getText() + "2");
			}
		}
	}
	
	public class AcaoBotao3 implements ActionListener {
		private JTextField edit;
				
		public AcaoBotao3 (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(edit.getText().equals("0")) {
				edit.setText("3");
			} else {
				edit.setText(edit.getText() + "3");
			}
		}
	}
	
	public class AcaoBotaoSub implements ActionListener {
		private JTextField edit;
		private int contador;
				
		public AcaoBotaoSub (JTextField edit) {
			this.edit = edit;
			this.contador = 0;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			for(int i = 0; i < edit.getText().length(); i++) {
				if(edit.getText().charAt(i) == '-') {
					contador++;
				}
			}
			
			if(edit.getText().equals("0")) {
				edit.setText("-");
			} else if(edit.getText().length() == 1 && edit.getText().charAt(0) == '-') {
				edit.setText(edit.getText());
			} else if(edit.getText().length() == 1 && edit.getText().charAt(0) != '-' && !edit.getText().equals("+") && !edit.getText().equals("*") && !edit.getText().equals("/")) {
				edit.setText(edit.getText() + "-");
			} else if(edit.getText().length() > 1 && edit.getText().charAt(0) == '-' && contador < 2 && edit.getText().indexOf("+") < 0 && edit.getText().indexOf("*") < 0 && edit.getText().indexOf("/") < 0) {
				edit.setText(edit.getText() + "-");
			} else if(edit.getText().length() > 1 && edit.getText().charAt(0) != '-' && contador == 0 && edit.getText().indexOf("+") < 0 && edit.getText().indexOf("*") < 0 && edit.getText().indexOf("/") < 0) {
				edit.setText(edit.getText() + "-");
			} else {
				edit.setText(edit.getText());
			}
			
			contador = 0;
		}
	}
	
	public class AcaoBotao0 implements ActionListener {
		private JTextField edit;
		
		public AcaoBotao0 (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(edit.getText().equals("0")) {
				edit.setText("0,");
			} else {
				edit.setText(edit.getText() + "0");
			}
		}
	}
	
	public class AcaoBotaoVirgula implements ActionListener {
		private JTextField edit;
		
		public AcaoBotaoVirgula (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(edit.getText().equals("-")) {
				edit.setText(edit.getText() + "0,");
			} else if(edit.getText().indexOf(",") < 0) {
				edit.setText(edit.getText() + ",");
			}
		}
	}
	
	public class AcaoBotaoSoma implements ActionListener {
		private JTextField edit;
		
		public AcaoBotaoSoma (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			int contadorSoma = 0;
			int contadorSub = 0;
			for(int i = 0;i < edit.getText().length();i++) {
				if(edit.getText().charAt(i) == '+') {
					contadorSoma++;
				} else if(edit.getText().charAt(i) == '-') {
					contadorSub++;
				}
			}
			if(edit.getText().equals("0")) {
				edit.setText(edit.getText() + "+");
			} else if(contadorSoma < 1 && edit.getText().charAt(0) == '-' && contadorSub == 1 && edit.getText().length() > 1) {
				edit.setText(edit.getText() + "+");
			} else if(contadorSoma < 1 && contadorSub < 1) {
				edit.setText(edit.getText() + "+");
			} else {
				edit.setText(edit.getText());
			}
			contadorSoma = 0;
			contadorSub = 0;
		}
	}
	
	public class AcaoBotaoClear implements ActionListener {
		private JTextField edit;
		
		public AcaoBotaoClear (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			edit.setText("0");
		}
	}
}