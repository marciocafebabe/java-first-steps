package pacote;
import java.util.Scanner;

public class Votos {

	public static void qnt(int cand1, int cand2, int cand3) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Votos candidato 1:");
		cand1 = leitor.nextInt();
		System.out.println("Votos candidato 2:");
		cand2 = leitor.nextInt();
		System.out.println("Votos candidato 3:");
		cand3 = leitor.nextInt();
		
		leitor.close();
	}
	
	public static void main(String[] args) {
		
	}

}
