package br.com.exercicio_operador_logico;

import br.com.util.Teclado;

public class Questao11 {

	public static void main(String[] args) {
		int num1;
		num1 = Teclado.lerInt("Digite um numero de 3 algarismos:");
		num1 /= 100;
		System.out.println("O numero da centena é: "+ num1);
	}

}
