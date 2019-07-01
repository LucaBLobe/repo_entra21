package br.com.exercicios_lacos_teste_logico;

public class Questao09 {

	public static void main(String[] args) {
		int soma = 0;
		for (int i = 1; i < 500; i++) {
			if (i % 2 == 0) {
				soma += i;

			}

		}
		System.out.println(soma);
	}

}
