package br.hellemos.heranca.pessoa;

public class Pobre extends Pessoa{

	public Pobre() {
		super("João", 30);
	}
	
	void trabalha(){
		System.out.println("Trabalha o tempo inteiro, mas o dinheiro não dar =/");
	}

}
