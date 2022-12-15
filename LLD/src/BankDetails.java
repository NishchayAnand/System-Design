
public class BankDetails {
	
	private String holderName;
	private String bankName;		
	private int accountNumber;
	private int credit;
	
	BankDetails(){
		// default constructor
	}
	
	BankDetails(String holderName, String bankName, int accountNumber, int credit){
		this.holderName = holderName;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.credit = credit;
	}
	
	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}
	
}
