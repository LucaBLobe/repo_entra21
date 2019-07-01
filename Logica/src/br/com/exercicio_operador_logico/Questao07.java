package br.com.exercicio_operador_logico;

import br.com.util.Teclado;

public class Questao07 {

	public static void main(String[] args) {
		int num1 = Teclado.lerInt("Digite um numero positivo ou negativo: ");
		if (num1 < 0) {
			num1 *= -1;
		}
		System.out.println("O numero em módulo é: " + num1);

	}

}
