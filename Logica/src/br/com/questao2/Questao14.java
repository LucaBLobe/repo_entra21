package br.com.questao2;

import br.com.util.Teclado;

public class Questao14 {

	public static void main(String[] args) {
		double alturaM;
		double pesoKg;
		double imc;
		
		alturaM = Teclado.lerDouble("Digite sua altura em METROS: ");
		pesoKg = Teclado.lerDouble("Digite seu peso em Kilogramas: ");
		
		imc = (pesoKg/alturaM*alturaM);
		
		System.out.println("O seu IMC é " + imc+ "Kg/m");
		
	}

}
