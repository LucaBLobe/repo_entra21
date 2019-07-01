package br.com.exercicio_lacos_repeticao;

import br.com.util.Teclado;

public class Questao09 {
	
	public static void main(String[] args) {
		
		int numero;
		numero = Teclado.lerInt("Digite um Numero: ");
		
		for (int i = 1; i < numero; i++) {
			if (i%3 == 0 && i%5 == 0) {
				System.out.println(i);
			}
			
		}
		
	}

}
