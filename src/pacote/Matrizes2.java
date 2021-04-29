package pacote;

import java.util.Random;

public class Matrizes2 {

	public static void main(String[] args) {
		Random d100 = new Random();

		int[][] matriz = new int[5][5];
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int i2 = 0; i2 < matriz[0].length; i2++) {
				matriz[i][i2] = (d100.nextInt(99) + 1);
				System.out.print(matriz[i][i2] + " ");
			}
		}
		
		
	}

}
