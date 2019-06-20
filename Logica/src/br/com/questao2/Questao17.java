package br.com.questao2;

import br.com.util.Teclado;

public class Questao17 {
	public static void main(String[] args) {
		
		double valConta;
		int Nprestacao;
		double valPrestacao;
		
		valConta = Teclado.lerDouble("Qual o valor da compra: ");
		Nprestacao = Teclado.lerInt("Quantas prestações deseja:? ");
		
		valPrestacao = (valConta/Nprestacao);
		
		System.out.println(Nprestacao+" vezes de R$" + valPrestacao);
	
		
		
	}

}
