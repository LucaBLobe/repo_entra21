package br.com.exercicio_lacos_repeticao;

import br.com.util.Teclado;

public class Questao15 {

	public static void main(String[] args) {
		String[] nome = new String[10];
		double[] salBruto = new double[10];
		double salLiquido = 0.0;
	

		for (int i = 1; i < nome.length; i++) {
			nome[i] = Teclado.lerTexto("Digite o nome do " + i + "º funcionario: ");
			salBruto[i] = Teclado.lerDouble("Digite o seu salario bruto: ");
		}

		for (int i = 1; i <= nome.length; i++) {
		
			if (salBruto[i] <= 600.0) {
				System.out.println("nome do funcionario: " + nome[i]);
				salLiquido = salBruto[i];
				System.out.println("Aliquota de Imposto: 0%" + "Salario final: "+salLiquido
						);
			}
			if (salBruto[i] > 600.0 && salBruto[i] < 1500) {
				System.out.println("nome do funcionario: " + nome[i]);
				salLiquido = (salBruto[i] * 0.1);
				System.out.println("Aliquota de Imposto: 0%" + "Salario final: "+salLiquido
						);
			
			}
			if (salBruto[i] >= 1500) {
				System.out.println("nome do funcionario: " + nome[i]);
				salLiquido = (salBruto[i] * 0.15);
				System.out.println("Aliquota de Imposto: 0%" + "Salario final: "+salLiquido
						);
			}

		}
	}

}
