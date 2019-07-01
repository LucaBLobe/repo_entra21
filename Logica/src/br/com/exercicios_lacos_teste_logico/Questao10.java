package br.com.exercicios_lacos_teste_logico;

import br.com.util.Teclado;

public class Questao10 {
	
	public static void main(String[] args) {
		double base = Teclado.lerInt("Digite um numero: ");
		double produto = 1;
		for (int i = 1; i <= 15; i++) {
			produto *= base;
			System.out.println(produto);
		}
	}

}
