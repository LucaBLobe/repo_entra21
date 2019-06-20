package br.com.orientacao_a_objeto;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente();
		Cliente cl2 = new Cliente();
		
		
		cl1.nomeCliente = "Jâo da Cunha";
		cl1.codigoCliente = 1234;
		
		cl2.nomeCliente = "Marilia mendonça";
		cl2.codigoCliente = 2345;
				
		System.out.println("nome: "+ cl1.nomeCliente);
		System.out.println("codigo: "+ cl1.codigoCliente +"\n");
	
		System.out.println("nome: "+ cl2.nomeCliente);
		System.out.println("codigoe: "+ cl2.codigoCliente);
		
		

	}

}
