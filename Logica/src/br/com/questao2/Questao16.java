package br.com.questao2;

import br.com.util.Teclado;

public class Questao16 {
	
	public static void main(String[] args) {

		String nome;
		double salFixo;
		double valorVendas;
		double comissao;
		double salTotal;
		
		nome = Teclado.lerTexto("Nome do funcionario: ");
		salFixo = Teclado.lerDouble("Salario fixo: ");
		valorVendas = Teclado.lerDouble("Valor em vendas no mês");
		
		comissao = valorVendas*0.15;
		salTotal = salFixo+comissao; 
		
		System.out.println("Nome: "+ nome);
		System.out.println("Salario: R$"+ salFixo);
		System.out.println("comissão: R$"+ comissao);
		System.out.println("Salario Total: R$"+ salTotal);
	}
	

}
