package br.com.exercicios_lacos_teste_logico;

import br.com.util.Teclado;

public class Questao05 {
	
	public static void main(String[] args) {
		
		int numero;
		int mult;
		numero = Teclado.lerInt("qual numero deseja ver a tabuada: ");
		for (int i = 1; i <= 10; i++) {
			mult = (i*numero);
			System.out.println(numero+"."+i+" = "+mult);
			
			
		}
		
	}

}
