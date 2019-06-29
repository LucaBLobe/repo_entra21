package br.com.exercicios02;

public class Questao15 {
	public static void main(String[] args) {
		int fibonacci = 1;
		System.out.println("Seguencia de Fibonacci até o 15º termo. \n");
		for (int i = 1; i <= 15; i++) {
			fibonacci += (i-1)+(i-2);
			System.out.print(fibonacci+", ");
		}
		System.out.println("...");
	}

}
