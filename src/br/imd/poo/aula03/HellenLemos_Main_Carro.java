package br.imd.poo.aula03;

c

public class HellenLemos_Main_Carro {

	public static void main(String[] args) {
		HellenLemos_Carro_Q2 ferrari = new HellenLemos_Carro_Q2();
		HellenLemos_Carro_Q2 bugatti = new HellenLemos_Carro_Q2();
		HellenLemos_Carro_Q2 lykan = new HellenLemos_Carro_Q2();
		HellenLemos_Carro_Q2 fusca = new HellenLemos_Carro_Q2("TWE-0000", 2);
		HellenLemos_Carro_Q2 gol = new HellenLemos_Carro_Q2("Passeio", "Verde", 4);
		
		//valores ferrari
		System.out.println("--- Ferrari ---");
		ferrari.setCor("Vermelho");
		ferrari.setTipo("Esportivo");
		ferrari.setPlaca("MHM-0068");
		ferrari.setNum_portas(2);
		
		System.out.print("Cor: " + ferrari.getCor() +
				"\nTipo: " + ferrari.getTipo() +
				"\nPlaca: " + ferrari.getPlaca() +
				"\nNúmero de portas: " + ferrari.getNum_portas() + "\n");
		
		System.out.println("---------------------------------------------");		
		
		//valores Bugatti
		System.out.println("--- Bugatti ---");
		bugatti.setCor("Branco");
		bugatti.setTipo("Esportivo");
		bugatti.setPlaca("GKG-1111");
		bugatti.setNum_portas(2);
				
		System.out.print("Cor: " + bugatti.getCor() +
				"\nTipo: " + bugatti.getTipo() +
				"\nPlaca: " + bugatti.getPlaca() +
				"\nNúmero de portas: " + bugatti.getNum_portas() + "\n");
		
		System.out.println("---------------------------------------------");
		
		//valores Lykan
		System.out.println("--- Lykan ---");
		lykan.setCor("Cinza");
		lykan.setTipo("Esportivo");
		lykan.setPlaca("MMM-1222");
		lykan.setNum_portas(2);
				
		System.out.print("Cor: " + lykan.getCor() +
				"\nTipo: " + lykan.getTipo() +
				"\nPlaca: " + lykan.getPlaca() +
				"\nNúmero de portas: " + lykan.getNum_portas() + "\n");
		
		System.out.println("---------------------------------------------");
		
		//valores do fusca
		System.out.println("--- Fusca ---");
		System.out.print("Placa: " + fusca.getPlaca() +
				"\nNúmero de portas: " + lykan.getNum_portas() + "\n");
		
		System.out.println("---------------------------------------------");
		
		//valores do Gol
				System.out.println("--- Gol ---");
				System.out.print("Cor: " + gol.getCor() +
						"\nTipo: " + gol.getTipo() +
						"\nNúmero de portas: " + gol.getNum_portas() + "\n");

	}

}
