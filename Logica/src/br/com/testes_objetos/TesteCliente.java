package br.com.testes_objetos;

import br.com.orientacao_a_objeto.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente();
		Cliente cl2 = new Cliente();
		
		
		cl1.nomeCliente = "Joao da Cunha";
		cl1.codigoCliente = 1234;
		
		cl2.nomeCliente = "Marilia Mendonca";
		cl2.codigoCliente = 2345;
	
		System.out.println("nome: "+ cl1.nomeCliente);
		System.out.println("codigoe: "+ cl1.codigoCliente);
		
		System.out.println("nome: "+ cl2.nomeCliente);
		System.out.println("codigoe: "+ cl2.codigoCliente);
		
		

	}

}
