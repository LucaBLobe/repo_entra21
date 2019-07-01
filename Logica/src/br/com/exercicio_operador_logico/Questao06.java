package br.com.exercicio_operador_logico;

import br.com.util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		int num1 = Teclado.lerInt("Digite o primeiro numero");
		int num2 = Teclado.lerInt("Digite o segundo numero");
		int dif;
		if (num1 >= num2) {
			dif = (num1 - num2);
		} else {
			dif = (num2 - num1);
		}
		System.out.println("a diferença ente os numeros é: " + dif);

	}

}
