package AssignmentOnContainment;

public class IdProofGetterSetter {
	
	int number;
	String name, address;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString(){
		return "Id Proof: "+number+", "+name+", "+address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
