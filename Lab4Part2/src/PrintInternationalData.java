import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class PrintInternationalData {

	public static void main(String[] args) {
		
		double milk = 2.5;
		Locale localeFr = new Locale("fr","FR");
		Locale localeUk = new Locale("gb", "GB");
		Locale localeDe = new Locale("de", "DE");

		NumberFormat currencyFr = NumberFormat.getCurrencyInstance(localeFr);
		NumberFormat currencyUk = NumberFormat.getCurrencyInstance(localeUk);
		NumberFormat currencyDe = NumberFormat.getCurrencyInstance(localeDe);

		DateFormatSymbols dfsFr = new DateFormatSymbols(localeFr);
		DateFormatSymbols dfsUk = new DateFormatSymbols(localeUk);
		DateFormatSymbols dfsDe = new DateFormatSymbols(localeDe);
		
		Date  dfFr = new Date();
		Date dfUk = new Date();
		Date dfDe = new Date();
	
		System.out.println("The Days of the Week in France : ");
		String dayNames[] = dfsFr.getWeekdays();
		for (String s: dayNames) {
			System.out.print(s + " ");
			
		}
		
		System.out.println(" ");
		System.out.println( "The cost of milk in "+ localeFr.getCountry() + " is " + currencyFr.format(milk));
	     System.out.println("The Date for " + localeFr.getDisplayCountry() + ":");
	       DateFormat frmtFr = DateFormat.getDateInstance();
	       System.out.println(frmtFr.format(dfFr));

		
		System.out.println(" ");
		System.out.println("The Days of the Week in England : ");
		String dayNames2[] = dfsUk.getWeekdays();
		for (String s: dayNames2) {
			System.out.print(s + " ");
			
		}
		System.out.println(" ");
		System.out.println("The cost of milk in "+ localeUk.getCountry() + " is " + currencyUk.format(milk));
	     System.out.println("The Date for " + localeUk.getDisplayCountry() + ":");
	       DateFormat frmtUk = DateFormat.getDateInstance();
	       System.out.println(frmtFr.format(dfUk));
		
		System.out.println(" ");
		System.out.println("The Days of the Week in Germany : ");
		String dayNames3[] = dfsDe.getWeekdays();
		for (String s: dayNames3) {
			System.out.print(s + " ");
			
		}
		System.out.println(" ");
		System.out.println("The cost of milk in "+ localeDe.getCountry() + " is " + currencyDe.format(milk));
	     System.out.println("The Date for " + localeDe.getDisplayCountry() + ":");
	       DateFormat frmtDe = DateFormat.getDateInstance();
	       System.out.println(frmtFr.format(dfDe));
	}
	
	
}
