package br.com.exercicio;

import br.com.util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		String nome;
		int idade;
		String sexo;

		for (int i = 1; i <= 2; i++) {
			nome = Teclado.lerTexto("Digite seu nome: ");
			idade = Teclado.lerInt("Digite sua idade: ");
			sexo = Teclado.lerTexto("Digite seu sexo M/F: ");
			if (sexo == "M" && idade >= 21) {
				System.out.println("Nome: " + nome);
				System.out.println("Idade: " + idade);
				System.out.println("Sexo: " + sexo);

			}

		}

	}

}
