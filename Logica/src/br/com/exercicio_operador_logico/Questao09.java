package br.com.exercicio_operador_logico;

import br.com.util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
		int num1 = Teclado.lerInt("Digite um numero positivo ou negativo: ");
		if (num1 < 0) {
			System.out.println("O numero " + num1 + " é negativo.");
		}else {
			System.out.println("O numero " + num1 + " é positivo.");
		}
		
	}

}
