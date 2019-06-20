package br.com.orientacao_a_objeto;

public class TesteAgencia {

	public static void main(String[] args) {
		Agencia ramiro = new Agencia();
		Agencia centro = new Agencia();
		
		ramiro.numeroAgencia = 15;
		centro.numeroAgencia = 25;
		
		System.out.println("Agencia: "+ ramiro.numeroAgencia +"\n");
		System.out.println("Agencia: "+ centro.numeroAgencia +"\n");
		

	}

}
