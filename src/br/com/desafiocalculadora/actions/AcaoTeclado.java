package br.com.desafiocalculadora.actions;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;

/**
 * Classe criada para realizar as acoes de inserir digitos no visor da calculadora
 * O visor ficara bloqueado, entao o evento de inserir um digito só será ativado quando
 * a tecla correta for pressionada
 * @author Marcos Ribeiro
 */

public class AcaoTeclado implements KeyListener {
	private JTextField edit;
	private int up, aux = 0;
		
	public AcaoTeclado(JTextField edit) {
		this.edit = edit;
	}

	@Override
	public void keyPressed(KeyEvent evt) {
		//recebendo um valor e armazenando em variavel toda vez que o shift eh pressionado
		this.up = evt.getKeyCode();
		if(evt.getKeyCode() == 16) {
			this.aux = 1;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//verificando se o shift ja foi liberado e para cada codigo de tecla, inserindo seu valor correspondente
		//a barra e o ponto tem um codigo diferente caso sejam usada pelo num lock ou teclado,
		//para conseguir distinguir ambos, usei o getExtendedKeyCode
		if(e.getKeyCode() == 16) {
			aux = 0;
		} else if(aux == 0 && e.getKeyCode() == 48 || e.getKeyCode() == 96) {
			formataZero();
		}else if(aux == 0 && e.getKeyCode() == 49 || e.getKeyCode() == 97) {
			formataUm();
		} else if(aux == 0 && e.getKeyCode() == 50 || e.getKeyCode() == 98) {
			formataDois();
		} else if(aux == 0 && e.getKeyCode() == 51 || e.getKeyCode() == 99) {
			formataTres();
		} else if(aux == 0 && e.getKeyCode() == 52 || e.getKeyCode() == 100) {
			formataQuatro();
		} else if(aux == 0 && e.getKeyCode() == 53 || e.getKeyCode() == 101) {
			formataCinco();
		} else if(aux == 0 && e.getKeyCode() == 54 || e.getKeyCode() == 102) {
			formataSeis();
		} else if(aux == 0 && e.getKeyCode() == 55 || e.getKeyCode() == 103) {
			formataSete();
		} else if(aux == 0 && e.getKeyCode() == 56 || e.getKeyCode() == 104) {
			formataOito();
		} else if(aux == 0 && e.getKeyCode() == 57 || e.getKeyCode() == 105) {
			formataNove();
		} else if(aux == 1 && e.getKeyCode() == 61 || e.getKeyCode() == 107) {
			formataSoma();
		} else if(aux == 0 && e.getKeyCode() == KeyEvent.VK_SLASH || e.getKeyCode() == 111 || e.getExtendedKeyCode() == 47) {
			formataDiv();
		} else if(aux == 1 && up == 56 || e.getKeyCode() == 106) {
			formataMulti();
		} else if(aux == 0 && e.getKeyCode() == 45 || e.getKeyCode() == 109) {
			formataSub();
		} else if(aux == 0 && e.getKeyCode() == 44 || e.getKeyCode() == 110 || e.getExtendedKeyCode() == 46) {
			formataVirgula();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	//Metodos para acrescentar numeros quando digitados
	public void formataZero() {
		if(edit.getText().equals("0")) {
			edit.setText("0,");
		} else {
			edit.setText(edit.getText() + "0");
		}
	}
	
	public void formataUm() {
		if(edit.getText().equals("0")) {
			edit.setText("1");
		} else {
			edit.setText(edit.getText() + "1");
		}
	}
	
	public void formataDois() {
		if(edit.getText().equals("0")) {
			edit.setText("2");
		} else {
			edit.setText(edit.getText() + "2");
		}
	}
	
	public void formataTres() {
		if(edit.getText().equals("0")) {
			edit.setText("3");
		} else {
			edit.setText(edit.getText() + "3");
		}
	}
	
	public void formataQuatro() {
		if(edit.getText().equals("0")) {
			edit.setText("4");
		} else {
			edit.setText(edit.getText() + "4");
		}
	}
	
	public void formataCinco() {
		if(edit.getText().equals("0")) {
			edit.setText("5");
		} else {
			edit.setText(edit.getText() + "5");
		}
	}
	
	public void formataSeis() {
		if(edit.getText().equals("0")) {
			edit.setText("6");
		} else {
			edit.setText(edit.getText() + "6");
		}
	}
	
	public void formataSete() {
		if(edit.getText().equals("0")) {
			edit.setText("7");
		} else {
			edit.setText(edit.getText() + "7");
		}
	}
	
	public void formataOito() {
		if(edit.getText().equals("0")) {
			edit.setText("8");
		} else {
			edit.setText(edit.getText() + "8");
		}
	}
	
	public void formataNove() {
		if(edit.getText().equals("0")) {
			edit.setText("9");
		} else {
			edit.setText(edit.getText() + "9");
		}
	}
	
	public void formataVirgula() {
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
		} else if(contador == 0 && edit.getText().charAt(edit.getText().length()-1) != '-' && edit.getText().charAt(edit.getText().length()-1) != '+' && edit.getText().charAt(edit.getText().length()-1) != '*' && edit.getText().charAt(edit.getText().length()-1) != '/') {
			edit.setText(edit.getText() + ",");
		} else if(contador == 1 && edit.getText().lastIndexOf("-") <= 0 && edit.getText().lastIndexOf("+") < 0 &&  edit.getText().lastIndexOf("*") < 0 && edit.getText().lastIndexOf("/") < 0) {
			edit.setText(edit.getText());
		} else if(contador == 1 && edit.getText().lastIndexOf("-") > 0 && edit.getText().charAt(edit.getText().length()-1) != '-') {
			edit.setText(edit.getText() + ",");
		} else if(contador == 1 && edit.getText().lastIndexOf("+") > 0 && edit.getText().charAt(edit.getText().length()-1) != '+') {
			edit.setText(edit.getText() + ",");
		} else if(contador == 1 && edit.getText().lastIndexOf("*") > 0 && edit.getText().charAt(edit.getText().length()-1) != '*') {
			edit.setText(edit.getText() + ",");
		} else if(contador == 1 && edit.getText().lastIndexOf("/") > 0 && edit.getText().charAt(edit.getText().length()-1) != '/') {
			edit.setText(edit.getText() + ",");
		}
	}
	
	public void formataSoma( ) {
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
	
	public void formataSub( ) {
		int contador;
		contador = 0;
		
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
	
	public void formataMulti() {
		if(edit.getText().indexOf("*") < 0) {
			edit.setText(edit.getText() + "*");
		} else {
			edit.setText(edit.getText());
		}
	}
	
	public void formataDiv() {
		if(edit.getText().indexOf("/") < 0) {
			edit.setText(edit.getText() + "/");
		} else {
			edit.setText(edit.getText());
		}
	}

}
