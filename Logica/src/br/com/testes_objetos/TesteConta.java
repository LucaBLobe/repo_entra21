package br.com.testes_objetos;

import br.com.orientacao_a_objeto.Conta;

public class TesteConta {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
	
		c1.numero = 10001;
		c2.numero = 10002;
		c1.saldo = 1000;
		c2.saldo = 2000;
		c1.limite = 1500;
		c2.limite = 3000;
		c1.depositar(125);
		c1.sacar(15);
		

		System.out.println("Numero: " + c1.numero);
		System.out.print("saldo: "+c1.mostrarSaldo()+"\n");
		System.out.println("limite: " + c1.limite);
		System.out.println(c1.extrato()+"\n");
                                          
		System.out.println("Numero: " + c2.numero);
		System.out.println("saldo: " + c2.saldo);
		System.out.println("limite: " + c2.limite);


	}

}
