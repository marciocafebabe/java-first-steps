package pacote;
import java.util.Scanner;

public class Funcoes {

	public static int nivel, qntAulas;
	public static double salario;
	
	public static void entrada() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o n�vel do professor, 1, 2 ou 3:");
		nivel = leitor.nextInt();
		System.out.println("Digite a quantidade de aulas que o professor deu:");
		qntAulas = leitor.nextInt();
		leitor.close();
	}
	
	public static void processamento() {
		if (nivel == 1) {
			salario = qntAulas * 12;
		} else if (nivel == 2) {
			salario = qntAulas * 17;
		} else if (nivel == 3) {
			salario = qntAulas * 25;
		}
	}
	
	public static void saida() {
		System.out.println("O sal�rio do professor � de " + salario + " reais.");
	}
	
	public static void main(String[] args) {
	}

}
