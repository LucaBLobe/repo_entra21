package br.com.questao;

import br.com.util.Teclado;

public class Questao06 {
	
	public static void main(String[] args) {
		
		double temp;
		temp = Teclado.lerDouble("Digite a temperatura em Fahrenheit: ");
		System.out.println("A temperatira em Celsius: "+ (((temp -32)*5)/9));
		
	}

}
