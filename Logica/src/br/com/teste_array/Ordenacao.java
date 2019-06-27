package br.com.teste_array;

import java.util.Arrays;

public class Ordenacao {
	public static void main(String[] args) {
		String[] nomes = new String[] {"luca","Baraldi","lobe"};
		
		Arrays.sort(nomes);
		
		for(String nome : nomes) {
			System.out.println(nome);
			
		}
		
		
	}
	

}
