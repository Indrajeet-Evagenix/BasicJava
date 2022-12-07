package Assignment_6_Inheritance;

public class Person {

	int pId;
	String pName, pContact, pAddress;

	IdProof idProof;

	Person(int ids, String name, String contact, String address, IdProof id) {

		pId = ids;
		pName = name;
		pContact = contact;
		pAddress = address;
		idProof = id;

	}

	public String toString() {
		return "-----Person Details-----\nId: " + pId + ", Name: " + pName + "\nContact Number: " + pContact
				+ ", Address: " + pAddress + "\n" + idProof;
	}

	/*
	 * void display() { System.out.println("-----Person Details-----");
	 * System.out.println( "Id: " + pId + ", Name: " + pName + "\nContact Number: "
	 *s + pContact + ", Address: " + pAddress+"\n"+idProof); }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
