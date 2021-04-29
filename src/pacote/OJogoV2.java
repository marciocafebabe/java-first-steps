package pacote;

import java.util.Scanner;

public class OJogoV2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int caracteres, chances = 7, acertos = 0;
		boolean acertou, letra;
		String palavraCompleta = "", chute;
		String[] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
				"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "Ç"};
		//
		
		System.out.println("Bem-vindo ao Jogo da Forca, para 2 ou mais jogadores!");
		System.out.println("Para começar, o primeiro jogador pensa em uma palavra, digita a");
		System.out.println("quantidade de caracteres que ela tem e depois a escreve letra");
		System.out.println("por letra, sem acentos ou símbolos.");
		caracteres = leitor.nextInt();
		
		String[] palavra = new String[caracteres];
		String[] mostrar = new String[caracteres];
		
		for (int i = 0; i < palavra.length; i++) {
			System.out.println("Letra número " + (i + 1) + ": ");
			palavra[i] = leitor.next();
			mostrar[i] = " _ ";
		}
		for (int i = 0; i < palavra.length; i++) {
			palavraCompleta += palavra[i];
		}
		
		//
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		while (acertos < caracteres && chances > 0) {
			acertou = false;
			letra = false;
			System.out.println("\n Você tem " + chances + " chance(s)");
			
			for (int i = 0; i < palavra.length; i++) {
				System.out.print(mostrar[i] + " ");
			} System.out.println();
			
			chute = leitor.next();
		
			for (int i = 0; i < alfabeto.length; i++) {
				if (chute.equalsIgnoreCase(alfabeto[i])) {
					letra = true;
				}
			}
			
			if (letra == true) {
			
				for (int i = 0; i < palavra.length; i++) {
					if (chute.equalsIgnoreCase(palavra[i])) {
						mostrar[i] = palavra[i];
						acertos++;
						acertou = true;
					} 
				
				}
				if (acertou == false) {
					chances--;
				}
			
			} else {
				if (palavraCompleta.equalsIgnoreCase(chute)) {
					acertos = caracteres;
				
				} else {
					chances--;
				}
			}
		}
		
		//
		
		if (acertos == caracteres) {
			System.out.println("Você acertou!");
		} else {
			System.out.print("Você perdeu...\nA palavra era '");
		}
		
		for (int i = 0; i < palavra.length; i++) {
			
			if (i == 0) {
				System.out.print(palavra[i].toUpperCase());
			
			} else {
				System.out.print(palavra[i].toLowerCase());
			}
		} 
		if (acertos != caracteres) {
			System.out.print("'.");
		}
		
		leitor.close();
	}

}