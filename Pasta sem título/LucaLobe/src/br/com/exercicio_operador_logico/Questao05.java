package br.com.exercicio_operador_logico;

import br.com.util.Teclado;

// Nota: Nos exercicíos de laços existe questão semelhante feita propositalmente com outra lógica.
public class Questao05 {

	public static void main(String[] args) {
		int nota1, nota2, nota3, nota4;
		double media;
		nota1 = Teclado.lerInt("Digite a Primeira nota do aluno");
		nota2 = Teclado.lerInt("Digite a Segunda nota do aluno");
		nota3 = Teclado.lerInt("Digite a Terceira nota do aluno");
		nota4 = Teclado.lerInt("Digite a Quarta nota do aluno");
		media = ((nota1 + nota2 + nota3 + nota4) / 4);
		if (media >= 5) {
			System.out.println("Aluno Aprovado, media " + media);
		}else {
			System.out.println("Aluno Reprovado, media " + media);
		}
	}

}
