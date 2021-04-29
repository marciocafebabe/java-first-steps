package pacote;

public class Vetores5 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[] valores = {1, 1, 7, 2, 3 , 9, 7, 1, 2};
		boolean nao_se_repete;
		nao_se_repete = false;
		
		for (int i=0; i<valores.length; i++) {
			nao_se_repete = true;
			for (int i2=0;i2<valores.length;i2++) {	
				if(valores[i]==valores[i2] && i != i2) {
					nao_se_repete = false;
				}
			}
			if (nao_se_repete = true) {
				System.out.println(valores[i]);
			}
		}
	}

}
