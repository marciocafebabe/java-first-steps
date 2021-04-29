package pacote;

import java.util.Scanner;

public class ClasseUm {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Bem vindo! \nNome da empresa: DenGames\nJogo: O Ataque DenGamer\nLançamento: 31 de Dezembro de 2020\nInsira seu dia de nascimento: ");
		int dia = s.nextInt();
		
		System.out.println("Insira o número do seu mês de nascimento\n(Exemplo: Dezembro -> 12): ");
		int mes = s.nextInt();
		
		System.out.println("Insira seu ano de nascimento: ");
		int ano = s.nextInt();
		
		if (dia == 31 && mes == 12 && ano == 2002 || ano < 2002) {
			System.out.println("Você tem a idade para jogar o Game no dia de lançamento!");
		} else if (ano >= 2002) {
			System.out.println("Você não tem a idade para jogar o Game no dia de lançamento.");
		} else {
			System.out.println("Por favor, insira dados válidos.");
		}
		s.close();
	}
}
