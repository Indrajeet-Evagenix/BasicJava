public class GooglePay {

	public void transferAmount(int amount, GetterSetterMethodAccount ac1) {

		System.out.println("Your Transaction is in Process....");
		// ac1.setBalance(ac1.getBalance() - amount);

		float bal = ac1.getBalance();
		ac1.setBalance(bal - amount);

		System.out.println("Amount Transfered Successfully."
				+ "\nUpdated Balance of Account Number is: "
				+ ac1.getAccountNumber() + "\nUpdated Balance is: "
				+ ac1.getBalance()+"/-");
	}

	public static void main(String[] args) {
		GetterSetterMethodAccount obj = new GetterSetterMethodAccount();

		obj.acceptDetails(2564852, "Monty", 56000);

		GooglePay gpay = new GooglePay();

		gpay.transferAmount(5000, obj);

	}

}
