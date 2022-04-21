package projeto_mjv;
	
	import java.text.DecimalFormat;
	import java.text.DecimalFormatSymbols;
	import java.util.Locale;

	/**
	 * 
	 * @author Osmarcode
	 * @version 1.0
	 */

	public class ClasseDecimalFormat {
		
		public static void main(String[] args) {
			
			//padrão americano
			String padrao = "###,###.##";
			DecimalFormat df = new DecimalFormat(padrao);
			System.out.println(df.format(1234567890.123));
			
			DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale ("pt", "Brazil"));
			dfs.setDecimalSeparator(',');
			dfs.setGroupingSeparator('.');
			
			
			//padrão brasileiro
			String padrao2 = "###,###.##";
			df = new DecimalFormat(padrao2, dfs);
			System.out.println(df.format(1234567890.123));
			
			
			//agrupamento de valores
			String padrao3 = "###,###.##";
			df = new DecimalFormat(padrao3, dfs);
			df.setGroupingSize(3);
			System.out.println(df.format(123123.255));
			
		
			//formatando com duas casas decimais
			String padrao4 = "###,###.00";
			df = new DecimalFormat(padrao4, dfs);
			System.out.println(df.format(12561222.15));
			
			//formatando com valores antes da ','
			String padrao5 = "###,###0.00";
			df = new DecimalFormat(padrao5, dfs);
			System.out.println(df.format(00.15));
			
			//trabalhando com porcentagem
			String padrao6 = "###,###,#00.00%";
			df = new DecimalFormat(padrao6, dfs);
			System.out.println(df.format(0.15));
			
		}
	}
