package br.com.testes_objetos;

import br.com.orientacao_a_objeto.CartaoDeCredito;

public class TesteCartaoDeCredito {

	public static void main(String[] args) {

		CartaoDeCredito ct1 = new CartaoDeCredito();
		CartaoDeCredito ct2 = new CartaoDeCredito();

		ct1.numeroCartao = 5335445;
		ct1.dataValidade = "05/26";

		ct2.numeroCartao = 6445556;
		ct2.dataValidade = "05/27";

		System.out.println("numero: " + ct1.numeroCartao);
		System.out.println("validade: " + ct1.dataValidade + "\n");

		System.out.println("numero: " + ct2.numeroCartao);
		System.out.println("validade: " + ct2.dataValidade);

	}

}
