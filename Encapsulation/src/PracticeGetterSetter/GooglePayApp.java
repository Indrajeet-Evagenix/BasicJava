package PracticeGetterSetter;

public class GooglePayApp {

	public void transferAmount(int amount, GetterSetter accDetails) {

		System.out.println("Transaction is in Process.....");

		float balance = accDetails.getAccountBalance();
		accDetails.setAccountBalance(balance - amount);

		System.out.println("Amount Transfered Successfully.");
		System.out.println("Updated Balance of Account Number is: "
				+ accDetails.getAccountNumber()
				+ "\nUpdated Account Balance is: "
				+ accDetails.getAccountBalance());
	}

	public static void main(String[] args) {
		GetterSetter gs = new GetterSetter();

		gs.acceptDetails(123456, "Ashish", 55000);

		GooglePayApp gpay = new GooglePayApp();
		
		gpay.transferAmount(6000, gs);
	}

}
