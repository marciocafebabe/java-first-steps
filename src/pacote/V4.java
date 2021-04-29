package pacote;
import java.util.Scanner;

public class V4 {
	
	public static String cupom(String vale) {
		if (vale.equalsIgnoreCase("VALE10")) {
			return "10% de desconto\nTotal: 9 reais";
		} else {
			return "Cupom inválido\nTotal: 10 reais";
		}
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Subtotal: 10 reais");
		System.out.println("Cupom de desconto:");
		String vale = leitor.next();
		leitor.close();
		System.out.println(cupom(vale));
	}
}
