package br.com.questao2;

import br.com.util.Teclado;

public class Questao15 {
	
	public static void main(String[] args) {
		
	double n1, n2, soma, sub1, sub2, mult, div, restoDiv;
	
	n1 = Teclado.lerDouble("Digite o primeiro numero: ");
	n2 = Teclado.lerDouble("Digite o segundo numero: ");
	soma = (n1+n2);
	sub1 = (n1-n2);
	sub2 = (n2-n1);
	mult = (n2*n1);
	div  = (n1/n2);
	restoDiv = (n1%n2);
 	
	System.out.println("soma dos 2: "+ soma +"\n"+
					   "subtra��o primeiro pelo segundo: "+ sub1 +"\n"+
					   "subtra��o segundo pelo primeiro: "+ sub2 +"\n"+
					   "multiplica��o dos 2: "+ mult +"\n"+
					   "Divis�o dos 2: "+ div +"\n"+
					   "Resto da divis�o dos 2: "+ restoDiv +"\n"
					);

		
		
	}

}
