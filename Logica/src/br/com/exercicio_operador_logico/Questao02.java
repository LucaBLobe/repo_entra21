package br.com.exercicio_operador_logico;

import br.com.util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
		
		String capital;
		capital = Teclado.lerTexto("Qual é a capital do Brasil? ");
		if (capital.equalsIgnoreCase("BRASÍLIA")) {
			System.out.println("Resposta corrtea: Brasília!");
			
		}else {
			System.out.println("Resposta errada!");
		}
	

	}

}
