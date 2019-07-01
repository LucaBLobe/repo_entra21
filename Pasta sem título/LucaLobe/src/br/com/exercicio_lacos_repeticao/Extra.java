package br.com.exercicio_lacos_repeticao;


	import br.com.util.Teclado;

	public class Extra {

		public static void main(String[] args) {
			
			String[] nome = new String[2];
			double[] salario = new double[2];
			
			for (int i = 0; i < nome.length; i++) {
				nome[i] = Teclado.lerTexto("Digite o nome: ");
				salario[i] = Teclado.lerDouble("Digite o salário: ");
			}
			
			for (int i = 0; i < nome.length; i++) {
				System.out.println(nome[i]);
				if (salario[i] < 600.00) {
					System.out.println("Isento");
					System.out.println(salario[i]);
				}
				else if(salario[i] <= 1499.99) {
					double salarioDesconto = salario[i] - (salario[i] * 0.1);
					System.out.println("Alíquota 10%.");
					System.out.println(salarioDesconto);				
				}
				else {
					double salarioDesconto = salario[i] - (salario[i] * 0.15);
					System.out.println("Alíquota 15%.");
					System.out.println(salarioDesconto);								
				}
			}				
		}
	}