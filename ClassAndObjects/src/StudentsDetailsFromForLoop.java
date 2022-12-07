import java.util.Scanner;

public class StudentsDetailsFromForLoop {

	int student_id, marks;
	String studentName, department;

	void acceptInput(int id, String name, String dept, int mark) {
		student_id = id;
		studentName = name;
		department = dept;
		marks = mark;
	}

	void display() {
		System.out.println("\nStudent_Id is: " + student_id
				+ ", Student Name is: " + studentName);
		System.out.println("Student Department Name is: " + department
				+ ", Student Marks is: " + marks);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentsDetailsFromForLoop st = new StudentsDetailsFromForLoop();
		System.out.println("Enter Number of Students Details");
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			System.out.println("Enter "+i+" The Students Details");
			System.out.println("Enter Student id");
			int student_id = sc.nextInt();
			System.out.println("Enter Student Name");
			String studentName = sc.next();
			System.out.println("Enter Student Department Name");
			String department = sc.next();
			System.out.println("Enter Student Marks");
			int marks = sc.nextInt();

			st.acceptInput(student_id, studentName, department, marks);
			st.display();
		}
		sc.close();

	}
}
