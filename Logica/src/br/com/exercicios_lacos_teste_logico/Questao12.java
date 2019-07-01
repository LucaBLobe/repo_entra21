package br.com.exercicios_lacos_teste_logico;

import br.com.util.Teclado;

public class Questao12 {

	public static void main(String[] args) {
		int numero = 0;
		int divisor = 0;
		int maior = 0;
		int menor = 0;
		double media = 0;
		

		System.out.print("Digite quantos numeros desejar, e use '-1' para sair. \nE veja os resultados de media, maior e menor numero.\"");
		
		do {
	
			if (numero != -1) {
				media += numero;
				divisor++;
				if (divisor == 1) {
					menor = numero;
					maior = numero;
				} else if (numero < menor) {
					menor = numero;
				} else if (numero> maior) {
					maior = numero;
}
			}
		} while (numero != -1);
		media /= divisor;
		
		System.out.println("O maior:" + maior);
		System.out.println("O menor:" + menor);
		System.out.println("A media:" + media);

	}

}
