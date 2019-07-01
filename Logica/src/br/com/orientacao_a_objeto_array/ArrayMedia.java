package br.com.orientacao_a_objeto_array;

import java.util.Arrays;

public class ArrayMedia {
	
	public static void main(String[] args) {
		int[] numeros = {199,87,250,55};
		int soma = 0;
		double media;
		for (int i = 0; i < numeros.length; i++) {
		soma += numeros[i];	
		System.out.println(numeros[i]);
		}
		media = (soma/numeros.length);
		System.out.println(" ");
		System.out.println("media: "+ media);
			
		
		
		}

	}