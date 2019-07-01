package br.com.exercicios_lacos_teste_logico;

public class Questao15 {
	public static void main(String[] args) {
		int fibonacci = 0;
		System.out.println("Seguencia de Fibonacci até o 15º termo. \n");
		
		
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		int fiboancci = 1;
		
		for (int i = 1; i <= 15; i++) {
			System.out.print(fibonacci +", ");
			n3 = n1 + n2;
			fibonacci = n3;
			n1 = n2;
			n2 = n3;				
		}
	}
}
		
		

