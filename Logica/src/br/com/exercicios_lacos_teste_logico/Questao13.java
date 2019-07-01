package br.com.exercicios_lacos_teste_logico;

public class Questao13 {

	public static void main(String[] args) {
		int mult;
		for (int i = 3; i <= 6; i++) {
			for (int j = 0; j <= 10; j++) {
				mult = i * j;
				if (j == 10) {
					System.out.println(i + " x " + j + " = " + mult);
					System.out.println("");
				} else {
					System.out.println(i + " x " + j + " = " + mult);
				}

			}

		}
	}

}
