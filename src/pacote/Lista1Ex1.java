package pacote;

import java.util.Scanner;

public class Lista1Ex1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Escreva o numero maximo para o programa calcular multiplos de 3.");
		int n = s.nextInt();
		
		for (int x = 1; x < n; x++) {
			if (x % 3 == 0) {
				System.out.println(x);
			}
		}
		s.close();
	}

}
