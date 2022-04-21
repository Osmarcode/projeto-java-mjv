package projeto_mjv;
import java.util.Scanner;

public class ClasseStringComMetodos {

	/**
	 * @author Osmarcode
	 * @version 1.0
	 */

		static int opcao;

		public static void main(String[] args) {

			// método para leitura de dados de entrada via teclado
			Scanner scan = new Scanner(System.in);

			boolean run = true;
			
			 String name = "José";
		        String day = "02";
		        String month = "Janeiro";
		        String message = String.format("Olá %s, seu agendamento foi marcado para dia %s de %s.", name, day, month);
		        System.out.println(message);

		       

			/* inicio do while */
			// enquanto opcao igual a true vai continuar perguntando, quando escolher opção
			// 0 ou valor > 5 vai sair
			while (run) {
				System.out.println("--------------------------------------------------------------------------+");
				System.out.println("Escolha uma Opção                                                         |");
				System.out.println("[1] - Quero formatar um texto para MAIÚSCULAS                             |");
				System.out.println("[2] - Quero formatar um teto para minúsculas                              |");
				System.out.println("[3] - Quero verificar se um texto contém determinada letra                |");
				System.out.println("[4] - Quero comparar e ignorar duas palavras sendo MAIÚSCULAS/minúsculas |");
				System.out.println("[0] - Sair do programa.                                                   |");
				System.out.println("--------------------------------------------------------------------------+");
				System.out.print("Digite a Opção: ");
				opcao = scan.nextInt(); //

				switch (opcao) {
				case 1:
					System.out.println("---------------------------------------------------------------------------+");
					System.out.println("Qual palavra deseja converter para Maiúscula? ");
					String palavra = scan.next();
					System.out.println(palavra.toUpperCase());

					break;

				case 2:
					System.out.println("---------------------------------------------------------------------------+");
					System.out.println("Qual palavra deseja converter para Minúscula? ");
					String palavra2 = scan.next();
					System.out.println(palavra2.toLowerCase());

					break;

				case 3:
					System.out.println("---------------------------------------------------------------------------+");
					String palavra3;
					System.out.println("Digite seu nome: ");
					palavra3 = scan.next();

					System.out.println("Digite a letra que quer pesquisar no nome: ");
					String letra = scan.next();

					if (palavra3.contains(letra)) {
						System.out.println("Na palavra " + palavra3 + " existe a letra: " + letra);
					} else {
						System.out.println("Na palavra " + palavra3 + " não existe a letra: " + letra);
					}

					break;

				case 4:
					System.out.println("---------------------------------------------------------------------------+");
					String java = "java";
					String JAVA = "JAVA";
					String Javax = "Javax";
					System.out.println("java é igual à JAVA ? " + java.equalsIgnoreCase(JAVA));
					System.out.println("java é igual à Javax ? " + java.equalsIgnoreCase(Javax));

					break;

				default:
					System.out.println("Saindo do programa...\n");
					run = false;
				}
				;

			}
		}
	}
	
