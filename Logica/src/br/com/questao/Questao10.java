package br.com.questao;

import br.com.util.Teclado;

public class Questao10 {
	
	public static void main(String[] args) {
		double valor = Teclado.lerDouble("digite o valor da presta��o: ");
		double taxa = Teclado.lerDouble("Digite o valor da taxa de juros ao dia, em porcentagem");
		double diasAtraso = Teclado.lerDouble("Digite o valor da taxa de juros");
		System.out.println("A sua presta��o com juros �: R$"+ (valor + (valor *(taxa / 100) * diasAtraso)));
		 
		
	}

}
