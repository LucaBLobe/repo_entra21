package br.com.orientacao_a_objeto;

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
		
		System.out.println("Numero: " + c1.numero);
		System.out.println("saldo: " + c1.numero);
		System.out.println("limite: " + c1.numero + "\n");
		
		System.out.println("Numero: " + c2.numero);
		System.out.println("saldo: " + c2.numero);
		System.out.println("limite: " + c2.numero);
		
	}

}
