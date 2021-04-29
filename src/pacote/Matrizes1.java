package pacote;

public class Matrizes1 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[9][6];
		int valor;
		
		for (int i = 0; i < matriz.length; i++) {
			
			if (i % 2 == 0) {
				valor = -1;
			
			} else {
				valor = 0;
			}
			
			System.out.println();
			
			for (int i2 = 0; i2 < matriz[0].length; i2++) {
				matriz[i][i2] = valor;
				System.out.print(matriz[i][i2]);
			}
		}
		
	}

}
