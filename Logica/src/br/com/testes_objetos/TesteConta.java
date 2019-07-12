package br.com.testes_objetos;

import br.com.orientacao_a_objeto.Conta;

public class TesteConta {

	public static void main(String[] args) {
		System.out.println(Conta.getContador());
		Conta c1 = new Conta(null);
		Conta c2 = new Conta(null);
	
		c1.setNumero(10001);
		c2.setNumero(10002);
		c1.setSaldo(1000);
		c2.setSaldo(2000);
		c1.setLimite(1500);
		c2.setLimite(3000);
		c1.depositar(125);
		c1.sacar(15);
		

		System.out.println("Numero: " + c1.getNumero());
		System.out.print("saldo: "+c1.mostrarSaldo()+"\n");
		System.out.println("limite: " + c1.getLimite());
		System.out.println(c1.extrato()+"\n");
                                          
		System.out.println("Numero: " + c2.getNumero());
		System.out.println("saldo: " + c2.getSaldo());
		System.out.println("limite: " + c2.getLimite());
		System.out.println(Conta.getContador());
		System.out.println(c1.getNumeroID());

	}

}
