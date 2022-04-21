package projeto_mjv;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * @author Osmarcode
 * @version 1.0
 */
public class ClasseDateTimeFormat {

	public static void main(String[] args) {

		/* CLASSES QUE FORAM SUBSTITUIDAS A PARTIR DO JAVA 8 */
		Date date = new Date();
		Calendar calendar = new GregorianCalendar();

		/* NOVAS CLASSES TIME LOCALDATETIME */
		/* GERANDO DATA */
		LocalDate localDate = LocalDate.now();
		System.out.println("Localdate: " + localDate);

		/* GERAR HORA */
		LocalTime localTime = LocalTime.now();
		System.out.println("Hora: " + localTime);

		/* LOCALDATETIME DATA E HORA */
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Data e hora: " + localDateTime);

		/* FORMATAÇÃO DE DATA PADRÃO PORTUGUES BR */
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("PT", "br"));

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("Data e Hora com A Localização: " + zonedDateTime);

		/*
		 * O MENU VAI RODAR ATÉ QUE RUN SEJA TRUE OPCAO [6] MENU TORNA FALSE ENTRA NO
		 * DEFAULT DO SWTICH E SAI
		 */
		boolean run = true;

		/* inicio do while */
		while (run) {
			System.out.println("-------------------------------------+");
			System.out.println("Escolha uma Opção                    |");
			System.out.println("[1] - Quero saber que dia é hoje     |");
			System.out.println("[2] - Quero saber que mes  estamos   |");
			System.out.println("[3] - Quero saber que ano estamos    |");
			System.out.println("[4] - Quero saber que horas são      |");
			System.out.println("[5] - Exibir Data completa Formatada |");
			System.out.println("[6] - SAIR                           |");
			System.out.println("-------------------------------------+");
			System.out.print("Digite a Opção: ");
			Scanner scan = new Scanner(System.in);
			int op = scan.nextInt();

			switch (op) {
			case 1:
				System.out.println("-----------------------------------+");
				System.out.println("Hoje é Dia: " + localDateTime.getDayOfMonth());// -> DIA
				break;
			case 2:
				System.out.println("-----------------------------------+");
				System.out.println("Estamos no Mes: " + localDateTime.getMonth());// -> MÊS
				break;
			case 3:
				System.out.println("-----------------------------------+");
				System.out.println("Estamos no Ano: " + localDateTime.getYear());// -> ANO
				break;
			case 4:
				System.out.println("-----------------------------------+");
				System.out.println("Hora: " + localTime);
				break;
			case 5:
				System.out.println("-----------------------------------+");
				System.out.println("Data Formatada: " + localDateTime.format(dateTimeFormatter));
				break;
			default:
				System.out.println("saindo...");
				run = false;// SAI DO MENU DE OPÇOES
				break;

			}
		}
		/* fim do while */

	}
}