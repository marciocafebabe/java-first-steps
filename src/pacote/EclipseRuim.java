package pacote;
import java.util.Scanner;

/*
 * Convers�o de temperatura:
 * 
 * Fun��o:
 * Converter uma temperatura em graus Celcius, dada pelo usu�rio, em graus
 * Fahrenheit para que o novo valor seja fornecido ao usu�rio. 
 * 
 * Funcionamento: 
 * Multiplica-se o valor da temperatura em graus Celcius por
 * 9 e depois divide-se o total por 32, deixando assim a temperatura em graus
 * Fahrenheit
 */

public class EclipseRuim {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		double c;
		double f;
		
		System.out.println("Temp. em graus Celcius: ");
			c = s.nextDouble();	
			
			f = c * 9 / 5 + 32;
		System.out.println("Em graus Fahrenheit:" + f);
		
		s.close();
	}

}
