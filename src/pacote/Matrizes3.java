package pacote;

import java.util.Scanner;

public class Matrizes3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double[][] matriz = new double[2][5];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int i2 = 0; i2 < matriz[0].length; i2++) {
				System.out.println("Posição (" + (i + 1) + ", " + (i2 + 1) + ") :");
				matriz[i][i2] = leitor.nextDouble();
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int i2 = 0; i2 < matriz[0].length; i2++) {
				System.out.print(matriz[i][i2] + " ");
			}
		}
		leitor.close();
	}

}
