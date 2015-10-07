package br.hellemos.heranca.pessoa;

public class PessoaTest {

	public static void main(String[] args) {
		Rica parisHilton = new Rica(100000);
		Pobre joao = new Pobre();
		Miseravel ninguem = new Miseravel();
		
		
		System.out.println(parisHilton.getNome());
		System.out.println(parisHilton.getDinheiro());
		System.out.println(parisHilton.getIdade());
		parisHilton.fazCompras();
		
		System.out.println("----------------------------");
		
		System.out.println(joao.getNome());
		System.out.println(joao.getIdade());
		joao.trabalha();
		
		System.out.println("----------------------------");
		System.out.println(ninguem.getNome());
		System.out.println(ninguem.getIdade());
		ninguem.mendiga();
		
	}

}
