package br.com.exercicios02;

import br.com.util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		int numero = 51;
		int produto = 1;
		int mult = 0;
		while (numero > 50) {
			numero = Teclado.lerInt("Digite um numero menor que 50");
		}
		while (produto <= 250) {
			mult += 3;
			produto = (numero*mult);
			if (produto < 250) {
				System.out.println("Produto: "+produto);
				
				
			}
			
		}
		
	}

}
