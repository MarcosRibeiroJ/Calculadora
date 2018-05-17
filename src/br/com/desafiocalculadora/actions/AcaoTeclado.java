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
		this.up = evt.getKeyCode();
		if(evt.getKeyCode() == 16) {
			this.aux = 1;
		}
		
		System.out.println("Pressed: " + evt.getKeyCode());
		System.out.println("Pressed: " + aux + "\n");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == 16) {
			aux = 0;
		} else if(aux == 0 && e.getKeyCode() == 48 || e.getKeyCode() == 96) {
			edit.setText("0");
		}else if(aux == 0 && e.getKeyCode() == 49 || e.getKeyCode() == 97) {
			edit.setText("1");
		} else if(aux == 0 && e.getKeyCode() == 50 || e.getKeyCode() == 98) {
			edit.setText("2");
		} else if(aux == 0 && e.getKeyCode() == 51 || e.getKeyCode() == 99) {
			edit.setText("3");
		} else if(aux == 0 && e.getKeyCode() == 52 || e.getKeyCode() == 100) {
			edit.setText("4");
		} else if(aux == 0 && e.getKeyCode() == 53 || e.getKeyCode() == 101) {
			edit.setText("5");
		} else if(aux == 0 && e.getKeyCode() == 54 || e.getKeyCode() == 102) {
			edit.setText("6");
		} else if(aux == 0 && e.getKeyCode() == 55 || e.getKeyCode() == 103) {
			edit.setText("7");
		} else if(aux == 0 && e.getKeyCode() == 56 || e.getKeyCode() == 104) {
			edit.setText("8");
		} else if(aux == 0 && e.getKeyCode() == 57 || e.getKeyCode() == 105) {
			edit.setText("9");
		} else if(aux == 1 && e.getKeyCode() == 61 || e.getKeyCode() == 107) {
			edit.setText("+");
		} else if(aux == 0 && e.getKeyCode() == 0 || e.getKeyCode() == 111) {
			edit.setText("/");
		} else if(aux == 1 && up == 56 || e.getKeyCode() == 106) {
			edit.setText("*");
		} else if(aux == 0 && e.getKeyCode() == 45 || e.getKeyCode() == 109) {
			edit.setText("-");
		} else if(aux == 0 && e.getKeyCode() == 44 || e.getKeyCode() == 110) {
			edit.setText(",");
		}
		
		
		System.out.println("Released: " + e.getKeyCode());
		System.out.println("Released: " + aux + "\n");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
