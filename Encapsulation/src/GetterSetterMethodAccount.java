public class GetterSetterMethodAccount {

	private int accountNumber;
	private String name;
	private float balance;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accNumber) {
		accountNumber = accNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float bal) {
		balance = bal;
	}

	public void acceptDetails(int acNumber, String userName, float balance) {
		accountNumber = acNumber;
		name = userName;
		this.balance = balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
