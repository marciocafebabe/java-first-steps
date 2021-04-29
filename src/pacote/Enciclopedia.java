package pacote;
import java.util.Scanner;

public class Enciclopedia {

	public static String verificaIf(String opcao) {
		if (opcao.equalsIgnoreCase("ifsimples")) {
			return "É a estrutura condicional que contém apenas 'Se' e 'Então'. "
					+ "\nPor exemplo: Se a variável 'i' for verdadeira, escreva 'Verdadeira'.\n";
		
		} else if (opcao.equalsIgnoreCase("ifcomposto")) {
			return "É a estrutura condicional que contém 'Se', 'Então' e 'Senão'. "
					+ "\nPor exemplo: Se a variável 'i' for verdadeira, escreva 'Verdadeiro', senão, escreva 'Falso'.\n";
		
		} else if (opcao.equalsIgnoreCase("ifencadeado")) {
			return "É a estrutura condicional que contém 'Se', 'Então', uma quantidade qualquer de 'Senão, se' e, no final, 'Senão.' "
					+ "\nPor exemplo: Se a variável 'i' for 1, escreva 'Um', senão, se a variável 'i' for 2, escreva 'Dois', senão, escreva 'Não está entre as opções possíveis'.\n";
		
		} else {
			return "Esse tipo de desvio não existe\n";
		}
	}
	
	public static String verificaLoop(String opcao) {
		if (opcao.equalsIgnoreCase("for")) {
			return "É uma estrutura que repete ATÉ QUE um contador criado chegue a um número específico"
					+ "\nPor exemplo: Sendo i = 1 e que ele cresca de um em um a cada execução, até chegar a 10, repita: \nescreva 'Olá, mundo!'.\n";
		
		} else if (opcao.equalsIgnoreCase("while")) {
			return "É a estrutura que repete ENQUANTO uma condição esteja verdadeira."
					+ "\nPor exemplo: Enquanto i for diferente de 1, repita: \nescreva 'Olá, Mundo!'\n";
		
		} else {
			return "Esse tipo de loop não existe\n";
		}
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String opcao;
		int menu = 0;
		
		while (menu != 3) {
			System.out.println("Enciclopédia interativa Java");
			System.out.println("1 - Tipos de Estruturas Condicionais");
			System.out.println("2 - Tipos de Estruturas de Repetição");
			System.out.println("3 - Sair");
			menu = leitor.nextInt();		
			
			if (menu == 1) {
				System.out.println("Sobre qual tipo de 'If' você quer saber?");
				System.out.println("'ifsimples', 'ifcomposto' ou 'ifencadeado'?");
				opcao = leitor.next();
				System.out.println(verificaIf(opcao));
			
			} else if (menu == 2) {
				System.out.println("Sobre qual tipo de 'Loop' você quer saber?");
				System.out.println("'for' ou 'while'?");
				opcao = leitor.next();
				System.out.println(verificaLoop(opcao));
			
			} else if (menu == 3) {
				System.out.println("Você saiu.");
			
			} else {
				System.out.println("Escolha uma opção válida.");
			}
		}
		
		leitor.close();
	}

}
