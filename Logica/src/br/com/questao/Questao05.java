package br.com.questao;

import br.com.util.Teclado;

public class Questao05 {
	public static void main(String[] args) {
		
		double salario;
		salario = Teclado.lerDouble("Digite seu Salario: ");
		System.out.println("seu salario com aumento de 15% = R$"+ (salario*1.15));
		
		
		
	}

}
