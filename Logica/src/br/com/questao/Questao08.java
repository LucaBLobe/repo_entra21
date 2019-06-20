package br.com.questao;

import br.com.util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		
		double dist = Teclado.lerDouble("Quantos Quilometros foi percorrido na viagem? ");
		double consumo = Teclado.lerDouble("qual o consumo medio de combustivel? ");
		System.out.println("Quantos litros: " + (dist/consumo)+" L");
		
	}

}
