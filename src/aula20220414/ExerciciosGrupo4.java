package aula20220414;

import java.util.Scanner;

public class ExerciciosGrupo4 {
	static int opcao;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Escolha uma Opção");
		StringBuilder opcoes = new StringBuilder();
		opcoes.append("Opção 1 - Formatar um texto para MAIÚSCULAS\n")
				.append("Opção 2 - Formatar um texto para minúsculas\n")
				.append("Opção 3 - Verificando se um texto contêm determinada letra\n")
				.append("Opção 4 - Vai comparar palavras e ignorar se estiver em caixa alta ou não\n");
		System.out.println(opcoes.toString());
		opcao = scan.nextInt();

		switch (opcao) {

		case 1:
			System.out.println("digite uma palavra");
			String palavra = scan.next();
			System.out.println(palavra.toUpperCase());

			break;

		case 2:
			System.out.println("digite uma palavra");
			String palavra2 = scan.next();
			System.out.println(palavra2.toLowerCase());

			break;

		case 3:

			String palavra3;
			System.out.println("Digite seu nome");
			palavra3 = scan.next();

			System.out.println("Digite a letra que quer pesquisar no nome");
			String letra = scan.next();

			if (palavra3.contains(letra)) {
				System.out.println("Na palavra" + palavra3 + " existe a letra: " + letra);
			} else {
				System.out.println("Na palavra" + palavra3 + " não existe a letra: " + letra);
			}

			break;

		case 4:
			String java = "java";
			String JAVA = "JAVA";
			String Javax = "Javax";
			System.out.println("java é igual à JAVA ? " + java.equalsIgnoreCase(JAVA));
			System.out.println("java é igual à Javax ? " + java.equalsIgnoreCase(Javax));

			break;

		default:
			System.out.println("Essa opção não existe.");

		}
		;

	}
}
