package br.com.exercicios02;

import br.com.util.Teclado;

public class Questao10 {
	
	public static void main(String[] args) {
		int base = Teclado.lerInt("Digite um numero: ");
		int produto = 1;
		for (int i = 1; i <= 15; i++) {
			produto *= base;
			System.out.println(produto);
		}
	}

}
