package br.com.questao2;

import br.com.util.Teclado;

public class Questao13 {
	
	public static void main(String[] args) {
		double alturaM;
		double pesoKg;
		double alturaCm;
		double pesoG;
		
		alturaM = Teclado.lerDouble("Digite sua altura em METROS: ");
		pesoKg = Teclado.lerDouble("Digite seu peso em Kilogramas: ");
		
		alturaCm = alturaM*100;
		pesoG = pesoKg*1000;
		
		System.out.println("A sua altura em cm: "+alturaCm+"cm");
		System.out.println("O seu peso em g: "+pesoG+"g");
	}

}
