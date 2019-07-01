package br.com.testes_objetos;

import br.com.orientacao_a_objeto.Funcionario;

public class TesteFuncionarios {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.nome = "joao das massas";
		f2.nome = "joao das Neves";
		f1.salFuncionario = 1200.0;
		f2.salFuncionario = 1500.0;
		f1.AumentaSalario(500);
		f1.ConsultaDados();
		f2.ConsultaDados();
		
	}

}
