package br.com.testes_objetos;

import br.com.orientacao_a_objeto.CartaoDeCredito;

public class TesteCartaoDeCredito {

	public static void main(String[] args) {

		CartaoDeCredito ct1 = new CartaoDeCredito();
		CartaoDeCredito ct2 = new CartaoDeCredito();

		ct1.setNumeroCartao(5335445);
		ct1.setDataValidade("05/26");

		ct2.setNumeroCartao(6445556);
		ct2.setDataValidade("05/27");

		System.out.println("numero: " + ct1.getNumeroCartao());
		System.out.println("validade: " + ct1.getDataValidade() + "\n");

		System.out.println("numero: " + ct2.getNumeroCartao());
		System.out.println("validade: " + ct2.getDataValidade());

	}

}
