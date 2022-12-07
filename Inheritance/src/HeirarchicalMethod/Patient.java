package HeirarchicalMethod;

public class Patient extends Person {

	int id, bedNumber;
	String disease;

	public void setId(int id) {
		this.id = id;
	}

	public void setBedNumber(int bedNumber) {
		this.bedNumber = bedNumber;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	void display() {
//		super.display();
		System.out.println("-----Patient Details-----");
		System.out.println("Id: " + id + ", Disease: " + disease + ", Bed Number: "
				+ bedNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
