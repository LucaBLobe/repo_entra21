package br.com.testes_objetos;

import br.com.orientacao_a_objeto.Agencia;

public class TesteAgencia {

	public static void main(String[] args) {
		Agencia ramiro = new Agencia(0);
		Agencia centro = new Agencia(0);
		
		
		ramiro.numeroAgencia = 15;
		centro.numeroAgencia = 25;
		
		System.out.println("Agencia: "+ ramiro.numeroAgencia +"\n");
		System.out.println("Agencia: "+ centro.numeroAgencia +"\n");
		

	}

}