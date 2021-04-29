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
			System.out.println("2 - Inserir uma atividade em posi��o espec�fica");
			System.out.println("3 - Listar todas as atividades");
			System.out.println("4 - Contar quantas posi��es est�o vazias");
			System.out.println("5 - Contar atividades");
			System.out.println("6 - Quais posi��es est�o vazias");
			System.out.println("7 - Realizar uma atividade");
			System.out.println("8 - Sair");
			funcao = leitor.nextInt();
			
			if (funcao == 1) {
				while (tarefas[i] != "VAZIO") {
					i++;
				}
				System.out.println("Escreva a atividade: ");
				tarefas[i] = leitor.next();
				System.out.println("'" + tarefas[i] + "' armazenada na posi��o " + (i + 1) + ".\n");
			}
			if (funcao == 2) {
				System.out.println("Digite a posi��o: ");
				i = leitor.nextInt();
				i -= 1;
				
				System.out.println("Escreva a atividade: ");
				tarefas[i] = leitor.next();
				System.out.println("'" + tarefas[i] + "' armazenada na posi��o " + (i + 1) + ".\n");
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
				System.out.println(i + " posi��es est�o vazias.");
			}
			if (funcao == 5) {
				for (int i3 = 0; i3 < tarefas.length; i3++) {
					if (tarefas[i3].equals("VAZIO")) {
						i++;
					}
				}
				System.out.println((20 - i) + " posi��es est�o preenchidas.");
			}
			if (funcao == 6) {
				System.out.println("Posi��es vazias: ");
				for (int i3 = 0; i3 < tarefas.length; i3++) {
					if (tarefas[i3].equals("VAZIO")) {
						System.out.println("- " + (i3 + 1) + " -");
					}
				}
			}
			if (funcao == 7) {
				System.out.println("Digite a posi��o: ");
				i = leitor.nextInt();
				tarefas[i - 1] = "VAZIO";
				System.out.println("Tarefa realizada.");
			}
		}
		leitor.close();
	}

}
