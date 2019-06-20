package br.com.questao2;

import br.com.util.Teclado;

public class Questao11 {
	
	public static void main(String[] args) {
		
		double conta;
		double contaTotal;
		conta = Teclado.lerDouble("Digite o valor da conta: ");
		contaTotal= conta +(conta* 0.1);
		System.out.println("O Valor total da conta com o adicional do garçom é: R$"+ contaTotal);
		
		
		
	}

}
