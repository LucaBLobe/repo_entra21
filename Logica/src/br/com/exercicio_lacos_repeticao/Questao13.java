package br.com.exercicio_lacos_repeticao;

import br.com.util.Teclado;

public class Questao13 {
	
	public static void main(String[] args) {
		int numero;
		double pow = 2.54;
		int cm;
		
		numero= Teclado.lerInt("Digite at� qual diametro em polegadas que deseja exibir a tabela de polegadas x centimetros: ");
		
		for (int i = 1; i <= numero; i++) {
			cm = (int) (i*pow);
			System.out.println("Polegadas: "+i+ " | centimetros " + cm + "cm");
		}
		
		
	}

}
