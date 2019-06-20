package br.com.questao;

import br.com.util.Teclado;

public class Questao07 {
	
	public static void main(String[] args) {
		
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;

		
		n1 = Teclado.lerInt("Digite o primeiro numemo: ");
		n2 = Teclado.lerInt("Digite o segundo numemo: ");
		n3 = Teclado.lerInt("Digite o terceiro numemo: ");
		
		System.out.println("a média aritmética dos numeros digitados é: "+ (n1+n2+n3)/3);

		
		
	}

}
