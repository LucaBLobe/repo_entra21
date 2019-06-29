package br.com.exercicios02;

import br.com.util.Teclado;

public class Questao11 {

	public static void main(String[] args) {
		double b = Teclado.lerInt("Digite o numero base: ");
		double e = Teclado.lerInt("Digite o expoente: ");
		double produto = 1;
		for (int i = 1; i <= e; i++) {
			produto *= b;
			System.out.println("O produto é: "+produto);
		}
	//	System.out.println("O produto é: "+produto);
	}
}
