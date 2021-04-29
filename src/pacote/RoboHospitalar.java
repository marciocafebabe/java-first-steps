package pacote;
/*
 		 *    Trabalho FIAP, Projeto N2020, 1SIC, Professor Andr� David
 		 *	  
 		 *	  Participantes:
 		 *
 		 *  - M�rcio de Souza Cintra Filho
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

// (O come�o da documenta��o do programa, juntamente com o nome dos integrantes do grupo, est� mais acima.)

public class RoboHospitalar {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in); 
		
		Random gerador = new Random(); 
		
		DecimalFormat df = new DecimalFormat("#.####"); //Serve para formatar o n�mero sorteado para que sejam mostradas apenas 4 casas decimais.
		
		String num4Casas; //Armazena o n�mero formatado para a impress�o.
		
		int area, resto, n;
		
		double numero;
		
		System.out.println("Seja bem vindo ao programa de simula��o de rob� hospitalar desinfetante da LightStrike contra v�rus e germes"
				+ "\nfeito pelo grupo Conquer Squad. Para o funcionamento do rob�, ele � equipado com receptor GPS, sensores"
				+ "\naceler�metros, sensores de ambientee l�mpada emissora de raios UV (ultravioleta). O rob� age da seguinte"
				+ "\nmaneira: Se ele encontrar uma col�nia de v�rus, o rob� aciona uma emiss�o de raios UV para a desinfec��o"
				+ "\ndo ambiente. Se algum obst�culo for encontrado na sua frente, ele faz o desvio."
				+ "\n\nDigite um n�mero que represente a �rea infectada do ambiente hospitalar em cent�metros quadrados"
				+ "\n(Digite um n�mero m�ltiplo de 10, pois o rob� faz a an�lise do ambiente a cada 10 cent�metros quadrados.)");
			area = leitor.nextInt();
			resto = area % 10;
			
			//Enquanto a �rea fornecida n�o for m�ltipla de 10, o loop abaixo � executado.
			
			while (resto != 0) {
				System.out.println("Por favor, digite um n�mero m�ltiplo de 10.");
				area = leitor.nextInt();
				resto = area % 10;
			}
			
			n = 1; //Essa vari�vel serve para contar quantas an�lises foram feitas at� desinfetar o ambiente.
			
			//O loop abaixo � repetido at� que toda a �rea infectada tiver sido descontaminada.
			
			for (int i = 0; i < area; i += 10) {
				
				numero = gerador.nextFloat(); //Sorteia um n�mero de 0 a 1.
				num4Casas = df.format(numero); //Formata��o para 4 casas decimais.
				System.out.println("\n-");
				System.out.println("\nAn�lise n�mero " + n + ":");
				System.out.println(num4Casas);
				
				//Se o n�mero sorteado for menor que "0,4589", � mostrado que o rob� desinfectou 10 cm quadrados de �rea, e a vari�vel 
				//contadora "i" continua sendo aumentada em 10. Se for maior que "0,4589", a vari�vel "i", ap�s o aumento de 10, passa a ter uma diminui��o de 10 n�meros,
				//j� que toda a �rea precisa ser desinfetada. Por isso ocorre esse retorno na contagem do i.
				
				if (numero <= 0.4589) {
					System.out.println("O rob� encontrou uma col�nia de v�rus e acionou a emiss�o de raios UV para desinfetar o ambiente.");
				
				} else {
					i -= 10;
				}
				
				//Dependendo do n�mero maior que 0,4589 sorteado, o rob� mostra a mensagem de ter encontrado um ser humano ou um equipamento.
				
				if (numero > 0.4589 && numero < 0.7999) {
					System.out.println("O rob� encontrou um ser humano. Portanto, ele vai escolher outra dire��o para movimentar-se.");
					
				} else if (numero >= 0.7999) {
					System.out.println("O rob� encontrou um equipamento hospitalar. Portanto, ele vai escolher outra dire��o para movimentar-se.");
				}
				
				n++; //Aumenta o n�mero da quantidade de an�lises feitas.
			}
			
			//Ap�s tudo isso, a mensagem final � exibida.
			System.out.println("\n-\n\nO rob� desinfectou toda a �rea contaminada!");
			
		leitor.close(); //Leitor Scanner fecha.
	}

}
