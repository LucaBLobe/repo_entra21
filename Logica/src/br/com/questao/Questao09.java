package br.com.questao;

import br.com.util.Teclado;

public class Questao09 {
	
	public static void main(String[] args) {
		
		double numero = Teclado.lerDouble("Qual n�mero deseja saber o quadrado e a raiz: ");
		System.out.println("o proprio n�mero �: "+ numero);
		System.out.println("o Quadrado �: "+ Math.pow(numero,2));
		System.out.println("a raiz �: "+ Math.sqrt(numero));
		
	}

}
