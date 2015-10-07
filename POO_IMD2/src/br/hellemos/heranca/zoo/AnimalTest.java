package br.hellemos.heranca.zoo;

public class AnimalTest {

	public static void main(String[] args) {
		Cachorro toto = new Cachorro();
		Gato jerry = new Gato();
		
		System.out.println(toto.nomeAnimal("Toto"));
		System.out.println(toto.late());
		System.out.println(toto.getRaca());
		System.out.println(toto.caminha());
		System.out.println("---------------------------------");
		System.out.println(jerry.nomeAnimal("Jerry"));
		System.out.println(jerry.mia());
		System.out.println(jerry.getRaca());
		System.out.println(jerry.caminha());
		


	}

}
