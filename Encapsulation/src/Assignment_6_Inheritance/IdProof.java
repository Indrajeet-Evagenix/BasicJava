package Assignment_6_Inheritance;

public class IdProof {

	String iName, iNumber, validity;

	IdProof(String name, String number, String val) {
		iName = name;
		iNumber = number;
		validity = val;

	}

	public String toString() {
		return "-----Id Proof-----\nName of id Proof: " + iName + "\nId Proof Number: " + iNumber
				+ "\nValidity of Id Proof(Ex. 1 Year, 2 Year): " + validity;
	}

	/*
	 * void display() { System.out.println("-----Id Proof-----");
	 * System.out.println("Name of id Proof: " + iName + "\nId Proof Number: " +
	 * iNumber + "\nValidity of Id Proof(Ex. 1 Year, 2 Year)" + validity); }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
