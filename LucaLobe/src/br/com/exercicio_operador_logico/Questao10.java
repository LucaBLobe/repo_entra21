package br.com.exercicio_operador_logico;

import br.com.util.Teclado;

public class Questao10 {
	
	public static void main(String[] args) {
		int num1 = Teclado.lerInt("Digite o primeiro numero: ");
		int num2 = Teclado.lerInt("Digite o segundo numero: ");
		if (num1%num2 == 0) {
			System.out.println("O numero "+ num2 +" é divisor do numero "+num1+".");
		}else {
			System.out.println("O numero "+ num2 +" NÃO é divisor do numero "+num1+".");
		}
		
	}
	
}
