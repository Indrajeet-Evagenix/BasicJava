package MultiLevel;

public class GrandFather {

	String grandFatherFirstName, grandFatherMiddleName;
	static String lastName;

	public void setGrandFatherFirstName(String firstName) {
		this.grandFatherFirstName = firstName;
	}

	public void setGrandFatherMiddleName(String middleName) {
		this.grandFatherMiddleName = middleName;
	}

	public static void setLastName(String lastName) {
		GrandFather.lastName = lastName;
	}

	public void display() {
		System.out.println("-----GrandFather Details-----");
		System.out.println("First Nmae: " + grandFatherFirstName + "\nMiddle Name: " + grandFatherMiddleName
				+ "\nLast Name: " + lastName);
	}

}
