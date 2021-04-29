package pacote;

import java.util.Scanner;

public class Vetores4 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in); 
		
		Double [] vetA = new Double[10];
		Double [] vetB = new Double[10];
		
		for (int x = 1; x < 11; x++) {
			
			System.out.println("Digite o valor " + x + ": ");
			vetA[x - 1] = leitor.nextDouble();
		
		} int y = 9;
		
		for (int x = 0; x < 10; x++) {
			vetB[x] = vetA[y];
			y--;
		} 
		System.out.println("\nVetor A");
		
		for (int x = 1; x < 11; x++) {
			System.out.println("Valor " + x + ": " + vetA[x - 1]);
		} 
		
		System.out.println("\nVetor B");
		
		for (int x = 1; x < 11; x++) {
			System.out.println("Valor " + x + ": " + vetB[x - 1]);
		}
		
		leitor.close();
	}

}
