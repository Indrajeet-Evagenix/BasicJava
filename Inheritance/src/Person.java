public class Person {

	int id;
	String pName, pContact, pEmail;

	Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpContact() {
		return pContact;
	}

	public void setpContact(String pContact) {
		this.pContact = pContact;
	}

	public String getpEmail() {
		return pEmail;
	}

	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String toString() {
		return "-----Person Details-----\nName: " + pName + ", Contact: "
				+ pContact + ", Email: " + pEmail + "\n" + address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
