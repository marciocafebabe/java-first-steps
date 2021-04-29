package pacote;

import java.util.Scanner;

public class Vetores6 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String[] tarefas = new String[20];
		int funcao = 0;
		int i;
		
		for (int x = 0; x < tarefas.length; x++) {
			tarefas[x] = "VAZIO";
		}
		
		while (funcao != 8) {
			i = 0;
			funcao = 0;
			System.out.println("--- LISTA DE TAREFAS ---");
			System.out.println("1 - Inserir uma atividade");
			System.out.println("2 - Inserir uma atividade em posição específica");
			System.out.println("3 - Listar todas as atividades");
			System.out.println("4 - Contar quantas posições estão vazias");
			System.out.println("5 - Contar atividades");
			System.out.println("6 - Quais posições estão vazias");
			System.out.println("7 - Realizar uma atividade");
			System.out.println("8 - Sair");
			funcao = leitor.nextInt();
			
			if (funcao == 1) {
				while (tarefas[i] != "VAZIO") {
					i++;
				}
				System.out.println("Escreva a atividade: ");
				tarefas[i] = leitor.next();
				System.out.println("'" + tarefas[i] + "' armazenada na posição " + (i + 1) + ".\n");
			}
			if (funcao == 2) {
				System.out.println("Digite a posição: ");
				i = leitor.nextInt();
				i -= 1;
				
				System.out.println("Escreva a atividade: ");
				tarefas[i] = leitor.next();
				System.out.println("'" + tarefas[i] + "' armazenada na posição " + (i + 1) + ".\n");
			}
			if (funcao == 3) {
				for (int i2 = 0; i2 < tarefas.length; i2++) {
					if (!tarefas[i2].equals("VAZIO")) {
						System.out.println((i2 + 1) + " - " + tarefas[i2]);
					}
				}
			}
			if (funcao == 4) {
				for (int i3 = 0; i3 < tarefas.length; i3++) {
					if (tarefas[i3].equals("VAZIO")) {
						i++;
					}
				}
				System.out.println(i + " posições estão vazias.");
			}
			if (funcao == 5) {
				for (int i3 = 0; i3 < tarefas.length; i3++) {
					if (tarefas[i3].equals("VAZIO")) {
						i++;
					}
				}
				System.out.println((20 - i) + " posições estão preenchidas.");
			}
			if (funcao == 6) {
				System.out.println("Posições vazias: ");
				for (int i3 = 0; i3 < tarefas.length; i3++) {
					if (tarefas[i3].equals("VAZIO")) {
						System.out.println("- " + (i3 + 1) + " -");
					}
				}
			}
			if (funcao == 7) {
				System.out.println("Digite a posição: ");
				i = leitor.nextInt();
				tarefas[i - 1] = "VAZIO";
				System.out.println("Tarefa realizada.");
			}
		}
		leitor.close();
	}

}
