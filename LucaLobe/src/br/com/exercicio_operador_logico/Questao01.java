package br.com.exercicio_operador_logico;

import br.com.util.Teclado;

public class Questao01 {

	public static void main(String[] args) {

		int numero;
		numero = Teclado.lerInt("Digite um numero,\n caso ele seja maior que 20, retornar a metade.");
		if (numero > 20) {
			numero /= 2;
			System.out.println("Numero:" + numero);

		} else {
			System.out.println("Numero:" + numero);
		}

	}

}
