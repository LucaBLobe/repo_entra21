package br.com.orientacao_a_objeto;

public class CartaoDeCredito {
	
	//Atributos
	
	public int numeroCartao;
	public String dataValidade;
	public Cliente cliente;
	
	public void fazerCompra(int numeroCartao, String dataValidade) {
		
		this.numeroCartao = numeroCartao;
		this.dataValidade = dataValidade;
		
	}

}
