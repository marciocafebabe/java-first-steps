package pacote;
import java.util.Scanner;

public class Enciclopedia {

	public static String verificaIf(String opcao) {
		if (opcao.equalsIgnoreCase("ifsimples")) {
			return "� a estrutura condicional que cont�m apenas 'Se' e 'Ent�o'. "
					+ "\nPor exemplo: Se a vari�vel 'i' for verdadeira, escreva 'Verdadeira'.\n";
		
		} else if (opcao.equalsIgnoreCase("ifcomposto")) {
			return "� a estrutura condicional que cont�m 'Se', 'Ent�o' e 'Sen�o'. "
					+ "\nPor exemplo: Se a vari�vel 'i' for verdadeira, escreva 'Verdadeiro', sen�o, escreva 'Falso'.\n";
		
		} else if (opcao.equalsIgnoreCase("ifencadeado")) {
			return "� a estrutura condicional que cont�m 'Se', 'Ent�o', uma quantidade qualquer de 'Sen�o, se' e, no final, 'Sen�o.' "
					+ "\nPor exemplo: Se a vari�vel 'i' for 1, escreva 'Um', sen�o, se a vari�vel 'i' for 2, escreva 'Dois', sen�o, escreva 'N�o est� entre as op��es poss�veis'.\n";
		
		} else {
			return "Esse tipo de desvio n�o existe\n";
		}
	}
	
	public static String verificaLoop(String opcao) {
		if (opcao.equalsIgnoreCase("for")) {
			return "� uma estrutura que repete AT� QUE um contador criado chegue a um n�mero espec�fico"
					+ "\nPor exemplo: Sendo i = 1 e que ele cresca de um em um a cada execu��o, at� chegar a 10, repita: \nescreva 'Ol�, mundo!'.\n";
		
		} else if (opcao.equalsIgnoreCase("while")) {
			return "� a estrutura que repete ENQUANTO uma condi��o esteja verdadeira."
					+ "\nPor exemplo: Enquanto i for diferente de 1, repita: \nescreva 'Ol�, Mundo!'\n";
		
		} else {
			return "Esse tipo de loop n�o existe\n";
		}
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String opcao;
		int menu = 0;
		
		while (menu != 3) {
			System.out.println("Enciclop�dia interativa Java");
			System.out.println("1 - Tipos de Estruturas Condicionais");
			System.out.println("2 - Tipos de Estruturas de Repeti��o");
			System.out.println("3 - Sair");
			menu = leitor.nextInt();		
			
			if (menu == 1) {
				System.out.println("Sobre qual tipo de 'If' voc� quer saber?");
				System.out.println("'ifsimples', 'ifcomposto' ou 'ifencadeado'?");
				opcao = leitor.next();
				System.out.println(verificaIf(opcao));
			
			} else if (menu == 2) {
				System.out.println("Sobre qual tipo de 'Loop' voc� quer saber?");
				System.out.println("'for' ou 'while'?");
				opcao = leitor.next();
				System.out.println(verificaLoop(opcao));
			
			} else if (menu == 3) {
				System.out.println("Voc� saiu.");
			
			} else {
				System.out.println("Escolha uma op��o v�lida.");
			}
		}
		
		leitor.close();
	}

}
