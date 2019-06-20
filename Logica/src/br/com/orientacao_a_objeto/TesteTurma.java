package br.com.orientacao_a_objeto;

public class TesteTurma {
	
	public static void main(String[] args) {
		Turma tu1 = new Turma();
		Turma tu2 = new Turma();
		
		tu1.periodo = "noturno";
		tu2.periodo = "matutino";
		tu1.serie = "segunda";
		tu2.serie = "terceira";
		tu1.sigla = "102";
		tu2.sigla = "103";
		tu1.tipo = "regular";
		tu2.tipo = "extra";
		
		System.out.println("");
		
	}

}
