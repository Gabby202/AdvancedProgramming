
public class CreditCard {

	private String nameOnCard;
	private String expDate;
	private String dateOfIssue;
	private int cvvNum;
	
	public CreditCard(String nameOnCard, String expdate, String dateOfIssue, int cvvNum) {
		this.setNameOnCard(nameOnCard);
		this.setExpDate(expdate);
		this.setDateOfIssue(dateOfIssue);
		this.setCvvNum(cvvNum);
	}
	
	public CreditCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	
	public CreditCard(String nameOnCard, int cvvNum) {
		this.nameOnCard = nameOnCard;
		this.cvvNum = cvvNum;
	}
	
	public CreditCard(String nameOnCard, String expDate) {
		this.nameOnCard = nameOnCard;
		this.expDate = expDate;
	}
	

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public int getCvvNum() {
		return cvvNum;
	}

	public void setCvvNum(int cvvNum) {
		this.cvvNum = cvvNum;
	}
	
	
	
	
}
