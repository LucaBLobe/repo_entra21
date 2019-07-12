package br.com.exercicio;

import br.com.util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
	
		int qtd;
		int soma = 0;
		qtd = Teclado.lerInt("Digiti até que numero deve somar: ");
		
		for (int i = 1; i <= qtd; i++) {
			soma += i; 
		}		
		System.out.println("a soma de todos é: "+ soma);
	}

}
