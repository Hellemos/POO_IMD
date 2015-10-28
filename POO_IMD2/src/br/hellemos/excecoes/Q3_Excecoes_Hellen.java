package br.hellemos.excecoes;

import java.util.Scanner;

public class Q3_Excecoes_Hellen {	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numerador, denominador = 0;
		int resultado = 0;
		
		try {
			System.out.println("Digite o numerador: ");
			numerador = leia.nextInt();
			
			System.out.println("Digite o denominador: ");
			denominador = leia.nextInt();
			
			resultado = numerador/denominador;
			
			System.out.println("Resultado: " + resultado);
			
		} catch (ArithmeticException e) {
			if(denominador == 0){
				System.out.println("O denominador não pode ser zero!");
			}
		}finally{
			System.out.println("Passo aqui sempre!");
		}

	}

}
