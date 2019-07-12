package br.com.testes_objetos;

import br.com.orientacao_a_objeto.Funcionario;

public class TesteFuncionarios {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.setNome("joao das massas");
		f2.setNome("joao das Neves");
		f1.setSalFuncionario(1200.0);
		f2.setSalFuncionario(1500.0);
		f1.AumentaSalario(500);
		f1.ConsultaDados();
		f2.ConsultaDados();
		System.out.println(f1.getValRefeicaoDia());
		f1.AlteraValeRefeição(-50.0);
		System.out.println(f1.getValRefeicaoDia());
	}

}
