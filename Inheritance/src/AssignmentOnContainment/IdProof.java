package AssignmentOnContainment;

public class IdProof {
	int number;
	String name, address;

	IdProof(int num, String name, String add) {
		this.number = num;
		this.name = name;
		this.address = add;
	}
	
	public String toString(){
		return "Id Proof: "+number+", "+name+", "+address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
