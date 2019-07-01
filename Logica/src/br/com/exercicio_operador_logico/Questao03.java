package br.com.exercicio_operador_logico;

import br.com.util.Teclado;

public class Questao03 {
	
	public static void main(String[] args) {
		int numero;
		numero = Teclado.lerInt("digite um numero: ");
		if (numero%2 == 0) {
			System.out.println("O numero é par!");
		}else {
			System.out.println("O numero é Impar!");
		}
		
	}

}
