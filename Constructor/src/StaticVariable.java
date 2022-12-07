public class StaticVariable {

	int studentId;
	String studentName, location;
	static String universityName = "Mumbai University";
	static String collegeName = "VJTI";

	StaticVariable(int id, String sName, String location) {

		studentId = id;
		studentName = sName;
		this.location = location;
	}

	public String toString() {
		return "Student Id: " + studentId + "\nStudent Name: " + studentName
				+ "\nlocation is: " + location;
	}

	public static void main(String[] args) {

		// we can use static variable Directly by using Class Name
		System.out.println(StaticVariable.universityName);
		System.out.println(StaticVariable.collegeName);

		StaticVariable sv = new StaticVariable(2, "Indrajeet", "Mumbai");
		
		System.out.println(sv);

//		System.out.println(sv.studentId + "\n" + sv.studentName);

		// we can use static variable by using object But its showing an
		// *Warning*
		System.out.println(sv.universityName + "\n" + sv.collegeName);
	}

}
