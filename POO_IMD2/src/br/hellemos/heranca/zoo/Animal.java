package br.hellemos.heranca.zoo;

public class Animal {
	private String nome;
	private String raca;
	
	public Animal(String raca){
		this.raca = raca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String nomeAnimal(String nome){
		return this.nome = nome;		
	}
	
	public String caminha(){
		return "Sim";
	}
}
