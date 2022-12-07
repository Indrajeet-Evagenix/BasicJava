package AssignmentOnContainment;

public class PersonGetterSetter {
	
	int pAge;
	String pName, pGender;
	
	AddressGetterSetter address;
	IdProofGetterSetter id;

	public int getpAge() {
		return pAge;
	}

	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpGender() {
		return pGender;
	}

	public void setpGender(String pGender) {
		this.pGender = pGender;
	}

	public AddressGetterSetter getAddress() {
		return address;
	}

	public void setAddress(AddressGetterSetter address) {
		this.address = address;
	}
	
	public IdProofGetterSetter getId() {
		return id;
	}

	public void setId(IdProofGetterSetter id) {
		this.id = id;
	}
	
	public String toString() {
		return "-----Person Details-----\nName: " + pName + ", Gender: "
				+ pGender + ", Age: " + pAge + "\n" + address+"\n"+id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
