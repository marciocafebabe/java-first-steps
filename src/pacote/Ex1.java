package pacote;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		int x;
		int y = 1;
		int soma = 0;
		
		System.out.println("Digite um número:");
		x = leitor.nextInt();
		
		
		while (y <= x) {
			soma = soma + y * y;
			y++;
		} System.out.println(soma);
		
		leitor.close();
	}

}
