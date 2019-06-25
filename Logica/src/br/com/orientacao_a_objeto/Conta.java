package br.com.orientacao_a_objeto;

public class Conta {

	public int numero;
	public double saldo;
	public double limite = 100;
	public Agencia agencia;

	public Conta(Agencia agencia) {
		this.agencia = agencia;

	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void sacar(double valor) {
		this.saldo -= valor;
	}

	public double mostrarSaldo() {
		return saldo;
	}

	public String extrato() {
		return "Saldo: " + saldo + "\n" + "Limite: " + limite;

	}
	
	public void transferencia(double valor) {
	
		

	}


}
