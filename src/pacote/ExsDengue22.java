package pacote;

import java.util.Scanner;

public class ExsDengue22 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome do Produto:");
		String nomeProduto = s.next();
		
		System.out.println("Digite a quantidade desse produto: ");
		int qntProduto = s.nextInt();
		
		System.out.println("Digite o preço do produto: ");
		double precoProduto = s.nextDouble();
		
		double valorFinal = qntProduto * precoProduto;
		double aaVista = valorFinal * 95 / 100;
		double parcela = valorFinal * 107 / 100 / 2;
		
		System.out.println("Produto: " + qntProduto + "x " + nomeProduto);
		System.out.println("Valor Total: " + valorFinal + " reais");
		System.out.println("Pagamentos: ");
		System.out.println("À Vista: " + aaVista + " reais");
		System.out.println("Parcelado: 2x de " + parcela + " reais");
		s.close();
	}
}
