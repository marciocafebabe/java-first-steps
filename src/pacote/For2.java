package pacote;

public class For2 {

	public static void main(String[] args) {

		int lado = 3; //tamanho em "asteriscos quadrados"
		
		for (int x = 0; x < lado; x++) {
			
			for (int y = 0; y < lado; y++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}

}
