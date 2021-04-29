package pacote;
import java.util.Random;
import java.util.Scanner;

public class Sprint3 {

	public static int numeroAleatorio() {
	    Random gerador = new Random();
	    return gerador.nextInt(11) + 5;
	}
	
	public static void preencherMINUTOS(int[] MINUTOS) {
		for (int i = 0; i < 99; i++) {
			MINUTOS[i] = numeroAleatorio();
		}
	}
	
	public static void main(String[] args) {
		int[] lista1 = new int[5];
		int[] lista2 = new int[5];
		int[] lista3 = new int[5];
		
		int[] lista_final = new int[lista1.length + lista2.length + lista3.length];
		int[] lista_final2 = new int[lista1.length + lista2.length + lista3.length];
		
		int[] MINUTOS = new int[99];
		preencherMINUTOS(MINUTOS);
		
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
		
		for (int i = 0, x = -1; i < 5; i++) {
			x++;
			lista_final[x] = lista1[i];
			x++;
			lista_final[x] = lista2[i];
			x++;
			lista_final[x] = lista3[i];
		}
		
		for (int i = 0; i < lista_final.length; i++) {
			
			for (int x = 0; x < lista_final.length; x++) {
				
				if (lista_final[x] == lista_final[i] && i != x) {
					lista_final[x] = 00;
				}
			}
		}
		System.out.println();
		System.out.println("Lista final:");
		int x = 0;
		for (int i = 0; i < 15; i++) {
			if (lista_final[i] != 00) {
				lista_final2[x] = lista_final[i];
				x++;
			}
		}
		
		int[] lista_unica = new int[x];
		System.out.print("|");
		for (int i = 0; i < lista_unica.length; i++) {
			lista_unica[i] = lista_final2[i];
			System.out.print(lista_unica[i] + "|");
		}
		
		
		int y, t = 0;
		for (int i = 0; i < x; i++) {
			y = (lista_unica[i]-1);
			t = t + MINUTOS[y];
		}
		
		System.out.println();
		System.out.println("Tempo necessário para descontaminar todas as salas: " + t / 60 + " horas e " + t % 60 + " minutos");
		
	}

}
