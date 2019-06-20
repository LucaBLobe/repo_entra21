package br.com.questao;

import br.com.util.Teclado;

public class Questao01 {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 
		 */

		String nome;
		String sexo;
		
		nome = Teclado.lerTexto("Digite o seu nome completo");
		sexo = Teclado.lerTexto("Digite seu sexo:");
		
		
		System.out.println("O seu nome é: "+ nome +"\n"+
							"O seu sexo é: "+ sexo); 								
		
	}

}
