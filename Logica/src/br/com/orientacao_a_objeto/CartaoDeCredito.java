package br.com.orientacao_a_objeto;

public class CartaoDeCredito {
	
	//Atributos
	
	private int numeroCartao;
	private String dataValidade;
	private Cliente cliente;
	
	public void fazerCompra(int numeroCartao, String dataValidade) {
		
		this.numeroCartao = numeroCartao;
		this.dataValidade = dataValidade;
		
	}

	public int getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
}
