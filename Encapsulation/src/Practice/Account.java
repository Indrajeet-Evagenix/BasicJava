package Practice;

public class Account {
	
	private int accountNumber;
	private String accountHolderName;
	private float accountBalance;
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber){
		this.accountNumber=accountNumber;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public float getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}

	/*public void acceptDetails(int anumber, String aName, float aBalance) {
		accountNumber = anumber;
		accountHolderName = aName;
		accountBalance = aBalance;
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
