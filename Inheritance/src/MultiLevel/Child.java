package MultiLevel;

public class Child extends Father {

	String childFirstName;

	public void setChildFirstName(String firstName) {
		this.childFirstName = firstName;
	}

	public void display() {
		super.display();
		System.out.println("\n-----Child Details-----");
		System.out.println("First Nmae: " + childFirstName + "\nMiddle Name: " + super.fatherFirstName + "\nLast Name: "
				+ lastName);
	}

}
