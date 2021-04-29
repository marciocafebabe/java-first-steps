package pacote;

/*
 * Dormindo Legal:
 * 
 * Fun��o: Receber o nome da esposa do falecido e a quantidade da heran�a
 * deixada por ele para que o programa calcule e mostre a quantidade de
 * dinheiro que ser� dada � esposa e aos tr�s filhos ap�s o falecimento do
 * homem, al�m de mostrar o nome da esposa no console juntamente.
 * 
 * Funcionamento:
 * O programa recebe o valor total da heran�a e divide-a por dois para calcular
 * a parte da heran�a dada � esposa, e depois, para calcular o valor dado a cada 
 * filho, divide-se o valor total da heran�a por 2 e por 3, pois � metade da
 * heran�a dividida entre os 3 filhos.
 */

import java.util.Scanner;

public class Heranca {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String nomeEsposa;
		Double h;
		
		System.out.println("Escreva o nome da esposa: ");
		nomeEsposa = s.next();
		
		System.out.println("Digite o valor da heran�a: ");
		h = s.nextDouble();
		
		double filho = h / 6;
		double esposa = h / 2;
		
		System.out.println(nomeEsposa + " deve receber " + esposa + " reais.");
		System.out.println("Cada filho deve receber " + filho + " reais.");
		
		s.close();
	}

}