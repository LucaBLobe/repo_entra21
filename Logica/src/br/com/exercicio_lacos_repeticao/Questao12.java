package br.com.exercicio_lacos_repeticao;

public class Questao12 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
	
				System.out.print("\n");
	
			for (int j = 1; j <= 10; j++) {
				
				if (i >= j) {
				
					System.out.print("x-x ");
					
				}else {
					System.out.print(i + "-" + j+" ");
				}
				

			}
		}

	}

}
