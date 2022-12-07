package AssignmentOnContainment;

public class PersonNew {

	int pAge;
	long pContact;
	String pName, pGender;

	AddressNew address;
	IdProof id;

	PersonNew(int age, long contact, String name, String gender,
			AddressNew address, IdProof id) {
		pAge = age;
		pContact = contact;
		pName = name;
		pGender = gender;
		this.address = address;
		this.id=id;
	}

	public String toString() {
		return "-----Person Details-----\nName: " + pName + ", Gender: "
				+ pGender + ", Age: " + pAge + ", Contact Number: " + pContact
				+ "\n" + address+"\n"+id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
