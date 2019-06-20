package br.com.questao2;

import br.com.util.Teclado;

public class Questao18 {
	
	public static void main(String[] args) {
		
		double custo;
		double acrecimo;
		double preco;
		
		custo = Teclado.lerDouble("Qual o custo: ");
		acrecimo = Teclado.lerInt("Qual o acrécimo: ");
		acrecimo = acrecimo/100;
		preco = custo +(custo*acrecimo); 
		
		System.out.println("O custo é: "+ custo);
		System.out.println("O acrécimo é: "+ acrecimo);
		System.out.println("O preço total é: "+ preco);
		
		
	}

}
