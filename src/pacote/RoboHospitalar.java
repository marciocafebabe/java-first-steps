package pacote;
/*
 		 *    Trabalho FIAP, Projeto N2020, 1SIC, Professor André David
 		 *	  
 		 *	  Participantes:
 		 *
 		 *  - Márcio de Souza Cintra Filho
         *    RM - 86318
         * 
         *  - Gabriel Carlos Barruzi de Morais 
         *    RM - 85366
         * 
         *  - Luan Cassanho Araujo
         *    RM - 86046
         * 
         *  - Ideraldo Rui do Carmo Biecco
         *    RM - 85934
         * 
         *  - Lucas Afonso Pido 
         *    RM - 83736
 */

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

// (O começo da documentação do programa, juntamente com o nome dos integrantes do grupo, está mais acima.)

public class RoboHospitalar {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in); 
		
		Random gerador = new Random(); 
		
		DecimalFormat df = new DecimalFormat("#.####"); //Serve para formatar o número sorteado para que sejam mostradas apenas 4 casas decimais.
		
		String num4Casas; //Armazena o número formatado para a impressão.
		
		int area, resto, n;
		
		double numero;
		
		System.out.println("Seja bem vindo ao programa de simulação de robô hospitalar desinfetante da LightStrike contra vírus e germes"
				+ "\nfeito pelo grupo Conquer Squad. Para o funcionamento do robô, ele é equipado com receptor GPS, sensores"
				+ "\nacelerômetros, sensores de ambientee lâmpada emissora de raios UV (ultravioleta). O robô age da seguinte"
				+ "\nmaneira: Se ele encontrar uma colônia de vírus, o robô aciona uma emissão de raios UV para a desinfecção"
				+ "\ndo ambiente. Se algum obstáculo for encontrado na sua frente, ele faz o desvio."
				+ "\n\nDigite um número que represente a área infectada do ambiente hospitalar em centímetros quadrados"
				+ "\n(Digite um número múltiplo de 10, pois o robô faz a análise do ambiente a cada 10 centímetros quadrados.)");
			area = leitor.nextInt();
			resto = area % 10;
			
			//Enquanto a área fornecida não for múltipla de 10, o loop abaixo é executado.
			
			while (resto != 0) {
				System.out.println("Por favor, digite um número múltiplo de 10.");
				area = leitor.nextInt();
				resto = area % 10;
			}
			
			n = 1; //Essa variável serve para contar quantas análises foram feitas até desinfetar o ambiente.
			
			//O loop abaixo é repetido até que toda a área infectada tiver sido descontaminada.
			
			for (int i = 0; i < area; i += 10) {
				
				numero = gerador.nextFloat(); //Sorteia um número de 0 a 1.
				num4Casas = df.format(numero); //Formatação para 4 casas decimais.
				System.out.println("\n-");
				System.out.println("\nAnálise número " + n + ":");
				System.out.println(num4Casas);
				
				//Se o número sorteado for menor que "0,4589", é mostrado que o robô desinfectou 10 cm quadrados de área, e a variável 
				//contadora "i" continua sendo aumentada em 10. Se for maior que "0,4589", a variável "i", após o aumento de 10, passa a ter uma diminuição de 10 números,
				//já que toda a área precisa ser desinfetada. Por isso ocorre esse retorno na contagem do i.
				
				if (numero <= 0.4589) {
					System.out.println("O robô encontrou uma colônia de vírus e acionou a emissão de raios UV para desinfetar o ambiente.");
				
				} else {
					i -= 10;
				}
				
				//Dependendo do número maior que 0,4589 sorteado, o robô mostra a mensagem de ter encontrado um ser humano ou um equipamento.
				
				if (numero > 0.4589 && numero < 0.7999) {
					System.out.println("O robô encontrou um ser humano. Portanto, ele vai escolher outra direção para movimentar-se.");
					
				} else if (numero >= 0.7999) {
					System.out.println("O robô encontrou um equipamento hospitalar. Portanto, ele vai escolher outra direção para movimentar-se.");
				}
				
				n++; //Aumenta o número da quantidade de análises feitas.
			}
			
			//Após tudo isso, a mensagem final é exibida.
			System.out.println("\n-\n\nO robô desinfectou toda a área contaminada!");
			
		leitor.close(); //Leitor Scanner fecha.
	}

}
