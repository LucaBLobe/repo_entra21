package br.com.exercicio;

import br.com.util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		int resultado = 0;
		int base;
		int exp;
		base = Teclado.lerInt("Digiti o valor da base: ");
		exp = Teclado.lerInt("Digiti o valor da base: ");
		resultado = base;
		for (int i = 0; i < (exp-1); i++) {
			resultado = resultado * base;
			

		}
		System.out.println(resultado);
	}

}
