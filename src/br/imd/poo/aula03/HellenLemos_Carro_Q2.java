package br.imd.poo.aula03;

//Questões 2 e 3

public class HellenLemos_Carro_Q2 {
	private String tipo;
	private String cor;
	private String placa;
	private int num_portas;
	
	public HellenLemos_Carro_Q2() {
	}
	
	public HellenLemos_Carro_Q2(String placa, int num_portas) {
		this.placa = placa;
		this.num_portas = num_portas;
	}
	
	public HellenLemos_Carro_Q2(String tipo, String cor, int num_portas) {
		this.tipo = tipo;
		this.cor = cor;
		this.num_portas = num_portas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNum_portas() {
		return num_portas;
	}

	public void setNum_portas(int num_portas) {
		this.num_portas = num_portas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
}
