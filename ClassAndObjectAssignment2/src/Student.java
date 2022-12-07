import java.util.Scanner;

public class Student {

	int marks, chem, physics, maths, english;
	float per;
	String name;

	void acceptDetails() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name And Marks of the Given Subjects");
		System.out.println("Enter Name of Student");
		name = sc.next();
		System.out.println("Enter Chemistry Marks");
		chem = sc.nextInt();
		System.out.println("Enter Physics Marks");
		physics = sc.nextInt();
		System.out.println("Enter Maths Marks");
		maths = sc.nextInt();
		System.out.println("Enter English Marks");
		english = sc.nextInt();

	}

	float percentage() {
		float res = (chem + physics + maths + english);
		per = (res / 400) * 100;
		return per;
	}

	void result() {
		if (per <= 100 && per >= 80) {
			System.out.println("Student: " + name + " Passed First Class");
		} else if (per < 80 && per >= 60) {
			System.out.println("Student: " + name + " Passed Second Class");
		} else {
			System.out.println("Student: " + name + " Passed Third Class");
		}
	}

	public String toString() {
		return "Percentage of The Student '" + name + "' is: " + per;
	}

//	void display() {
//		System.out.println("Percentage of The Student " + name + " is: " + per);
//	}

	public static void main(String[] args) {
		Student st = new Student();

		st.acceptDetails();
		st.percentage();
		st.result();

		System.out.println(st);

//		st.display();

	}

}
