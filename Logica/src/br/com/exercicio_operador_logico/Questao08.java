package br.com.exercicio_operador_logico;

import br.com.util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		int num1 = Teclado.lerInt("Digite um numero: ");
		if (num1 >= 1 && num1 <= 10) {
			System.out.println("O numero " + num1 + " está no intervalo entre 1 e 10.");
		} else {
			System.out.println("O numero " + num1 + " NÃO está no intervalo entre 1 e 10.");
		}

	}

}
