package br.com.exercicios02;

import br.com.util.Teclado;

public class Questao05 {
	
	public static void main(String[] args) {
		
		int numero;
		int mult;
		numero = Teclado.lerInt("qual numero deseja ver a tabela: ");
		for (int i = 1; i <= 10; i++) {
			mult = (i*numero);
			System.out.println(numero+"."+i+" = "+mult);
			
			
		}
		
	}

}
