package br.com.questao;

import br.com.util.Teclado;

public class Questao04 {
	
	public static void main(String[] args) {
		int numero;
		
		numero = Teclado.lerInt("Qual numero quer verificar o antecessor e o sucessor? ");
		System.out.println("O antecessor �: " +(numero-1));
		System.out.println("O sr �: " +(numero+1));
		
	}

}
