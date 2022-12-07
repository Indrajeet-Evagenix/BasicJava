package ExampleAccessSpecifier;

public class Account {

	private int accountNumber;
	protected String accountHolderName;
	private float accountBalance;

	public void openAccount() {

		filCustomerDetails(123456,"Indrajeet",52000f);
	}

	private void filCustomerDetails(int accNumber, String accName, float accBalance) {

		accountNumber = accNumber;
		accountHolderName = accName;
		accountBalance = accBalance;
	}

	void showDetails() {
		System.out.println("Customer Name: " + accountHolderName
				+ "\nAccount Number: " + accountNumber + "\nAccount Balance: "
				+ accountBalance);
	}

	public static void main(String[] args) {

//		Account ac=new Account();
		
//		ac.accountNumber=54321;
//		ac.accountHolderName="Mangesh";
//		ac.accountBalance=45000f;
		
//		ac.filCustomerDetails(58, null, 2);
//		ac.openAccount();
//		ac.showDetails();

	}

}
