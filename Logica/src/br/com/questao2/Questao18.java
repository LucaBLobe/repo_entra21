package br.com.questao2;

import br.com.util.Teclado;

public class Questao18 {
	
	public static void main(String[] args) {
		
		double custo;
		double acrecimo;
		double preco;
		
		custo = Teclado.lerDouble("Qual o custo: ");
		acrecimo = Teclado.lerInt("Qual o acr�cimo: ");
		acrecimo = acrecimo/100;
		preco = custo +(custo*acrecimo); 
		
		System.out.println("O custo �: "+ custo);
		System.out.println("O acr�cimo �: "+ acrecimo);
		System.out.println("O pre�o total �: "+ preco);
		
		
	}

}
