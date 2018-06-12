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
			edit.setText("7");
		}
	}
	
	public class AcaoBotao8 implements ActionListener {
		private JTextField edit;
		
		public AcaoBotao8 (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			edit.setText("8");
		}
	}
	
	public class AcaoBotao9 implements ActionListener {
		private JTextField edit;
		
		public AcaoBotao9 (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			edit.setText("9");
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
			edit.setText("4");
		}
	}
	
	public class AcaoBotao5 implements ActionListener {
		private JTextField edit;
		
		public AcaoBotao5 (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			edit.setText("5");
		}
	}
	
	public class AcaoBotao6 implements ActionListener {
		private JTextField edit;
		
		public AcaoBotao6 (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			edit.setText("6");
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
			edit.setText("1");
		}
	}
	
	public class AcaoBotao2 implements ActionListener {
		private JTextField edit;
		
		public AcaoBotao2 (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			edit.setText("2");
		}
	}
	
	public class AcaoBotao3 implements ActionListener {
		private JTextField edit;
		
		public AcaoBotao3 (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			edit.setText("3");
		}
	}
	
	public class AcaoBotaoSub implements ActionListener {
		private JTextField edit;
		
		public AcaoBotaoSub (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			edit.setText("-");
		}
	}
	
	public class AcaoBotao0 implements ActionListener {
		private JTextField edit;
		
		public AcaoBotao0 (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			edit.setText("0");
		}
	}
	
	public class AcaoBotaoVirgula implements ActionListener {
		private JTextField edit;
		
		public AcaoBotaoVirgula (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			edit.setText(",");
		}
	}
	
	public class AcaoBotaoSoma implements ActionListener {
		private JTextField edit;
		
		public AcaoBotaoSoma (JTextField edit) {
			this.edit = edit;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			edit.setText("+");
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