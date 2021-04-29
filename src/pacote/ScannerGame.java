package pacote;

import java.util.Scanner;

public class ScannerGame {

	public static void main(String[] args) {
		
			
		/* 	Nome: M�rcio de Souza Cintra Filho
		 * 	Sala: 1SIC
		 *	RM: 86318
		 *  Nome do Jogo: Masmorra da perdi��o
		 *	Atividade solicitada pelo professor Andr� David para a disciplina "Laborat�rio de Programa��o".
		 *  
		 *  - Leia todos os coment�rios antes de come�ar.
		 *  
		 *  IMPORTANTE: 
		 *  - Esse jogo � separado em duas classes: "ScannerGame.java" e "ScannerGame2.java". Comece primeiro
		 *  pelo "ScannerGame" e s� mude para o outro quando o jogo pedir.
		 *  
		 *  - A segunda classe tem vari�veis n�o utilizadas. Essa foi minha alternativa para haver
		 *  "SKIPS" nos di�logos.
		 */
		
		Scanner s = new Scanner(System.in);		
		//Esse � o leitor Scanner "s".	
		
		String perdeu = "\nVoc� fracassou.\nPressione F11 para recome�ar.";
		//A vari�vel acima � usada em mensagens de fracasso e, na sequ�ncia do fracasso do jogador, o leitor Scanner "s" � fechado, pois ele est� logo no
		//final do c�digo, que � pra onde o programa vai se n�o h� mais condi��es � frente.
		
		String proxSala = "Voc� continua para a pr�xima sala.\nAgora abra e execute (dar 'Run') a classe 'ScannerGame2' para iniciar a pr�xima parte.";
		//Mensagem padr�o de t�rmino da primeira parte.
		
		System.out.println();
		System.out.println("MASMORRA DA PERDI��O");
		System.out.println();
		System.out.println("Para come�ar, escreva seu nome e pressione ENTER.\nPara sair, digite 2 e ENTER.");		
		
		String nome = s.next();
	
		//O programa pergunta o nome do usu�rio e o armazena em uma "String" se o valor for diferente de 2.    
		//Se o valor da String for igual a 2, o jogador sai do jogo.
		if (nome != "2") {
			
			System.out.println("O Rei precisa de sua ajuda, " + nome + ".");
			System.out.println("Ele pede a voc� para investigar a Masmorra da Perdi��o.");
			System.out.println("Habitantes do reino est�o desaparecendo e ningu�m sabe o porqu�.");
			System.out.println("Muito provavelmente eles est�o sendo sequestrados e levados para");
			System.out.println("l�, por um motivo desconhecido.");
			System.out.println();
			System.out.println("Voc� aceita essa miss�o?");
			System.out.println("(Digite 1 ou 2, como sim ou n�o, respectivamente)");
			int aceitar = s.nextInt();
			
			//Se o jogador digitar 1 ele aceita a miss�o proposta pelo Rei,
			//sen�o, a mensagem de fracasso padr�o � exibida.
			
			if (aceitar == 1) {
				
				System.out.println();
				System.out.println("Voc� toma um dia para preparar seus armamentos.");
				System.out.println("Voc� precisa de uma arma.");
				System.out.println("O que voc� prefere: ");
				System.out.println("Uma adaga, uma espada longa ou vai lutar com o punho?");
				System.out.println("(1, 2 ou 3, respectivamente)");
				int arma = s.nextInt();
				
				//Se o jogador digitar 1 ou 2, para selecionar a adaga ou a espada, o n�mero escolhido � armazenado na vari�vel "arma".
				//Se o jogador digitar 3, um tipo de mensagem de fracasso espec�fica � exibida.  
				//Sen�o, a mensagem de fracasso padr�o � exibida.
				
				if (arma == 1 || arma == 2) {
					System.out.println("Voc� dorme e espera o dia seguinte.");
					System.out.println("Voc� viaja at� a masmorra.");
					System.out.println("Logo na entrada, a qual voc� demorou para achar, pois est� muito suja");
					System.out.println("e escondida, voc� percebe que h� um troll de mais ou menos 3 metros de altura.");
					System.out.println("N�o � poss�vel identificar exatamente o que ele est� fazendo ali.");
					System.out.println("O que voc� faz?");
					System.out.println("\nVoc� o ataca de frente, o ataca sorrateiramente ou tenta distra�-lo?");
					System.out.println("(1, 2 ou 3)");
					int atkTroll1 = s.nextInt();
					
					//Se o jogador digitar 1 para atacar de frente e ele tiver escolhido a adaga anteriormente, uma mensagem de fracasso espec�fica � exibida.
					//Se o jogador digitar 2 para atacar sorrateiramente e ele tiver escolhido a espada longa anteriormente, outra mensagem de fracasso � exibida.
					//Se outras combina��es poss�veis (ou seja, dentro das op��es descritas no programa) forem escolhidas, o jogador cai no segundo "else if".
					//Sen�o, a mensagem de fracasso padr�o � exibida.
					if (atkTroll1 == 1 && arma == 1) {
						System.out.println("Ele v� voc� chegar correndo para cima dele com sua adaga e");
						System.out.println("e te acha muito engra�ado. Antes de voc� chegar perto dele,");
						System.out.println("ele te d� um soco forte no t�rax e voc� morre.");
						System.out.println(perdeu);
					
					} else if (atkTroll1 == 2 && arma == 2) {	
						System.out.println("Voc� tenta atac�-lo sorrateiramente com sua espada longa, mas");
						System.out.println("ela esbarra em um arbusto e o troll te percebe. Logo em seguida,");
						System.out.println("ele, assustado, mexe os bra�os bruscamente, esbarra em voc�,");
						System.out.println("voc� voa pra longe e bate com a cabe�a numa �rvore.");
						System.out.println(perdeu);
						s.close();
						
					} else if ((atkTroll1 == 1 && arma == 2) || (atkTroll1 == 2 && arma == 1) || (atkTroll1 == 3)) {
							
							//Se o jogador digitar 1 para atacar de frente e ele tiver escolhido a espada longa anteriormente, uma mensagem de sucesso
							//� exibida. Se o jogador digitar 1 para atacar de frente e ele tiver escolhido a adaga anteriormente ou se ele digitar 3, uma
							//mensagem de sucesso espec�fica � exibida dependendo do caso.
							//Se nenhuma das alternativas anteriores ocorrer, a mensagem de fracasso padr�o � exibida.
							if ((atkTroll1 == 1 && arma == 2) || (atkTroll1 == 2 && arma == 1)) {
							System.out.println("O ataque foi um sucesso.");
							System.out.println("Voc� recupera sua arma e entra na masmorra.");
							System.out.println("(Digite 1)");
							
							} else if ((atkTroll1 == 3)) {
								System.out.println("Voc� joga uma pedra nos arbustos do lado e ele n�o liga muito");
								System.out.println("para o barulho. Depois de alguns minutos chega outro troll na");
								System.out.println("entrada da masmorra, os dois trolls se d�o as m�os e saem de l�.");
								System.out.println("Voc� entra na masmorra.");
								System.out.println("(Digite 1)");
							}
							int continuar1 = s.nextInt();
							
							//Se o valor informado for 1, o jogador continua. Sen�o, a mensagem de fracasso padr�o � exibida.
							if (continuar1 == 1) {
							System.out.println();
							System.out.println("Logo no come�o, h� uma porta. Ao abr�-la voc� entra em uma sala.");
							System.out.println("Nela h�, o que aparenta ser, um an�o ferreiro e sua bancada de trabalho.");
							System.out.println("H� armas grandes e pesadas em uma estante ao lado.");
							System.out.println("Voc� quer conversar com ele, chegar agressivamente para lutar");
							System.out.println("ou roubar uma arma dele para atac�-lo?");
							System.out.println("(1, 2 ou 3)");
							int anao1 = s.nextInt();
							
							
								//Se o valor informado for 1 ou 2, o jogador entra na primeira condi��o. Se o valor for 3, uma mensagem de fracasso espec�fica � exibida.
								//Sen�o, a mensagem de fracasso padr�o � exibida.
								if ((anao1 == 1) || (anao1 == 2)) {
									
									//Se o valor informado for 1, o jogador cai na primeira condi��o.
									//Se o valor informado for 2, o jogador cai na segunda condi��o.
									//Se o valor informado for 3, uma mensagem de fracasso espec�fica � exibida.
									//Sen�o, a mensagem de fracasso padr�o � exibida.
									if (anao1 == 1) {
										System.out.println("Voc� chega amigavelmente e pergunta ao an�o o que");
										System.out.println("ele faz ali. Ele diz:");
										System.out.println("'Eu trabalho como ferreiro para os monstros da masmorra.");
										System.out.println("Me transferiram para essa sala que fica longe da entrada principal,");
										System.out.println("e j� t� enchendo o saco. Al�m disso, o meu chefe � muito chato.");
										System.out.println("(Voc� percebe que na verdade voc� entrou pela entrada secreta da masmorra.)");
										System.out.println("'Se quiser avan�ar para a pr�xima sala, fique � vontade.'");
										System.out.println();
										System.out.println("Voc� avan�a, pede mais informa��es ou tenta matar o an�o covardemente?");
										System.out.println("(1, 2 ou 3)");
										int anao21 = s.nextInt();
										
										//Se o valor informado for 1, o jogador conclui a primeira parte do jogo.
										//Se o valor informado for 2, uma mensagem espec�fica � exibida, e o jogador conclui a primeira parte do jogo tamb�m.
										//Se o valor informado for 3, uma mensagem � exibida e as condicionais continuam.
										if (anao21 == 1) {
											System.out.println(proxSala);
											
										} else if (anao21 == 2) {
											System.out.println("'N�o farei isso pois respeito o mist�rio que uma masmorra pode");
											System.out.println("proporcionar. Continue por conta pr�pria.'");
											System.out.println(proxSala);
											
										} else if (anao21 == 3) {
											System.out.println("Voc� finge que est� indo para outra sala e chega por tr�s do an�o e");
											System.out.println("tenta o atacar pelas costas.");
											
											//Se o jogador tiver escolhido a adaga, a primeira condi��o ser� aplicada e a mensagem ser� exibida.
											//Se a arma escolhida for uma espada longa, uma mensagem de fracasso espec�fica � exibida.
											//Sen�o, a mensagem de fracasso padr�o � exibida.
											if (arma == 1) {
												System.out.println("O golpe com sua adaga foi fatal.");
												System.out.println("Voc� ouve um ru�do estranho vindo da estante de armas do an�o.");
												System.out.println("Voc� quer pegar uma espada dessa estante? Sim ou N�o?");
												System.out.println("(1 ou 2)");
												
												int anao3 = s.nextInt();
												
												//Se o jogador disser que n�o quer a arma, ele segue para a pr�xima sala.
												//Se o jogador disser que quer a arma, uma mensagem de fracasso espec�fica � exibida.
												//Sen�o, a mensagem de fracasso padr�o � exibida.
												if (anao3 == 2) {
													System.out.println(proxSala);
												
												} else if (anao3 == 1){
													System.out.println("A espada come�a a tremer muito e voc� sai de perto.");
													System.out.println("Voc� ouve uma voz grossa vindo da arma dizendo:");
													System.out.println("'PARE, " + nome + ", POIS A ESFERA NUNCA PERDOA!'");
													System.out.println("Depois disso a espada explode em peda�os e voc� se fere gravemente");
													System.out.println(perdeu);
													
												} else {
													System.out.println(perdeu);
													s.close();
												}

											} else if (arma == 2) {
												System.out.println("Ele ouve voc� tirando a arma da bainha e contra-ataca com a pr�pria adaga.");
												System.out.println(perdeu);
												s.close();
											
											} else {
												System.out.println(perdeu);
												s.close();
											}
										
										}
										
									} else if (anao1 == 2) {
										System.out.println("Voc� d� uma investida surpresa. Quando o an�o percebe, ele");
										System.out.println("rapidamente se desvia. Ele tenta pegar uma arma da estante mas");
										System.out.println("ele � muito baixinho e n�o consegue pegar. Ele te pergunta:");
										System.out.println("'Voc� pode pegar essa espada pra mim? Pra a gente ter uma");
										System.out.println("luta justa'");
										System.out.println("Voc� quer ajud�-lo? Sim ou n�o?");
										System.out.println("(1 ou 2)");
										int anao22 = s.nextInt();
										
										//Se o jogador disser que n�o quer ajudar o an�o, ele segue para a pr�xima sala.
										//Se o jogador disser que quer ajudar o an�o, uma mensagem de fracasso espec�fica � exibida.
										//Sen�o, a mensagem de fracasso padr�o � exibida.
										if (anao22 == 1) {
											System.out.println("Quando voc� vai o ajudar ele pega uma adaga no seu bolso");
											System.out.println("e te d� uma facada nas costas.");
											System.out.println(perdeu);
											s.close();
											
										} else if (anao22 == 2) {
											System.out.println("Voc� o ataca e ele morre.");
											System.out.println(proxSala);
											
										} else {
											System.out.println(perdeu);
											s.close();
										}
									}
									
								} else if (anao1 == 3) {
									System.out.println("Voc� chega correndo, pega uma arma da estante e tenta atac�-lo.");
									System.out.println("Voc� n�o consegue porque a arma estava amaldi�oada, ent�o a");
									System.out.println("pr�pria arma gira sozinha e acerta seu pesco�o.");
									System.out.println(perdeu);
								} else {
									System.out.println(perdeu);
								}
							
							} else {
								System.out.println(perdeu);
							}
							
					} else {
						System.out.println(perdeu);
					}	
					
				} else if (arma == 3) {
					System.out.println();
					System.out.println("No dia seguinte voc� chega correndo na masmorra achando que � o Saitama e morre.");
					System.out.println(perdeu);
				} else {
					System.out.println(perdeu);
				}
				
			} else {
				System.out.println(perdeu);
			}
		
		} else {
			System.out.println("Voc� saiu.");
		}
		
		s.close();
	}
}