import java.util.Scanner;

public class CreateAccount {

	long accountNumber, mobileNumber, adharNumber;
	String accountHolderName, panNumber;
	float accountBalance, depositAmount;

	void openAccount() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Account Holder Name");
		accountHolderName = sc.next();
		System.out.println("Enter Account Number");
		accountNumber = sc.nextLong();
		System.out.println("Enter Mobile Number");
		mobileNumber = sc.nextLong();
		System.out.println("Enter PAN Number");
		panNumber = sc.next();
		System.out.println("Enter Adhar Number");
		adharNumber = sc.nextLong();
		System.out.println("Enter Deposit Amount /-");
		depositAmount = sc.nextFloat();

	}

	void addBenificiary() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Customer Name");
		String customerName = sc.next();
		System.out.println("Enter Customer Account Number Properly");
		long customerAccNumber = sc.nextLong();
		System.out.println("Enter IFSC Code");
		String ifscCode = sc.next();

		if (customerName != null && customerAccNumber != 0 && ifscCode != null) {
			System.out.println("Benificiary Added Successfully!");
		} else {
			System.out.println("Please Enter Details Properly");
		}
	}

	void fundTransfer() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Customer Account Number Properly");
		long anotherCustAccNumber = sc.nextLong();
		System.out.println("Enter IFSC Code");
		String ifscCode = sc.next();
		System.out.println("Enter Amount");
		float amount = sc.nextFloat();

		if (amount > 0) {
			System.out.println("Account Number: " + anotherCustAccNumber + "\nIFSC Code: " + ifscCode
					+ "\nYour Amount: " + amount + " Successfully Transfered to Benificiary");
		} else {
			System.out.println("Enter Correct Details");
		}
	}

	void withdrawFund() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Amount(Minimum: 100/- for Withdraw)");
		long amount = sc.nextLong();
		if (amount >= 100) {
			System.out.println("Enter '4' Digits MPIN");
			int mpin = sc.nextInt();
			if (mpin > 999 && mpin < 10000) {
				System.out.println("Your Amount " + amount + " Successfully Withdraw\nPlease Collect You Amount!");
			} else {
				System.out.println("Incorrect MPIN");
			}
		} else {
			System.out.println("Enter Amount (Minimum: 100/-)");
			// System.out.println("Enter Amount(Minimum: 100/- for Withdraw)");
			// long amount1 = sc.nextLong();
			// long amount1 = sc.nextLong();
		}
		// System.out.println("Enter MPIN(Minimum '4' Digits)");
		// int mpin = sc.nextInt();
		//
		// if ( mpin > 999) {
		// System.out.println("Your Amount " + amount
		// + " Successfully Withdraw\nPlease Collect You Amount!ss");
		// }else{
		// System.out.println("Enter Details Properlys");
		// }
	}

	void statements() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Previous Date");
		int preDate = sc.nextInt();
		System.out.println("Enter Current Date");
		int currDate = sc.nextInt();
	}

	void showDetails() {

		System.out.println("****You have Successfully Created Account****");
		System.out.println("\nAccount Holder Name: " + accountHolderName + "\nAccount Number: " + accountNumber
				+ "\nMobile Number: " + mobileNumber + "\nPAN Number: " + panNumber + "\nAdhar Number: " + adharNumber
				+ "\nDeposited Amount: " + depositAmount + "/-");
	}

	public static void main(String[] args) {
		CreateAccount ca = new CreateAccount();

		// ca.addBenificiary();
		ca.withdrawFund();
		// ca.fundTransfer();
		// ca.openAccount();
		// ca.showDetails();

	}

}
