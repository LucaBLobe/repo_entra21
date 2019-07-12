package br.com.testes_objetos;

import br.com.orientacao_a_objeto.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente();
		Cliente cl2 = new Cliente();
		
		
		cl1.setNomeCliente("Joao da Cunha");
		cl1.setCodigoCliente(1234);
		
		cl2.setNomeCliente("Marilia Mendonca");
		cl2.setCodigoCliente(2345);
	
		System.out.println("nome: "+ cl1.getNomeCliente());
		System.out.println("codigoe: "+ cl1.getCodigoCliente());
		
		System.out.println("nome: "+ cl2.getNomeCliente());
		System.out.println("codigoe: "+ cl2.getCodigoCliente());
		
		

	}

}
