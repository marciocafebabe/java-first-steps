package pacote;

import java.util.Scanner;

public class Lista1Ex2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int x = 0;
		int i = 0;
		int elemento = 0;
		
		System.out.println("Quantos n�meros da sequ�ncia de Mersenne ser�o calculados?");
		int n = s.nextInt();
		
			while (x < n) {
				i = 0;
				elemento = 1;
					
					while (i < x) {
						elemento = elemento * 2;
						i++;
					}
				 
				elemento = elemento - 1;
				
				System.out.println(elemento);
				
				x++;
			}

		s.close();
	}

}
