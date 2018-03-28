package br.com.desafiocalculadora.filtros;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * Classe criada para filtrar a entrada de dados no campo de digita��o
 * Com essa classe posso restringir o que o usu�rio ir� digitar, permitindo somente:
 * Numerais de 0-9 e os digitos das ipera��es (soma, subtra��o, divis�o e multiplica��o)
 * @author Marcos Ribeiro
 */

@SuppressWarnings("serial")
public class TeclasPermitidas extends PlainDocument {
	
	//Criar um regex para:
	
	/**
	 * Talvez a solu��o nao seja essa clase que criei, talvez eu deva usar um campo JFormattedTextField como double
	 * https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/components/FormattedTextFieldDemoProject/src/components/FormattedTextFieldDemo.java**/
	
	@Override
	public void insertString(int offset, String teclasPermitidas, javax.swing.text.AttributeSet attr) throws BadLocationException {
		super.insertString(offset, teclasPermitidas.replaceAll("[^0-9]",""), attr);
	}
	
	public void replace(int offset, String teclasPermitidas, javax.swing.text.AttributeSet attr) throws BadLocationException {
		super.insertString(offset, teclasPermitidas.replaceAll("[^0-9]",""), attr);
	}

}
