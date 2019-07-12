package br.com.testes_objetos;

import br.com.orientacao_a_objeto.Agencia;
import br.com.orientacao_a_objeto.Conta;

public class TesteContaAgencia {

	public static void main(String[] args) {
		Conta c1 = new Conta(null);
		Conta c2 = new Conta(null);
		Agencia agenciaNova = new Agencia(0);
		agenciaNova.numeroAgencia = 15;

		c1.setNumero(10001);
		c2.setNumero(10002);
		c1.setSaldo(1000);
		c2.setSaldo(2000);
		c1.setLimite(1500);
		c2.setLimite(3000);
		c1.setAgencia(agenciaNova);
		c2.setAgencia(agenciaNova);

		System.out.println("Numero: " + c1.getNumero());
		System.out.println("saldo c1: " + c1.getSaldo());
		System.out.println("limite: " + c1.getLimite());
		System.out.println("Numero Agencia: " + c1.getAgencia().numeroAgencia + "\n");

		System.out.println("Numero: " + c2.getNumero());
		System.out.println("saldo c2: " + c2.getSaldo());
		System.out.println("limite: " + c2.getLimite());
		System.out.println("Numero Agencia: " + c2.getAgencia().numeroAgencia);
		
		c1.transferencia(c2, 200);
		
		System.out.println("saldo c1: " + c1.getSaldo());
		System.out.println("saldo c2: " + c2.getSaldo());

	}

}