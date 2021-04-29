package pacote;

public class Aula30 {

	public static void main(String[] args) {
		
		boolean[][] lista = 
		{	
			{false, true, false, false, false},
			{false, false, false, false, false}
		};
			primeiro:
			for (int a = 0; a < lista.length; a++) {
				System.out.print(", A ");
				
				for (int b = 0; b < lista[a].length; b++) {
					
					if (lista[a][b]) {
						System.out.print("true ");
						break primeiro;
					}
					System.out.print("B ");
			}
		}
	}
}