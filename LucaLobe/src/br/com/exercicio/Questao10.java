package br.com.exercicio;

import br.com.util.Teclado;

public class Questao10 {
	
	public static void main(String[] args) {
		
		int fat;
		int numero = 0;
		numero = Teclado.lerInt("Digite um numero para fatorial");
		fat = numero;
		for (int i = (numero-1); i >= 1; i--) {
			fat *= i;
		}
		System.out.println(fat);
		
	}

}
