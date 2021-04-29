package pacote;
import java.util.Scanner;

public class JogoDaVelhaV2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String[][] tabela = new String[3][3];
		
		int linha, coluna, jogadas = 1;
		boolean vitoria = false;
		String simbolo = null;
		
		for (int i = 0; i < 3; i++) {
			for (int i2 = 0; i2 < 3; i2++) {
				tabela[i][i2] = "-";
			}
		}
		
		while (jogadas < 10 && vitoria == false) {
			for (int i = 0; i < 3; i++) {
				System.out.println();
				for (int i2 = 0; i2 < 3; i2++) {
					System.out.print(tabela[i][i2] + " ");
				}
			}
			
			System.out.println("\n\nLinha: ");
				linha = leitor.nextInt();
				linha--;
			
			System.out.println("\nColuna: ");
				coluna = leitor.nextInt();
				coluna--;
			
			if (jogadas % 2 == 0) {
				simbolo = "X";
			
			} else {
				simbolo = "O";
			}
			
			if (tabela[linha][coluna].equals("-")) {
				tabela[linha][coluna] = simbolo;
				jogadas++;
			
			} else {
				System.out.println("Essa posicão já foi usada!");
			}
			
			if (tabela[0][0].equals("X") && tabela[0][1].equals("X") && tabela[0][2].equals("X")
				||
				tabela[1][0].equals("X") && tabela[1][1].equals("X") && tabela[1][2].equals("X")
				||
				tabela[2][0].equals("X") && tabela[2][1].equals("X") && tabela[2][2].equals("X")
				||
				tabela[0][0].equals("X") && tabela[1][0].equals("X") && tabela[2][0].equals("X")
				||
				tabela[0][1].equals("X") && tabela[1][1].equals("X") && tabela[2][1].equals("X")
				||
				tabela[0][2].equals("X") && tabela[1][2].equals("X") && tabela[2][2].equals("X")
				||
				tabela[0][0].equals("X") && tabela[1][1].equals("X") && tabela[2][2].equals("X")
				||
				tabela[0][2].equals("X") && tabela[1][1].equals("X") && tabela[2][0].equals("X")
				||
				tabela[0][0].equals("O") && tabela[0][1].equals("O") && tabela[0][2].equals("O")
				||
				tabela[1][0].equals("O") && tabela[1][1].equals("O") && tabela[1][2].equals("O")
				||
				tabela[2][0].equals("O") && tabela[2][1].equals("O") && tabela[2][2].equals("O")
				||
				tabela[0][0].equals("O") && tabela[1][0].equals("O") && tabela[2][0].equals("O")
				||
				tabela[0][1].equals("O") && tabela[1][1].equals("O") && tabela[2][1].equals("O")
				||
				tabela[0][2].equals("O") && tabela[1][2].equals("O") && tabela[2][2].equals("O")
				||
				tabela[0][0].equals("O") && tabela[1][1].equals("O") && tabela[2][2].equals("O")
				||
				tabela[0][2].equals("O") && tabela[1][1].equals("O") && tabela[2][0].equals("O")	
				) {
					vitoria = true;
			}		
			
		}
		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int i2 = 0; i2 < 3; i2++) {
				System.out.print(tabela[i][i2] + " ");
			}
		}
		if (vitoria == true) {
			System.out.println("\n\nO jogador '" + simbolo + "' ganhou!");
		}
		if (vitoria == false) {
			System.out.println("\nDeu Velha!");
		}
		leitor.close();
	}

}
