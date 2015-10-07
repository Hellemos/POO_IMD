package br.hellemos.heranca;

public class FuncionarioTest {

	public static void main(String[] args) {
		Assistente andre = new Assistente();
		Gerente andreza = new Gerente();
		
		System.out.println(andre.getMatricula());
		System.out.println(andre instanceof Funcionario); //saber se o objeto andre é do tipo Funcionario
		System.out.println(andre instanceof Assistente); //saber se o objeto andre é do tipo Assistente
		
		System.out.println(andreza.getMatricula());
		
	}

}
