package br.com.desafiocalculadora.exemplos;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * Criei essa classe para testar um novo layout que o JTextArea não mudasse o tamnho conforme fosse digitando,
 * descobri que posso deixar sem nenhum gerenciador de layout e isso resolve o problema
 * https://www.youtube.com/watch?v=Ya_uICPWC4w
 * Pesquisar DefaultStyledDocument para limitar o numero de caracteres do JTextArea
 * https://stackoverflow.com/questions/13863795/enforce-max-characters-on-swing-jtextarea-with-a-few-curve-balls
 * http://respostas.guj.com.br/51922-validar-campos-jtextfield 
 * @author Markinho
 */

public class TesteNovoLayout implements KeyListener{
	private JFrame tela = new JFrame("Teste");
	private JTextField edit = new JTextField();
	private JButton botao1 = new JButton("teste");
	
	public TesteNovoLayout() {
		tela.setVisible(true);
		tela.setSize(300, 350);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		edit.setBounds(15, 10, 200, 100);//quanto se distancia da esquerda para direita, quanto se distancia de cima pra baixo, largura do objeto, altura do objeto
		botao1.setBounds(10, 120, 100, 35);
		Font fonte = new Font("arial",1,50);
		edit.setHorizontalAlignment(JTextField.RIGHT);
		edit.setFont(fonte);
		tela.add(edit);
		tela.add(botao1);
		edit.addKeyListener(this);
	}
	
	
	public static void main(String[] args) {
		new TesteNovoLayout();

	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		int valor = e.getKeyCode();
		if(valor == 110) {
			System.out.println("apertei a virgula do Numpad");
			if(edit.getText().equals("")) {
				edit.setText("");
			} else {
				edit.setText(edit.getText().concat(","));
			}
		} else if(valor == 44) {
			System.out.println("apertei a virgula do Teclado");
			edit.setText(",");
		} else {
			System.out.println(valor);
		}
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
