package pacote;
import java.util.Scanner;

public class Placar {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int[][] placar = new int[6][2];
		int time[] = new int[2];
		
		for (int i = 0; i < placar.length; i++) {
			placar[i][0] = 0;
			placar[i][1] = 0;
		}
		
		//0 Edwards, 1 Aliens, 2 Batmans, 3 Mutantes, 4 Jedi, 5 Ninjas
		
		System.out.println("Placar Brasileiwutzl");
		
		System.out.println("\nPrimeira rodada");
		
		System.out.println("Digite os gols da partida Edwards X Aliens:");
		time[0] = leitor.nextInt();
		placar[0][1] += time[0];
		
		time[1] = leitor.nextInt();
		placar[1][1] += time[0];
		
		
		if (time[0] > time[1]) {
			placar[0][0] += 3;
		
		} else if (time[1] > time[0]) {
			placar[1][0] += 3;
		
		} else {
			placar[0][0]++;
			placar[1][0]++;
		}
		System.out.println("Digite os gols da partida Batmans X Mutantes:");
		time[0] = leitor.nextInt();
		placar[2][1] += time[0];
		
		time[1] = leitor.nextInt();
		placar[3][1] += time[0];
		
		
		if (time[0] > time[1]) {
			placar[2][0] += 3;
		
		} else if (time[1] > time[0]) {
			placar[3][0] += 3;
		
		} else {
			placar[2][0]++;
			placar[3][0]++;
		}
		System.out.println("Digite os gols da partida Jedi X Ninjas:");
		time[0] = leitor.nextInt();
		placar[4][1] += time[0];
		
		time[1] = leitor.nextInt();
		placar[5][1] += time[0];
		
		
		if (time[0] > time[1]) {
			placar[4][0] += 3;
		
		} else if (time[1] > time[0]) {
			placar[5][0] += 3;
		
		} else {
			placar[4][0]++;
			placar[5][0]++;
		}
		System.out.println("Segunda Rodada");
		System.out.println("Digite os gols da partida Edwards X Mutantes:");
		time[0] = leitor.nextInt();
		placar[0][1] += time[0];
		
		time[1] = leitor.nextInt();
		placar[3][1] += time[0];
		
		
		if (time[0] > time[1]) {
			placar[0][0] += 3;
		
		} else if (time[1] > time[0]) {
			placar[3][0] += 3;
		
		} else {
			placar[0][0]++;
			placar[3][0]++;
		}
		System.out.println("Digite os gols da partida Aliens X Ninjas:");
		time[0] = leitor.nextInt();
		placar[1][1] += time[0];
		
		time[1] = leitor.nextInt();
		placar[5][1] += time[0];
		
		
		if (time[0] > time[1]) {
			placar[1][0] += 3;
		
		} else if (time[1] > time[0]) {
			placar[5][0] += 3;
		
		} else {
			placar[1][0]++;
			placar[5][0]++;
		}
		System.out.println("Digite os gols da partida Batmans X Jedi:");
		time[0] = leitor.nextInt();
		placar[2][1] += time[0];
		
		time[1] = leitor.nextInt();
		placar[4][1] += time[0];
		
		
		if (time[0] > time[1]) {
			placar[2][0] += 3;
		
		} else if (time[1] > time[0]) {
			placar[4][0] += 3;
		
		} else {
			placar[2][0]++;
			placar[4][0]++;
		}
		System.out.println("Terceira Rodada");
		System.out.println("Digite os gols da partida Edwards X Ninjas:");
		time[0] = leitor.nextInt();
		placar[0][1] += time[0];
		
		time[1] = leitor.nextInt();
		placar[5][1] += time[0];
		
		
		if (time[0] > time[1]) {
			placar[0][0] += 3;
		
		} else if (time[1] > time[0]) {
			placar[5][0] += 3;
		
		} else {
			placar[0][0]++;
			placar[5][0]++;
		}
		System.out.println("Digite os gols da partida Mutantes X Jedi:");
		time[0] = leitor.nextInt();
		placar[3][1] += time[0];
		
