package br.com.exercicio_operador_logico;

import br.com.util.Teclado;

public class Questao04 {

	public static void main(String[] args) {
		int numero;
		numero = Teclado.lerInt("digite um numero: ");
		if (numero%4 == 0 && numero%5 == 0) {
			System.out.println("O numero "+ numero + " é divisivel por 4 e 5!");
		}else {
			System.out.println("O numero não é divisivel por 4 e 5");
		}
		
	}

}
