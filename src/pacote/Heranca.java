package pacote;

/*
 * Dormindo Legal:
 * 
 * Função: Receber o nome da esposa do falecido e a quantidade da herança
 * deixada por ele para que o programa calcule e mostre a quantidade de
 * dinheiro que será dada à esposa e aos três filhos após o falecimento do
 * homem, além de mostrar o nome da esposa no console juntamente.
 * 
 * Funcionamento:
 * O programa recebe o valor total da herança e divide-a por dois para calcular
 * a parte da herança dada à esposa, e depois, para calcular o valor dado a cada 
 * filho, divide-se o valor total da herança por 2 e por 3, pois é metade da
 * herança dividida entre os 3 filhos.
 */

import java.util.Scanner;

public class Heranca {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String nomeEsposa;
		Double h;
		
		System.out.println("Escreva o nome da esposa: ");
		nomeEsposa = s.next();
		
		System.out.println("Digite o valor da herança: ");
		h = s.nextDouble();
		
		double filho = h / 6;
		double esposa = h / 2;
		
		System.out.println(nomeEsposa + " deve receber " + esposa + " reais.");
		System.out.println("Cada filho deve receber " + filho + " reais.");
		
		s.close();
	}

}