package pacote;

import java.util.Scanner;

public class Vetores1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); 
		double soma = 0;
		Double [] essaPeca = new Double[13];
		int x = 1;
		
		while (x < 14) {
			System.out.println("Escreva o custo da peça " + x + ":");
			essaPeca[x - 1] = leitor.nextDouble();
			x++;
		}
		x = 1;
		while (x < 14) {
			System.out.println("A peça " + x + " custa " + essaPeca[x - 1] + " reais");
			x++;
		}
		x = 1;
		while (x < 14) {
			soma = soma + essaPeca[x-1];
			x++;
		}
		System.out.println("Custo total: " + soma + " reais");
		leitor.close();
	}

}
