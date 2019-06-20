package br.com.questao2;

import br.com.util.Teclado;

public class Questao20 {
	
	public static void main(String[] args) {
		double eleitores;
		double votosValidos;
		double votosNulos;
		double votosBrancos; 
		double nulos;
		double brancos;
		double validos;
		
		
		eleitores = Teclado.lerInt("quantos eleitores existem na cidade.");
		votosValidos = Teclado.lerInt("numero de fotos validos: ");
		votosNulos = Teclado.lerInt("numero de fotos nulos: ");
		votosBrancos = Teclado.lerInt("numero de fotos brancos: "); 
		
		nulos = (eleitores * votosNulos)/100;
		brancos = (eleitores * votosBrancos)/100;
		validos = (eleitores * votosValidos)/100;
	

		System.out.println("O percetual de votos nulos é: " + nulos +"%");
		System.out.println("O percetual de votos brancos é: " + brancos + "%");
		System.out.println("O percetual de votos validos é " + validos + "%");
		
		
	}

}
