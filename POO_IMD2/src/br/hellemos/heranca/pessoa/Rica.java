package br.hellemos.heranca.pessoa;

public class Rica extends Pessoa{
	private double dinheiro;
	
	public Rica(double dinheiro) {
		super("Paris Hilton", 30);
		this.dinheiro = dinheiro;
	}
	
	void fazCompras(){
		System.out.println("Compras!! Compras!! Compras!! Eu posso!!");
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
}
