package pacote;

import java.util.Scanner;

public class ClassTres {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Deseja calcular o seu custo por dia de viagem nos EUA?\n(Digite 1 para sim ou 2 para n�o. \nDepois pressione ENTER.)");
		int r1 = s.nextInt();
		if (r1 == 1) {
			System.out.println("Digite o valor gasto com viagem:\n(Em D�lar)");
			int h = s.nextInt();
			
			System.out.println("Digite o valor gasto com aluguel de carro:\n(Em D�lar)");
			int a = s.nextInt();
			
			System.out.println("Digite o valor gasto com ingressos para parques:\n(Em D�lar)");
			int i = s.nextInt();
			
			System.out.println("Digite a quantidade de dias:\n(Em D�lar)");
			int qd = s.nextInt();
			
			System.out.println("Digite o valor da cota��o d�lar para o c�lculo:\n(Em D�lar)");
			int cd = s.nextInt();
			
			int valorPorDia = (h + a + i) / qd * cd; 
			
			System.out.println("O valo gasto por dia foi de " + valorPorDia + " reais.");
			
		} else if (r1 == 2) {
			System.out.println("Voc� saiu.");
		} else {
			System.out.println("Insira dados v�lidos.");
		} s.close();
	}
}
