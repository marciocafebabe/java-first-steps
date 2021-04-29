package pacote;

import java.util.Scanner;

public class ExsDengue2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o valor por hora do professor: ");
		double aulasSemanais = s.nextDouble();
		
		System.out.println("Digite o valor hora-aula: ");
		double horaAula = s.nextDouble();	
		
		double salarioBase = aulasSemanais * 4.5 * horaAula;
		double horaAtv = salarioBase * 5 / 100;
		double salarioMensal = salarioBase * 105/100;
		double dsr = 0.167 * salarioMensal;
		
		System.out.println("O salário base do professor é de " + salarioBase + " reais.");
		System.out.println("Adicional de hora-atividade:" + horaAtv + " reais.");
		System.out.println("Descanso semanal remunerado: " + dsr);
		System.out.println("Salário mensal: " + salarioMensal);
		
		s.close();
	}
}