package pacote;
import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Quantos produtos em estoque?");
		int qntProdutos = leitor.nextInt();
		
		
		String[][] nomeECodigo = new String[qntProdutos][2];// 10 produtos
		String produtoDesejado = "Nada";
		double[] preco = new double[nomeECodigo.length];
		int[] qntDisponivel = new int[nomeECodigo.length];
		int[] qntVendida = new int[nomeECodigo.length];
		double dinheiroArrecadado = 0;
		int qntDesejada = 0;
		int tentativas;
		
		for (int i = 0; i < nomeECodigo.length; i++) {
			System.out.println("Nome do Produto:");
			nomeECodigo[i][0] = leitor.next();
			
			System.out.println("C�digo do produto:");
			nomeECodigo[i][1] = leitor.next();
			
			System.out.println("Pre�o da unidade (sem decimais):");
			preco[i] = leitor.nextDouble();
			
			System.out.println("Quantidade disponivel do Produto:");
			qntDisponivel[i] = leitor.nextInt();
			
			qntVendida[i] = 0; //A quantidade vendida de cada produto � 0.
		}
		
		while (!produtoDesejado.equalsIgnoreCase("C3PO")) {
			System.out.println("\n--- LISTA DOS PRODUTOS ---");
			System.out.println("(Nome, C�digo, Pre�o, Quantidade Dispon�vel)\n");
			
			for (int i = 0; i < nomeECodigo.length; i++) {
				System.out.print(nomeECodigo[i][0] + ", ");
				System.out.print("C�digo (" + nomeECodigo[i][1] + "), ");
				System.out.print(preco[i] + " reais, ");
				System.out.println(qntDisponivel[i]+ " unidades");
			}
			
			System.out.println("\nInteressado em algo?");
			
			System.out.println("Digite o c�digo que voc� deseja comprar:");
			produtoDesejado = leitor.next();
			
			if (!produtoDesejado.equalsIgnoreCase("C3PO")) {
				
				System.out.println("Digite a quantidade desejada (em unidades):");
				qntDesejada = leitor.nextInt();
				
				tentativas = 0;
				System.out.println(); //Pular uma linha
				for (int i = 0; i < nomeECodigo.length; i++) {
					
					if (produtoDesejado.equalsIgnoreCase(nomeECodigo[i][1])) {
						
						if (qntDesejada > qntDisponivel[i]) {
							if (qntDisponivel[i] == 0) {
								System.out.println("Produto fora do estoque!");
							} else {
								System.out.println("QUANTIDADE INDISPON�VEL!");
							}
						
						} else {
							qntDisponivel[i] -= qntDesejada;
							qntVendida[i] += qntDesejada;
							dinheiroArrecadado += preco[i] * qntDesejada;
							
							if (qntDesejada != 0) {
								System.out.println("ACIONANDO ESTEIRA");
							}
						}
					} else {
						tentativas++;
					}
				}
				if (tentativas == nomeECodigo.length) {
					System.out.println("Produto fora do estoque!");
				}
			}
		}
		
		System.out.println("\n--- RELAT�RIO DO DIA ---");
		for (int i = 0; i < nomeECodigo.length; i++) {
			if (qntVendida[i] > 0) {
				System.out.println(nomeECodigo[i][0] + " vendidas(os): " + qntVendida[i]);
			}
		}
		System.out.println("\nDinheiro arrecadado total: " + dinheiroArrecadado + " reais");
	
		leitor.close();
	}

}
