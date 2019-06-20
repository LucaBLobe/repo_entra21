package br.com.questao;

import br.com.util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		
		n1 = Teclado.lerInt("Digite o primeiro numemo: ");
		n2 = Teclado.lerInt("Digite o segundo numemo: ");
		n3 = Teclado.lerInt("Digite o terceiro numemo: ");
		n4 = Teclado.lerInt("Digite o quarto numemo: ");
		
		System.out.println("A soma dos 4 numeros é: "+ (n1+n2+n3+n4));
		System.out.println("A soma dos 4 numeros é: "+ (n1*n2*n3*n4));
	}

}
