package pacote;

import java.util.Scanner;

public class ClasseUm {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Bem vindo! \nNome da empresa: DenGames\nJogo: O Ataque DenGamer\nLan�amento: 31 de Dezembro de 2020\nInsira seu dia de nascimento: ");
		int dia = s.nextInt();
		
		System.out.println("Insira o n�mero do seu m�s de nascimento\n(Exemplo: Dezembro -> 12): ");
		int mes = s.nextInt();
		
		System.out.println("Insira seu ano de nascimento: ");
		int ano = s.nextInt();
		
		if (dia == 31 && mes == 12 && ano == 2002 || ano < 2002) {
			System.out.println("Voc� tem a idade para jogar o Game no dia de lan�amento!");
		} else if (ano >= 2002) {
			System.out.println("Voc� n�o tem a idade para jogar o Game no dia de lan�amento.");
		} else {
			System.out.println("Por favor, insira dados v�lidos.");
		}
		s.close();
	}
}
