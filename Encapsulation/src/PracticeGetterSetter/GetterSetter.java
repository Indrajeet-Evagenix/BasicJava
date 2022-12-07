package PracticeGetterSetter;

public class GetterSetter {

	private int accountNumber;
	private String accountHolderName;
	private float accountBalance;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int acNumber) {
		accountNumber = acNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String aName) {
		accountHolderName = aName;
	}

	public float getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(float aBalance) {
		accountBalance = aBalance;
	}

	public void acceptDetails(int anumber, String aName, float aBalance) {
		accountNumber = anumber;
		accountHolderName = aName;
		accountBalance = aBalance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
