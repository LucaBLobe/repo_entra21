package br.com.exercicio;

import br.com.util.Teclado;

public class Questao15 {

	public static void main(String[] args) {
		String nome;
		double salBruto = 0.0;
		double salLiquido = 0.0;
		double imposto = 0.0;
		for (int i = 1; i <= 3; i++) {
			nome = Teclado.lerTexto("Digite o nome do " + i + "º funcionario: ");
			salBruto = Teclado.lerDouble("Digite o seu salario bruto: ");
			if (salBruto <= 600.0) {
				imposto = 0.0;
				salLiquido = salBruto;
			}
			if (salBruto > 600.0 && salBruto < 1500) {
				imposto = 10.0;
				salLiquido = (salBruto*(imposto/100));
			}
			if (salBruto >= 1500) {
				imposto = 15.0;
				salLiquido = (salBruto*(imposto/100));
			}
			System.out.println("Nome: "+ nome +"\n"+"Aliquota de Imposto: "+ imposto +"\n"+"Salario Limpo: R$"+salLiquido);
		}

	}

}
