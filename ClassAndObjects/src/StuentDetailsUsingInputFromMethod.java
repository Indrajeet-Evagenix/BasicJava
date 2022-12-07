import java.util.Scanner;

public class StuentDetailsUsingInputFromMethod {

	int student_id, marks;
	String studentName, department;

	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id");
		student_id = sc.nextInt();
		System.out.println("Enter Student Name");
		studentName = sc.next();
		System.out.println("Enter Student Department Name");
		department = sc.next();
		System.out.println("Enter Student Marks");
		marks = sc.nextInt();
	}

	void display() {
		System.out.println("\nStudent_Id is: " + student_id + ", Student Name is: " + studentName);
		System.out.println("Student Department Name is: " + department + ", Student Marks is: " + marks);
	}

	public static void main(String[] args) {
		StuentDetailsUsingInputFromMethod st = new StuentDetailsUsingInputFromMethod();
		StuentDetailsUsingInputFromMethod st1 = new StuentDetailsUsingInputFromMethod();
		StuentDetailsUsingInputFromMethod st2 = new StuentDetailsUsingInputFromMethod();

		System.out.println("Enter First Student Details");
		st.acceptInput();
		System.out.println("Enter Second Student Details");
		st1.acceptInput();
		System.out.println("Enter Third Student Details");
		st2.acceptInput();
		System.out.println("\nDetails of First Student");
		st.display();
		System.out.println("\nDetails of Second Student");
		st1.display();
		System.out.println("\nDetails of Third Student");
		st2.display();
	}

}
