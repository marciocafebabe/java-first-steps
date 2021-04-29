package pacote;

/*
* Coment�rio do programa:
* 
* Fun��o:
* Esse programa serve para calcular o or�amento de um servi�o de
* requisi��o de p�gina(s) responsiva(s) e/ou CMS(s) e/ou Landing Page(s). 
*
* Funcionamento:
* Isso � calculado multiplicando as quantidades requisitadas de cada
* servi�o pelos custos unit�rios de cada um. Ap�s as 3 multiplica��es,
* esses tr�s valores s�o somados, e o resultado � o or�amento dos
* servicos juntos.
*/

import java.util.Scanner;

public class ServicoDevWeb {

	public static void main(String[] args) {
			
		int pr, cms, lp, qpr, qcms, qlp;
		Scanner s = new Scanner(System.in);
			
		System.out.println("Quanto � cobrado por P�gina responsiva?");
			pr = s.nextInt();
			
			System.out.println("Quanto � cobrado por CMS?");
			cms = s.nextInt();

			System.out.println("Quanto � cobrado por Landing Page?");
			lp = s.nextInt();
			
			System.out.println("Deseja contratar quantas P�ginas responivas?");
			qpr = s.nextInt();

			System.out.println("Deseja contratar quantos CMS?");
			qcms = s.nextInt();

			System.out.println("Deseja contratar quantas Landing Pages?");
			qlp = s.nextInt();
			
			int orcamento = 
			pr * qpr + 
			cms * qcms + 
			lp * qlp;
			
			System.out.println(orcamento);
			
			s.close();
	}

}
