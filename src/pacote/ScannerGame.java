package pacote;

import java.util.Scanner;

public class ScannerGame {

	public static void main(String[] args) {
		
			
		/* 	Nome: Márcio de Souza Cintra Filho
		 * 	Sala: 1SIC
		 *	RM: 86318
		 *  Nome do Jogo: Masmorra da perdição
		 *	Atividade solicitada pelo professor André David para a disciplina "Laboratório de Programação".
		 *  
		 *  - Leia todos os comentários antes de começar.
		 *  
		 *  IMPORTANTE: 
		 *  - Esse jogo é separado em duas classes: "ScannerGame.java" e "ScannerGame2.java". Comece primeiro
		 *  pelo "ScannerGame" e só mude para o outro quando o jogo pedir.
		 *  
		 *  - A segunda classe tem variáveis não utilizadas. Essa foi minha alternativa para haver
		 *  "SKIPS" nos diálogos.
		 */
		
		Scanner s = new Scanner(System.in);		
		//Esse é o leitor Scanner "s".	
		
		String perdeu = "\nVocê fracassou.\nPressione F11 para recomeçar.";
		//A variável acima é usada em mensagens de fracasso e, na sequência do fracasso do jogador, o leitor Scanner "s" é fechado, pois ele está logo no
		//final do código, que é pra onde o programa vai se não há mais condições à frente.
		
		String proxSala = "Você continua para a próxima sala.\nAgora abra e execute (dar 'Run') a classe 'ScannerGame2' para iniciar a próxima parte.";
		//Mensagem padrão de término da primeira parte.
		
		System.out.println();
		System.out.println("MASMORRA DA PERDIÇÃO");
		System.out.println();
		System.out.println("Para começar, escreva seu nome e pressione ENTER.\nPara sair, digite 2 e ENTER.");		
		
		String nome = s.next();
	
		//O programa pergunta o nome do usuário e o armazena em uma "String" se o valor for diferente de 2.    
		//Se o valor da String for igual a 2, o jogador sai do jogo.
		if (nome != "2") {
			
			System.out.println("O Rei precisa de sua ajuda, " + nome + ".");
			System.out.println("Ele pede a você para investigar a Masmorra da Perdição.");
			System.out.println("Habitantes do reino estão desaparecendo e ninguêm sabe o porquê.");
			System.out.println("Muito provavelmente eles estão sendo sequestrados e levados para");
			System.out.println("lá, por um motivo desconhecido.");
			System.out.println();
			System.out.println("Você aceita essa missão?");
			System.out.println("(Digite 1 ou 2, como sim ou não, respectivamente)");
			int aceitar = s.nextInt();
			
			//Se o jogador digitar 1 ele aceita a missão proposta pelo Rei,
			//senão, a mensagem de fracasso padrão é exibida.
			
			if (aceitar == 1) {
				
				System.out.println();
				System.out.println("Você toma um dia para preparar seus armamentos.");
				System.out.println("Você precisa de uma arma.");
				System.out.println("O que você prefere: ");
				System.out.println("Uma adaga, uma espada longa ou vai lutar com o punho?");
				System.out.println("(1, 2 ou 3, respectivamente)");
				int arma = s.nextInt();
				
				//Se o jogador digitar 1 ou 2, para selecionar a adaga ou a espada, o número escolhido é armazenado na variável "arma".
				//Se o jogador digitar 3, um tipo de mensagem de fracasso específica é exibida.  
				//Senão, a mensagem de fracasso padrão é exibida.
				
				if (arma == 1 || arma == 2) {
					System.out.println("Você dorme e espera o dia seguinte.");
					System.out.println("Você viaja até a masmorra.");
					System.out.println("Logo na entrada, a qual você demorou para achar, pois está muito suja");
					System.out.println("e escondida, você percebe que há um troll de mais ou menos 3 metros de altura.");
					System.out.println("Não é possível identificar exatamente o que ele está fazendo ali.");
					System.out.println("O que você faz?");
					System.out.println("\nVocê o ataca de frente, o ataca sorrateiramente ou tenta distraí-lo?");
					System.out.println("(1, 2 ou 3)");
					int atkTroll1 = s.nextInt();
					
					//Se o jogador digitar 1 para atacar de frente e ele tiver escolhido a adaga anteriormente, uma mensagem de fracasso específica é exibida.
					//Se o jogador digitar 2 para atacar sorrateiramente e ele tiver escolhido a espada longa anteriormente, outra mensagem de fracasso é exibida.
					//Se outras combinações possíveis (ou seja, dentro das opções descritas no programa) forem escolhidas, o jogador cai no segundo "else if".
					//Senão, a mensagem de fracasso padrão é exibida.
					if (atkTroll1 == 1 && arma == 1) {
						System.out.println("Ele vê você chegar correndo para cima dele com sua adaga e");
						System.out.println("e te acha muito engraçado. Antes de você chegar perto dele,");
						System.out.println("ele te dá um soco forte no tórax e você morre.");
						System.out.println(perdeu);
					
					} else if (atkTroll1 == 2 && arma == 2) {	
						System.out.println("Você tenta atacá-lo sorrateiramente com sua espada longa, mas");
						System.out.println("ela esbarra em um arbusto e o troll te percebe. Logo em seguida,");
						System.out.println("ele, assustado, mexe os braços bruscamente, esbarra em você,");
						System.out.println("você voa pra longe e bate com a cabeça numa árvore.");
						System.out.println(perdeu);
						s.close();
						
					} else if ((atkTroll1 == 1 && arma == 2) || (atkTroll1 == 2 && arma == 1) || (atkTroll1 == 3)) {
							
							//Se o jogador digitar 1 para atacar de frente e ele tiver escolhido a espada longa anteriormente, uma mensagem de sucesso
							//é exibida. Se o jogador digitar 1 para atacar de frente e ele tiver escolhido a adaga anteriormente ou se ele digitar 3, uma
							//mensagem de sucesso específica é exibida dependendo do caso.
							//Se nenhuma das alternativas anteriores ocorrer, a mensagem de fracasso padrão é exibida.
							if ((atkTroll1 == 1 && arma == 2) || (atkTroll1 == 2 && arma == 1)) {
							System.out.println("O ataque foi um sucesso.");
							System.out.println("Você recupera sua arma e entra na masmorra.");
							System.out.println("(Digite 1)");
							
							} else if ((atkTroll1 == 3)) {
								System.out.println("Você joga uma pedra nos arbustos do lado e ele não liga muito");
								System.out.println("para o barulho. Depois de alguns minutos chega outro troll na");
								System.out.println("entrada da masmorra, os dois trolls se dão as mãos e saem de lá.");
								System.out.println("Você entra na masmorra.");
								System.out.println("(Digite 1)");
							}
							int continuar1 = s.nextInt();
							
							//Se o valor informado for 1, o jogador continua. Senão, a mensagem de fracasso padrão é exibida.
							if (continuar1 == 1) {
							System.out.println();
							System.out.println("Logo no começo, há uma porta. Ao abrí-la você entra em uma sala.");
							System.out.println("Nela há, o que aparenta ser, um anão ferreiro e sua bancada de trabalho.");
							System.out.println("Há armas grandes e pesadas em uma estante ao lado.");
							System.out.println("Você quer conversar com ele, chegar agressivamente para lutar");
							System.out.println("ou roubar uma arma dele para atacá-lo?");
							System.out.println("(1, 2 ou 3)");
							int anao1 = s.nextInt();
							
							
								//Se o valor informado for 1 ou 2, o jogador entra na primeira condição. Se o valor for 3, uma mensagem de fracasso específica é exibida.
								//Senão, a mensagem de fracasso padrão é exibida.
								if ((anao1 == 1) || (anao1 == 2)) {
									
									//Se o valor informado for 1, o jogador cai na primeira condição.
									//Se o valor informado for 2, o jogador cai na segunda condição.
									//Se o valor informado for 3, uma mensagem de fracasso específica é exibida.
									//Senão, a mensagem de fracasso padrão é exibida.
									if (anao1 == 1) {
										System.out.println("Você chega amigavelmente e pergunta ao anão o que");
										System.out.println("ele faz ali. Ele diz:");
										System.out.println("'Eu trabalho como ferreiro para os monstros da masmorra.");
										System.out.println("Me transferiram para essa sala que fica longe da entrada principal,");
										System.out.println("e já tá enchendo o saco. Além disso, o meu chefe é muito chato.");
										System.out.println("(Você percebe que na verdade você entrou pela entrada secreta da masmorra.)");
										System.out.println("'Se quiser avançar para a próxima sala, fique à vontade.'");
										System.out.println();
										System.out.println("Você avança, pede mais informações ou tenta matar o anão covardemente?");
										System.out.println("(1, 2 ou 3)");
										int anao21 = s.nextInt();
										
										//Se o valor informado for 1, o jogador conclui a primeira parte do jogo.
										//Se o valor informado for 2, uma mensagem específica é exibida, e o jogador conclui a primeira parte do jogo também.
										//Se o valor informado for 3, uma mensagem é exibida e as condicionais continuam.
										if (anao21 == 1) {
											System.out.println(proxSala);
											
										} else if (anao21 == 2) {
											System.out.println("'Não farei isso pois respeito o mistério que uma masmorra pode");
											System.out.println("proporcionar. Continue por conta própria.'");
											System.out.println(proxSala);
											
										} else if (anao21 == 3) {
											System.out.println("Você finge que está indo para outra sala e chega por trás do anão e");
											System.out.println("tenta o atacar pelas costas.");
											
											//Se o jogador tiver escolhido a adaga, a primeira condição será aplicada e a mensagem será exibida.
											//Se a arma escolhida for uma espada longa, uma mensagem de fracasso específica é exibida.
											//Senão, a mensagem de fracasso padrão é exibida.
											if (arma == 1) {
												System.out.println("O golpe com sua adaga foi fatal.");
												System.out.println("Você ouve um ruído estranho vindo da estante de armas do anão.");
												System.out.println("Você quer pegar uma espada dessa estante? Sim ou Não?");
												System.out.println("(1 ou 2)");
												
												int anao3 = s.nextInt();
												
												//Se o jogador disser que não quer a arma, ele segue para a próxima sala.
												//Se o jogador disser que quer a arma, uma mensagem de fracasso específica é exibida.
												//Senão, a mensagem de fracasso padrão é exibida.
												if (anao3 == 2) {
													System.out.println(proxSala);
												
												} else if (anao3 == 1){
													System.out.println("A espada começa a tremer muito e você sai de perto.");
													System.out.println("Você ouve uma voz grossa vindo da arma dizendo:");
													System.out.println("'PARE, " + nome + ", POIS A ESFERA NUNCA PERDOA!'");
													System.out.println("Depois disso a espada explode em pedaços e você se fere gravemente");
													System.out.println(perdeu);
													
												} else {
													System.out.println(perdeu);
													s.close();
												}

											} else if (arma == 2) {
												System.out.println("Ele ouve você tirando a arma da bainha e contra-ataca com a própria adaga.");
												System.out.println(perdeu);
												s.close();
											
											} else {
												System.out.println(perdeu);
												s.close();
											}
										
										}
										
									} else if (anao1 == 2) {
										System.out.println("Você dá uma investida surpresa. Quando o anão percebe, ele");
										System.out.println("rapidamente se desvia. Ele tenta pegar uma arma da estante mas");
										System.out.println("ele é muito baixinho e não consegue pegar. Ele te pergunta:");
										System.out.println("'Você pode pegar essa espada pra mim? Pra a gente ter uma");
										System.out.println("luta justa'");
										System.out.println("Você quer ajudá-lo? Sim ou não?");
										System.out.println("(1 ou 2)");
										int anao22 = s.nextInt();
										
										//Se o jogador disser que não quer ajudar o anão, ele segue para a próxima sala.
										//Se o jogador disser que quer ajudar o anão, uma mensagem de fracasso específica é exibida.
										//Senão, a mensagem de fracasso padrão é exibida.
										if (anao22 == 1) {
											System.out.println("Quando você vai o ajudar ele pega uma adaga no seu bolso");
											System.out.println("e te dá uma facada nas costas.");
											System.out.println(perdeu);
											s.close();
											
										} else if (anao22 == 2) {
											System.out.println("Você o ataca e ele morre.");
											System.out.println(proxSala);
											
										} else {
											System.out.println(perdeu);
											s.close();
										}
									}
									
								} else if (anao1 == 3) {
									System.out.println("Você chega correndo, pega uma arma da estante e tenta atacá-lo.");
									System.out.println("Você não consegue porque a arma estava amaldiçoada, então a");
									System.out.println("própria arma gira sozinha e acerta seu pescoço.");
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
					System.out.println("No dia seguinte você chega correndo na masmorra achando que é o Saitama e morre.");
					System.out.println(perdeu);
				} else {
					System.out.println(perdeu);
				}
				
			} else {
				System.out.println(perdeu);
			}
		
		} else {
			System.out.println("Você saiu.");
		}
		
		s.close();
	}
}