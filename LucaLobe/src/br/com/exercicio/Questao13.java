package br.com.exercicio;

import br.com.util.Teclado;

public class Questao13 {
	
	public static void main(String[] args) {
		int numero;
		double pow = 2.54;
		int cm;
		
		numero= Teclado.lerInt("digite até qual diametro que deseja exibir a tabela de polegadas x centimetros: ");
		
		for (int i = 0; i <= numero; i++) {
			cm = (int) (i*pow);
			System.out.println("Polegadas: "+i+ " | centimetros " + cm + "cm");
		}
		
		
	}

}
