package pacote;
import java.util.Scanner;

public class ConquerSquadRobo2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double ddp = 0;
		int destino = 0;
		int x = 1; // O rob� localiza-se, no come�o, no x = 1 no plano cartesiano do mapa.
		int y = 0; // O rob� localiza-se, no come�o, no y = 0 no plano cartesiano do mapa.
		int finalizar = 0;
		double distTotal = 0;
		int dist = 0;
		int bateu = 0;
		int n = 0;
		String direcao;
				
		System.out.println("Informe a quantidade de volts usada no rob�:");
		ddp = s.nextDouble();
		double ddpInicial = ddp;
		
		
		while (ddp > 0 && finalizar == 0 && bateu == 0 && destino == 0) {
			//Come�o do loop. Rob� em a��o.
			direcao = "Nada";
			
			System.out.println("Digite 0 para continuar.\nDigite outro n�mero para parar.");
			finalizar = s.nextInt();
			
			if (finalizar == 0) {
				n = 0;
				System.out.println("Valores v�lidos para dire��o: 'Frente', 'Tras', 'Esquerda', 'Direita'.");
				while (
						!(direcao.equals("FRENTE")) 
						&& 
						!(direcao.equals("TRAS")) 
						&&
						!(direcao.equals("ESQUERDA")) 
						&& 
						!(direcao.equals("DIREITA"))
						) {
					
					if (n > 0) {
						System.out.println("Por favor, escreva uma dire��o v�lida.");
					
					} else {
						System.out.println("Escreva para onde o rob� se direcionar�:");
					}
					
					direcao = s.next();			
					
					direcao = direcao.toUpperCase();
					
					n++;
				}
				System.out.println("Escreva a dist�ncia que o rob� andar� em cent�metros:");
				dist = s.nextInt();
				
					if (direcao.equals("FRENTE")) {
						for (int i = 0; i < dist; i++) {
							
							if (ddp > 0) {
							
								y++;
								distTotal++;
								ddp -= 0.1;
								
								if (
									x < 0
									||
									y < 0
									||
									x > 18
									||
									y > 15
									||
									x >= 3 && x <= 15 && y >= 0 && y <= 5
									||
									x >= 10 && x <= 15 && y >= 6 && y <= 12
									||
									x >= 0 && x <= 6 && y >= 9 && y <= 15
									) {
										bateu = 1;
										distTotal--;
										i = dist;
								}
							} else {
								i = dist;
							}	
						
						}						
					
					} else if (direcao.equals("TRAS")) {
						for (int i = 0; i < dist; i++) {
							
							if (ddp > 0) {
							
								y--;
								distTotal++;
								ddp -= 0.1;
								
								if (
									x < 0
									||
									y < 0
									||
									x > 18
									||
									y > 15
									||
									x >= 3 && x <= 15 && y >= 0 && y <= 5
									||
									x >= 10 && x <= 15 && y >= 6 && y <= 12
									||
									x >= 0 && x <= 6 && y >= 9 && y <= 15
									) {
										bateu = 1;
										distTotal--;
										i = dist;
								}
							} else {
								i = dist;
							}	
						
						}						
					
					} else if (direcao.equals("ESQUERDA")) {
						for (int i = 0; i < dist; i++) {
							
							if (ddp > 0) {
							
								x--;
								distTotal++;
								ddp -= 0.1;
								
								if (
									x < 0
									||
									y < 0
									||
									x > 18
									||
									y > 15
									||
									x >= 3 && x <= 15 && y >= 0 && y <= 5
									||
									x >= 10 && x <= 15 && y >= 6 && y <= 12
									||
									x >= 0 && x <= 6 && y >= 9 && y <= 15
									) {
										bateu = 1;
										distTotal--;
										i = dist;
								}
							} else {
								i = dist;
							}	
						
						}						
					
					} else if (direcao.equals("DIREITA")) {
						for (int i = 0; i < dist; i++) {
							
							if (ddp > 0) {
							
								x++;
								distTotal++;
								ddp -= 0.1;
								
								if (
									x < 0
									||
									y < 0
									||
									x > 18
									||
									y > 15
									||
									x >= 3 && x <= 15 && y >= 0 && y <= 5
									||
									x >= 10 && x <= 15 && y >= 6 && y <= 12
									||
									x >= 0 && x <= 6 && y >= 9 && y <= 15
									) {
										bateu = 1;
										distTotal--;
										i = dist;
								}
							} else {
								i = dist;
							}	
						
						}
					
					}
				if (x == 17 && y == 0) {
					destino = 1;			
				}
			}	
		
		} //Final do Loop
		
		double ddpMostrar = ddpInicial - (distTotal / 10);
		
		if (finalizar == 1) {
			System.out.println("Voc� parou o rob�.");
		
		} else if (bateu == 1) {
			System.out.println("O rob� bateu.");
		}
		
		if (ddpMostrar > 0) {
			System.out.println("O rob� ficou com " + ddpMostrar + " volts.");
		
		} else {
			System.out.println("O rob� ficou sem energia.\n");
		}
		
		if (destino == 0) {
			System.out.println("O rob� n�o chegou no destino.");
		
		} else {
			System.out.println("O rob� chegou no destino.");
		}
		
		if (ddpMostrar < 0) {
			ddpMostrar = 0;
		}
		
		System.out.println("O rob� andou " + distTotal + " cent�metros.");
		
		s.close();
	}

}