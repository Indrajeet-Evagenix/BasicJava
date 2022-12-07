package MultiLevel;

public class Father extends GrandFather {

	String fatherFirstName;

	public void setFatherFirstName(String firstName) {
		this.fatherFirstName = firstName;
	}

	public void display() {
		super.display();
		System.out.println("\n-----Father Details-----");
		System.out.println("First Nmae: " + fatherFirstName + "\nMiddle Name: " + super.grandFatherFirstName
				+ "\nLast Name: " + lastName);
	}

}
