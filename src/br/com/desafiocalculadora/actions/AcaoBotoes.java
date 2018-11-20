package br.com.desafiocalculadora.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import br.com.desafiocalculadora.calculos.Calculo;

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
			} else if(edit.getText().length() < 9) {
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
			} else if(edit.getText().length() < 9) {
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
			} else if(edit.getText().length() < 9) {
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
			int ultimo = edit.getText().length()-1;
			
			if((edit.getText().lastIndexOf("-") >= 1 || edit.getText().lastIndexOf("+") >= 1 || edit.getText().lastIndexOf("*") >= 1 || edit.getText().lastIndexOf("/") >= 1) && (edit.getText().charAt(ultimo) != '-' && edit.getText().charAt(ultimo) != '+' && edit.getText().charAt(ultimo) != '*' && edit.getText().charAt(ultimo) != '/' && edit.getText().charAt(ultimo) != ',')) {
				AcaoBotaoIgual acao = new AcaoBotaoIgual(edit);
				acao.separaNumeros();
				edit.setText(edit.getText() + "/");
			} else if(edit.getText().indexOf("/") < 0 && edit.getText().length() < 9 && edit.getText().charAt(ultimo) != ',') {
				edit.setText(edit.getText() + "/");
			} else {
				edit.setText(edit.getText());
			}
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
			} else if(edit.getText().length() < 9){
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
			} else if(edit.getText().length() < 9) {
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
			} else if(edit.getText().length() < 9) {
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
			int ultimo = edit.getText().length()-1;
			
			if((edit.getText().lastIndexOf("-") >= 1 || edit.getText().lastIndexOf("+") >= 1 || edit.getText().lastIndexOf("*") >= 1 || edit.getText().lastIndexOf("/") >= 1) && (edit.getText().charAt(ultimo) != '-' && edit.getText().charAt(ultimo) != '+' && edit.getText().charAt(ultimo) != '*' && edit.getText().charAt(ultimo) != '/' && edit.getText().charAt(ultimo) != ',')) {
				AcaoBotaoIgual acao = new AcaoBotaoIgual(edit);
				acao.separaNumeros();
				edit.setText(edit.getText() + "*");
			} else if(edit.getText().indexOf("*") < 0 && edit.getText().length() < 9 && edit.getText().charAt(ultimo) != ',') {
				edit.setText(edit.getText() + "*");
			} else {
				edit.setText(edit.getText());
			}
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
			} else if(edit.getText().length() < 9) {
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
			} else if(edit.getText().length() < 9) {
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
			} else if(edit.getText().length() < 9) {
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
			int ultimo = edit.getText().length()-1;
			for(int i = 0; i < edit.getText().length(); i++) {
				if(edit.getText().charAt(i) == '-') {
					contador++;
				}
			}
			
			if((edit.getText().lastIndexOf("-") >= 1 || edit.getText().lastIndexOf("+") >= 1 || edit.getText().lastIndexOf("*") >= 1 || edit.getText().lastIndexOf("/") >= 1) && (edit.getText().charAt(ultimo) != '-' && edit.getText().charAt(ultimo) != '+' && edit.getText().charAt(ultimo) != '*' && edit.getText().charAt(ultimo) != '/' && edit.getText().charAt(ultimo) != ',')) {
				AcaoBotaoIgual acao = new AcaoBotaoIgual(edit);
				acao.separaNumeros();
				edit.setText(edit.getText() + "-");
			} else if(edit.getText().equals("0")) {
				edit.setText("-");
			} else if(edit.getText().length() == 1 && edit.getText().charAt(0) == '-') {
				edit.setText(edit.getText());
			} else if(edit.getText().length() == 1 && edit.getText().charAt(0) != '-' && !edit.getText().equals("+") && !edit.getText().equals("*") && !edit.getText().equals("/")) {
				edit.setText(edit.getText() + "-");
			} else if(edit.getText().length() > 1 && edit.getText().charAt(0) == '-' && contador < 2 && edit.getText().indexOf("+") < 0 && edit.getText().indexOf("*") < 0 && edit.getText().indexOf("/") < 0 && edit.getText().length() < 9 && edit.getText().charAt(ultimo) != ',') {
				edit.setText(edit.getText() + "-");
			} else if(edit.getText().length() > 1 && edit.getText().charAt(0) != '-' && contador == 0 && edit.getText().indexOf("+") < 0 && edit.getText().indexOf("*") < 0 && edit.getText().indexOf("/") < 0 && edit.getText().length() < 9 && edit.getText().charAt(ultimo) != ',') {
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
			} else if(edit.getText().length() < 9) {
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
			int i, contador = 0;
						
			for(i = 0; i < edit.getText().length(); i++) {
				if(edit.getText().charAt(i) == ',') {
					contador++;
				}
			}
			
			if(edit.getText().charAt(edit.getText().length()-1) == ',') {
				edit.setText(edit.getText());
			} else if(edit.getText().equals("-")) {
				edit.setText(edit.getText() + "0,");
			} else if(edit.getText().equals("0")) {
				edit.setText(edit.getText() + ",");
			} else if(contador == 0 && edit.getText().charAt(edit.getText().length()-1) != '-' && edit.getText().charAt(edit.getText().length()-1) != '+' && edit.getText().charAt(edit.getText().length()-1) != '*' && edit.getText().charAt(edit.getText().length()-1) != '/' && edit.getText().length() < 9) {
				edit.setText(edit.getText() + ",");
			} else if(contador == 1 && edit.getText().lastIndexOf("-") <= 0 && edit.getText().lastIndexOf("+") < 0 &&  edit.getText().lastIndexOf("*") < 0 && edit.getText().lastIndexOf("/") < 0) {
				edit.setText(edit.getText());
			} else if(contador == 1 && edit.getText().lastIndexOf("-") > 0 && edit.getText().charAt(edit.getText().length()-1) != '-' && edit.getText().length() < 9) {
				edit.setText(edit.getText() + ",");
			} else if(contador == 1 && edit.getText().lastIndexOf("+") > 0 && edit.getText().charAt(edit.getText().length()-1) != '+' && edit.getText().length() < 9) {
				edit.setText(edit.getText() + ",");
			} else if(contador == 1 && edit.getText().lastIndexOf("*") > 0 && edit.getText().charAt(edit.getText().length()-1) != '*' && edit.getText().length() < 9) {
				edit.setText(edit.getText() + ",");
			} else if(contador == 1 && edit.getText().lastIndexOf("/") > 0 && edit.getText().charAt(edit.getText().length()-1) != '/' && edit.getText().length() < 9) {
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
			int ultimo = edit.getText().length()-1;
			for(int i = 0;i < edit.getText().length();i++) {
				if(edit.getText().charAt(i) == '+') {
					contadorSoma++;
				} else if(edit.getText().charAt(i) == '-') {
					contadorSub++;
				}
			}
			if((edit.getText().lastIndexOf("-") >= 1 || edit.getText().lastIndexOf("+") >= 1 || edit.getText().lastIndexOf("*") >= 1 || edit.getText().lastIndexOf("/") >= 1) && (edit.getText().charAt(ultimo) != '-' && edit.getText().charAt(ultimo) != '+' && edit.getText().charAt(ultimo) != '*' && edit.getText().charAt(ultimo) != '/')) {
				AcaoBotaoIgual acao = new AcaoBotaoIgual(edit);
				acao.separaNumeros();
				edit.setText(edit.getText() + "+");
			} else if(edit.getText().equals("0")) {
				edit.setText(edit.getText() + "+");
			} else if(contadorSoma < 1 && edit.getText().charAt(0) == '-' && contadorSub == 1 && edit.getText().length() > 1 && edit.getText().length() < 9 && edit.getText().charAt(ultimo) != ',') {
				edit.setText(edit.getText() + "+");
			} else if(contadorSoma < 1 && contadorSub < 1 && edit.getText().length() < 9 && edit.getText().charAt(ultimo) != ',') {
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
	
	public class AcaoBotaoIgual implements ActionListener {
		private JTextField edit;
		private String texto1, texto2;
				
		public AcaoBotaoIgual(JTextField edit) {
			this.edit = edit;
		}
		
		public void separaNumeros() {
			if(edit.getText().lastIndexOf("-") > 0 && edit.getText().length() > edit.getText().lastIndexOf("-")+1) {
				texto1 = edit.getText().substring(0,edit.getText().lastIndexOf("-"));
				texto2 = edit.getText().substring(edit.getText().lastIndexOf("-") + 1);
				Calculo calculo = new Calculo(texto1, texto2);
				edit.setText(calculo.sub());
			} else if(edit.getText().lastIndexOf("+") > 0 && edit.getText().length() > edit.getText().lastIndexOf("+")+1) {
				texto1 = edit.getText().substring(0,edit.getText().lastIndexOf("+"));
				texto2 = edit.getText().substring(edit.getText().lastIndexOf("+") + 1);
				Calculo calculo = new Calculo(texto1, texto2);
				edit.setText(calculo.soma());
			} else if(edit.getText().lastIndexOf("*") > 0 && edit.getText().length() > edit.getText().lastIndexOf("*")+1) {
				texto1 = edit.getText().substring(0,edit.getText().lastIndexOf("*"));
				texto2 = edit.getText().substring(edit.getText().lastIndexOf("*") + 1);
				Calculo calculo = new Calculo(texto1, texto2);
				edit.setText(calculo.mult());
			} else if(edit.getText().lastIndexOf("/") > 0 && edit.getText().length() > edit.getText().lastIndexOf("/")+1) {
				texto1 = edit.getText().substring(0,edit.getText().lastIndexOf("/"));
				texto2 = edit.getText().substring(edit.getText().lastIndexOf("/") + 1);
				Calculo calculo = new Calculo(texto1, texto2);
				edit.setText(calculo.div());
			}
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			separaNumeros();
		}
	}
	
	public class AcaoBotaoBack implements ActionListener {
		private JTextField edit;
		
		public AcaoBotaoBack (JTextField edit) {
			this.edit = edit;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int tamanho = edit.getText().length();
			if(tamanho == 1) {
				edit.setText("0");
			} else {
				String novo;
				novo = edit.getText().substring(0,tamanho-1);
				edit.setText(novo);
			}
		}
	}
}