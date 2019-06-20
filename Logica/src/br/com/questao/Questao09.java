package br.com.questao;

import br.com.util.Teclado;

public class Questao09 {
	
	public static void main(String[] args) {
		
		double numero = Teclado.lerDouble("Qual número deseja saber o quadrado e a raiz: ");
		System.out.println("o proprio número é: "+ numero);
		System.out.println("o Quadrado é: "+ Math.pow(numero,2));
		System.out.println("a raiz é: "+ Math.sqrt(numero));
		
	}

}
