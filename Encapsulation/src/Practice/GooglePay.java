package Practice;

public class GooglePay {

	public void withdraw(int amount, Account ac1) {

		System.out.println("-----*****-----");
		System.out.println("Transaction is in Progress....");
		float bal = ac1.getAccountBalance();
		if (bal > amount) {
			bal = bal - amount;
			ac1.setAccountBalance(bal);
			System.out.println("Your Amoount Successfully Withdrawn!");
		} else {
			System.out.println("Low Balance");
		}

		System.out.println("After Amount Deducted");
		System.out.println("Remaining Account Balance: "
				+ ac1.getAccountBalance());
		// deposit(12000,ac1);

	}

	void deposit(int depositAmount, Account accDetails) {

		System.out.println("-----*****-----");
		float bal = accDetails.getAccountBalance();
		bal = bal + depositAmount;
		accDetails.setAccountBalance(bal);
		System.out.println("After Deposited Amount");
		System.out
				.println("Account Balance: " + accDetails.getAccountBalance());
	}

	public void showDetails(Account acc) {
		System.out.println("Account Holder Name: " + acc.getAccountHolderName()
				+ "\nAccount Number: " + acc.getAccountNumber()
				+ "\nAccount Balance: " + acc.getAccountBalance());
	}

	public static void main(String[] args) {
		Account ac = new Account();
		ac.setAccountNumber(12345);
		ac.setAccountBalance(55000);
		ac.setAccountHolderName("Indrajeet Guipta");

		// ac.acceptDetails(12345, "Indrajeet Gupta", 55000);

		GooglePay gpay = new GooglePay();

		gpay.showDetails(ac);
		gpay.withdraw(6000, ac);

		// Account ac1 = new Account();
		// ac1.acceptDetails(12345, "Indrajeet Gupta", 55000);
		//
		// GooglePay gpay1 = new GooglePay();

		gpay.deposit(12000, ac);

	}

}
