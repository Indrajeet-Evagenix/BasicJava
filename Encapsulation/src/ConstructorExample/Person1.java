package ConstructorExample;

public class Person1 {

	int id;
	String pName, pContact, pEmail;

	Address1 address;

	Person1(int id, String name, String contact, String email, Address1 address) {
		this.id = id;
		pName = name;
		pContact = contact;
		pEmail = email;
		this.address=address;
	}

	public String toString() {
		return "-----Person Details-----\nName: " + pName + ", Contact: "
				+ pContact + ", Email: " + pEmail + "\n" + address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
