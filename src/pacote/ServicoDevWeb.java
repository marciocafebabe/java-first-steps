package pacote;

/*
* Comentário do programa:
* 
* Função:
* Esse programa serve para calcular o orçamento de um serviço de
* requisição de página(s) responsiva(s) e/ou CMS(s) e/ou Landing Page(s). 
*
* Funcionamento:
* Isso é calculado multiplicando as quantidades requisitadas de cada
* serviço pelos custos unitários de cada um. Após as 3 multiplicações,
* esses três valores são somados, e o resultado é o orçamento dos
* servicos juntos.
*/

import java.util.Scanner;

public class ServicoDevWeb {

	public static void main(String[] args) {
			
		int pr, cms, lp, qpr, qcms, qlp;
		Scanner s = new Scanner(System.in);
			
		System.out.println("Quanto é cobrado por Página responsiva?");
			pr = s.nextInt();
			
			System.out.println("Quanto é cobrado por CMS?");
			cms = s.nextInt();

			System.out.println("Quanto é cobrado por Landing Page?");
			lp = s.nextInt();
			
			System.out.println("Deseja contratar quantas Páginas responivas?");
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
