/*	Student class in that take Instance Variable rollNo.,sName,Marks(physics,chemistry,math)
 in that two constructor one is Default and Another Parameterized constructor(rollNo,Name,marks(p,c,m))
 create one object of student class by using default constructor and display of the students
 one more object by passing parameterized constructor(value)*/

public class Student {

	int studentRollNumber;
	String studentName;
	float physicsMarks, chemMarks, mathMarks;

	Student() {

	}

	Student(int rollNumber, String sName, float pMarks, float cMarks, float mMarks) {

		this.studentRollNumber = rollNumber;
		this.studentName = sName;
		physicsMarks = pMarks;
		chemMarks = cMarks;
		mathMarks = mMarks;

	}

	void display() {
		System.out.println("Student Roll Number: " + studentRollNumber + ", Student Name: " + studentName
				+ "\nMarks(Physics, Chemistry, Maths): " + physicsMarks + "," + chemMarks + "," + mathMarks);
	}

	public static void main(String[] args) {
		Student st = new Student();
		st.display();

		System.out.println("-------******--------");
		Student st1 = new Student(1, "Indrajeet", 85, 98, 87);
		st1.display();

	}

}
