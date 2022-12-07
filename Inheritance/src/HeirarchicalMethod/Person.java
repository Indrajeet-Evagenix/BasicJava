package HeirarchicalMethod;

public class Person {

	String name, gender;
	int age;
	long contact;

	/*Doctor doc;
	Patient pat;*/

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	/*public void setDoctor(Doctor doc) {
		this.doc = doc;
	}

	public void setPatient(Patient pat) {
		this.pat = pat;
	}*/

	void display() {
		System.out.println("-----Person Details-----");
		System.out.println("Name: " + name + ", Age: " + age + "\nGender: "
				+ gender + ", Contact Number: " + contact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
