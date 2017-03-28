import java.util.Vector;

public class CardTest {

	public static void main(String[] args) {
		
		Vector<Object> v = new Vector<>();
		
		CreditCard cc1 = new CreditCard("Gabby");
		CreditCard cc2 = new CreditCard("Gabby", 123);
		CreditCard cc3 = new CreditCard("Gabby", "12-04-17");
		CreditCard cc4 = new CreditCard("Gabby", "11-06-16", "04-012-13", 434);
		
		System.out.println(cc1.getNameOnCard());
		System.out.println(cc2.getNameOnCard() + " " + cc2.getCvvNum());
		System.out.println(cc3.getNameOnCard() + " " + cc3.getExpDate());
		System.out.println(cc4.getNameOnCard() + " " + cc2.getCvvNum() + " " + cc4.getDateOfIssue() + " " + cc4.getExpDate());


	}
}
