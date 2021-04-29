package pacote;

import java.util.Random;

public class Matrizes4 {

	public static void main(String[] args) {
		Random gerador = new Random();

		int[][] matriz = new int[3][3];
		int numMaior = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			
			for (int i2 = 0; i2 < matriz[0].length; i2++) {
				matriz[i][i2] = gerador.nextInt(100);
				System.out.print(matriz[i][i2] + " ");
				
				if (matriz[i][i2] > numMaior) {
					numMaior = matriz[i][i2];
				}
			}
		}
		System.out.println("\nO maior número é " + numMaior);
	}

}
