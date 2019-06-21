package br.com.testes_objetos;

import br.com.orientacao_a_objeto.Agencia;
import br.com.orientacao_a_objeto.Conta;

public class TesteContaAgencia {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		Agencia agenciaNova = new Agencia();
		agenciaNova.numeroAgencia = 15;

		c1.numero = 10001;
		c2.numero = 10002;
		c1.saldo = 1000;
		c2.saldo = 2000;
		c1.limite = 1500;
		c2.limite = 3000;
		c1.agencia = agenciaNova;
		c2.agencia = agenciaNova;

		System.out.println("Numero: " + c1.numero);
		System.out.println("saldo: " + c1.saldo);
		System.out.println("limite: " + c1.limite);
		System.out.println("Numero Agencia: " + c1.agencia.numeroAgencia + "\n");

		System.out.println("Numero: " + c2.numero);
		System.out.println("saldo: " + c2.saldo);
		System.out.println("limite: " + c2.limite);
		System.out.println("Numero Agencia: " + c2.agencia.numeroAgencia);

	}

}