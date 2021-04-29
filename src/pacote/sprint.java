package pacote;

import java.util.Random;
import java.util.Scanner;

public class sprint {

	public static void OrdenaFinal(int[] lista_unica, int aux) {
		for (int i = 0; i < lista_unica.length; i++) {
			for (int j = 0; j < lista_unica.length; j++) {
				if (lista_unica[i] < lista_unica[j]) {
					aux = lista_unica[i];
					lista_unica[i] = lista_unica[j];
					lista_unica[j] = aux;
				}
			}
		}

	}

	public static boolean TestaPrimo(int teste) {
		if (teste == 1) {
			return false;
		}

		for (int i = 2; i <= teste / 2; i++) {

			if ((teste % i) == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gerador = new Random();

		int[] lista1 = new int[5];
		int[] lista2 = new int[5];
		int[] lista3 = new int[5];

		int[] listaA = new int[lista1.length + lista2.length + lista3.length];
		int[] listaB = new int[lista1.length + lista2.length + lista3.length];

		int[] minutos = new int[99];

		System.out.println("Bem-vindo ao programa de descontaminação de salas do grupo Conquer Squad!");
		System.out.println("Para começar, comece a digitar o número das salas que serão descontaminadas, de 1 a 99:");

		Scanner leitor = new Scanner(System.in);

		System.out.println("Lista 1:");
		for (int i = 0; i < lista1.length; i++) {
			lista1[i] = leitor.nextInt();
		}
		System.out.println("Lista 2:");
		for (int i = 0; i < lista2.length; i++) {
			lista2[i] = leitor.nextInt();
		}
		System.out.println("Lista 3:");
		for (int i = 0; i < lista3.length; i++) {
			lista3[i] = leitor.nextInt();
		}
		leitor.close();

		// JUNTA O NUMERO DE TODAS AS SALAS
		for (int i = 0, x = -1; i < 5; i++) {
			x++;
			listaA[x] = lista1[i];
			x++;
			listaA[x] = lista2[i];
			x++;
			listaA[x] = lista3[i];
		}

		// SUBSTITUI TODOS REPETIDO POR ZERO
		for (int i = 0; i < listaA.length; i++) {
			for (int x = 0; x < listaA.length; x++) {
				if (listaA[x] == listaA[i] && i != x) {
					listaA[x] = 00;
				}
			}
		}

		System.out.println();
		// EXIBE A LISTA SEM ORDENAÇÃO
		System.out.println("Lista única:");
		int x = 0;
		for (int i = 0; i < 15; i++) {
			if (listaA[i] != 00) {
				listaB[x] = listaA[i];
				x++;
			}
		}

		int[] lista_unica = new int[x];
		System.out.print("|");
		for (int i = 0; i < lista_unica.length; i++) {
			lista_unica[i] = listaB[i];
			System.out.print(lista_unica[i] + "|");
		}

		System.out.println();

		// EXIBE A LISTA ORDENADA
		System.out.println("Lista final:");
		OrdenaFinal(lista_unica, 0);
		System.out.print("|");
		for (int i = 0; i < lista_unica.length; i++) {
			System.out.print(lista_unica[i] + "|");
		}

		// VETOR MINUTOS
		for (int i = 0; i < 99;) {
			int inteiro = 0;
			inteiro = gerador.nextInt(499) + 1;
			if (TestaPrimo(inteiro) == true) {
				minutos[i] = inteiro;
				i++;
			}
		}

		System.out.println();

		System.out.println("Minutos:");
		System.out.print("|");
		for (int i = 0; i < minutos.length; i++) {
			minutos[i] = minutos[i];
			System.out.print(minutos[i] + "|");
		}

		// CALCULO DO TEMPO TOTAL AS SALAS QUE PRECISAM SER DESINFETADAS
		int y, t = 0;
		for (int i = 0; i < x; i++) {
			y = (lista_unica[i] - 1);
			t = t + minutos[y];
		}

		// CALCULO DO TEMPO TOTAL PARA TODAS AS SALAS
		int  tempo_total = 0;
		for (int i = 0; i < minutos.length ; i++) {
			tempo_total = tempo_total + minutos[i];
		}

		System.out.println();
		System.out.println("Tempo necessário para descontaminar as salas marcadas: " + t / 60 + " horas e " + t % 60 + " minutos");
		System.out.println("Tempo necessário para descontaminar todas as salas do hospital: " + tempo_total / 60 + " horas e " + tempo_total % 60 + " minutos");	

	}
}

