package br.com.questao;
import br.com.util.Teclado;

public class Questao03 {
	public static void main(String[] args) {
		
	
		double dolar;
		
		dolar = Teclado.lerDouble("Insira o valor em Dolares: ");
		System.out.println("O valaor em reais é R$"+(dolar*3.8));
	
		
	}

}
