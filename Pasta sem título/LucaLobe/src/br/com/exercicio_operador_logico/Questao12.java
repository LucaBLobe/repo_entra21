package br.com.exercicio_operador_logico;

import java.util.Arrays;

import br.com.util.Teclado;

public class Questao12 {
	public static void main(String[] args) {
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = Teclado.lerInt("Digite um numero: ");
		}
		Arrays.sort(num);
		System.out.println("O menor: " + num[0]);
		System.out.println("O maior: " + num[4]);
	}

}
