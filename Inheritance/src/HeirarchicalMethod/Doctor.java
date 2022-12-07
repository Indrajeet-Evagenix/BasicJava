package HeirarchicalMethod;

public class Doctor extends Person {

	int id;
	String specilization, licence;

	public void setId(int id) {
		this.id = id;
	}

	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}

	public void setLicence(String licence) {
		this.licence = licence;
	}

	void display() {
		super.display();
		System.out.println("-----Doctors Details-----");
		System.out.println("Id: " + id + ", Specilization: " + specilization
				+ ", Licence: " + licence);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
