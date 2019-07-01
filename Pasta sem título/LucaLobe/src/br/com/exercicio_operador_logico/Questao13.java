package br.com.exercicio_operador_logico;

import br.com.util.Teclado;

public class Questao13 {

	public static void main(String[] args) {
		int a = Teclado.lerInt("digite o valor da variável 'a': ");
		int b = Teclado.lerInt("digite o valor da variável 'b': ");
		int c = Teclado.lerInt("digite o valor da variável 'c': ");
		int segundo;
		int maior;
		int terceiro;
		if (a > b && b > c) {
			maior = a;
			segundo = b;
			terceiro = c;
		}

		if (a > b && c > b) {
			maior = a;
			segundo = c;
			terceiro = b;
		} else if (b > c && c > a) {
			maior = b;
			segundo = c;
			terceiro = a;
		} else if (b > c && a > c) {
			maior = b;
			segundo = a;
			terceiro = c;
		} else if (c > b && a > b) {
			maior = c;
			segundo = a;
			terceiro = b;
		} else {
			maior = c;
			segundo = b;
			terceiro = a;
		}
		System.out.println("maior: "+maior);
		System.out.println("O segundo maior: "+segundo);
		System.out.println("O terceiro maior: "+terceiro);
	}
}
