package br.com.exercicio_lacos_repeticao;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import br.com.util.Teclado;

public class Questao14 {
	public static void main(String[] args) {
	
		double nota = 0.0;
		double somaNota = 0.0;
		double media=0.0;
		
		for (int i = 1; i <= 3; i++) {
			nota = Teclado.lerDouble("Digite a nota "+i);
			somaNota += nota;
		}
		media = (somaNota/3);
		System.out.println("sua m�dia �: "+media);
	}
	

}