		time[1] = leitor.nextInt();
		placar[4][1] += time[0];
		
		
		if (time[0] > time[1]) {
			placar[3][0] += 3;
		
		} else if (time[1] > time[0]) {
			placar[4][0] += 3;
		
		} else {
			placar[3][0]++;
			placar[4][0]++;
		}
		System.out.println("Digite os gols da partida Aliens X Batmans:");
		time[0] = leitor.nextInt();
		placar[1][1] += time[0];
		
		time[1] = leitor.nextInt();
		placar[2][1] += time[0];
		
		
		if (time[0] > time[1]) {
			placar[1][0] += 3;
		
		} else if (time[1] > time[0]) {
			placar[2][0] += 3;
		
		} else {
			placar[1][0]++;
			placar[2][0]++;
		}
		System.out.println("Quarta Rodada");
		System.out.println("Digite os gols da partida Edwards X Jedi:");
		time[0] = leitor.nextInt();
		placar[0][1] += time[0];
		
		time[1] = leitor.nextInt();
		placar[4][1] += time[0];
		
		
		if (time[0] > time[1]) {
			placar[0][0] += 3;
		
		} else if (time[1] > time[0]) {
			placar[4][0] += 3;
		
		} else {
			placar[0][0]++;
			placar[4][0]++;
		}
		System.out.println("Digite os gols da partida Ninjas X Batmans:");
		time[0] = leitor.nextInt();
		placar[5][1] += time[0];
		
		time[1] = leitor.nextInt();
		placar[2][1] += time[0];
		
		
		if (time[0] > time[1]) {
			placar[5][0] += 3;
		
		} else if (time[1] > time[0]) {
			placar[2][0] += 3;
		
		} else {
			placar[5][0]++;
			placar[2][0]++;
		}
		System.out.println("Digite os gols da partida Mutantes X Aliens:");
		time[0] = leitor.nextInt();
		placar[3][1] += time[0];
		
		time[1] = leitor.nextInt();
		placar[1][1] += time[0];
		
		
		if (time[0] > time[1]) {
			placar[3][0] += 3;
		
		} else if (time[1] > time[0]) {
			placar[1][0] += 3;
		
		} else {
			placar[3][0]++;
			placar[1][0]++;
		}

		System.out.println("Quinta Rodada");
		System.out.println("Digite os gols da partida Edwards X Batmans:");
		time[0] = leitor.nextInt();
		placar[0][1] += time[0];
		
		time[1] = leitor.nextInt();
		placar[2][1] += time[0];
		
		
		if (time[0] > time[1]) {
			placar[0][0] += 3;
		
		} else if (time[1] > time[0]) {
			placar[2][0] += 3;
		
		} else {
			placar[0][0]++;
			placar[2][0]++;
		}
		System.out.println("Digite os gols da partida Jedi X Aliens:");
		time[0] = leitor.nextInt();
		placar[4][1] += time[0];
		
		time[1] = leitor.nextInt();
		placar[1][1] += time[0];
		
		
		if (time[0] > time[1]) {
			placar[4][0] += 3;
		
		} else if (time[1] > time[0]) {
			placar[1][0] += 3;
		
		} else {
			placar[4][0]++;
			placar[1][0]++;
		}
		System.out.println("Digite os gols da partida Ninjas X Mutantes:");
		time[0] = leitor.nextInt();
		placar[5][1] += time[0];
		
		time[1] = leitor.nextInt();
		placar[3][1] += time[0];
		
		
		if (time[0] > time[1]) {
			placar[5][0] += 3;
		
		} else if (time[1] > time[0]) {
			placar[3][0] += 3;
		
		} else {
			placar[5][0]++;
			placar[3][0]++;
		}
	
		for (int i = 0; i < placar.length; i++) {
			if (i > 0) {
				
			} else {
				
			}
		}
		
		leitor.close();
	}

}
