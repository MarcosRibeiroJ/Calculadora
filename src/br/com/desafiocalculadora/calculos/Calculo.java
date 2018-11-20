package br.com.desafiocalculadora.calculos;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Classe criada para realizar as opera��es matem�ticas da calculadora
 * Em todos os m�todos ela recebr� os parametros em formato de texto, convertera os mesmos para n�mero
 * Realizara os calculos necess�rios e converter� novamente o resultado para texto
 * @author Marcos Ribeiro
 */

public class Calculo {
	@SuppressWarnings("unused")
	private String texto1, texto2;
	private double num1, num2;
	
	public Calculo(String texto1, String texto2) {
		this.texto1 = texto1;
		this.texto2 = texto2;
		
		texto1 = texto1.replaceAll(",", ".");
		texto2 = texto2.replaceAll(",", ".");
		num1 = Double.parseDouble(texto1);
		num2 = Double.parseDouble(texto2);
	}
	
	public String soma() {
		if((num1+num2)-(int)(num1+num2) == 0) {
			int total = (int)(num1+num2);
			return Integer.toString(total);
		} else {
			DecimalFormat formato = new DecimalFormat("###.####");
			formato.setRoundingMode(RoundingMode.UP);
			return formato.format(num1+num2).replace(".", ",");
		}
	}
	
	public String sub() {
		if((num1-num2)-(int)(num1-num2) == 0) {
			int total = (int)(num1-num2);
			return Integer.toString(total);
		} else {
			DecimalFormat formato = new DecimalFormat("###.####");
			formato.setRoundingMode(RoundingMode.UP);
			return formato.format(num1-num2).replace(".", ",");
		}
	}
	
	public String mult() {
		if((num1*num2)-(int)(num1*num2) == 0) {
			int total = (int)(num1*num2);
			return Integer.toString(total);
		} else {
			DecimalFormat formato = new DecimalFormat("###.####");
			formato.setRoundingMode(RoundingMode.UP);
			return formato.format(num1*num2).replace(".", ",");
		}
	}
	
	public String div() {
		if(num2 == 0) {
			return "Imposs�vel";
		} else if((num1/num2)-(int)(num1/num2) == 0) {
			int total = (int)(num1/num2);
			return Integer.toString(total);
		}else {
			DecimalFormat formato = new DecimalFormat("###.####");
			formato.setRoundingMode(RoundingMode.UP);
			return formato.format(num1/num2).replace(".", ",");
		}
	}

}
