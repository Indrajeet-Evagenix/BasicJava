// create a student class student has id, name, 3 subject marks. create
// a first method to accept first details of students

// to calculate the percentage

// to display details of the student id,name, subject marks and
// percentage

import java.util.Scanner;

public class StudentsNameIdSubject {

	void studentsDetails(String Name, int id, int sub1, int sub2, int sub3) {
		System.out.println("\nDetails of The Student is:");
		System.out.println("Student_Id: " + id + ", Student_Name: " + Name);

		System.out.println("Marks (Chemistry, Physics, Maths): " + sub1 + ","
				+ sub2 + "," + sub3);

	}

	float subjects(int sub1, int sub2, int sub3) {
		float total = sub1 + sub2 + sub3;
		float percentage = (total / 300) * 100;
		System.out.println("\nPercentage of the Student Marks is: "
				+ percentage);

		return percentage;
	}

	void showDetails(String Name, int id, int sub1, int sub2, int sub3,
			float per) {
		System.out
				.println("\nDetails of The Student After Calculating Percentage:");
		System.out.println("Student_Id: " + id + ", Student_Name: " + Name);

		System.out.println("Marks (Chemistry, Physics, Maths): " + sub1 + ", "
				+ sub2 + ", " + sub3);
		System.out.println("Percentage of the Student Marks is: " + per);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter The Student ID Number");
		int id = sc.nextInt();
		System.out.println("Enter The Name of Student");
		sc.next();
		String Name = sc.nextLine();

		System.out.println("Enter 3 Subject Marks of the Student");
		System.out.println("Enter The Chemistry Subject Marks");
		int subject1 = sc.nextInt();
		System.out.println("Enter The Physics Subject Marks");
		int subject2 = sc.nextInt();
		System.out.println("Enter The Maths Subject Marks");
		int subject3 = sc.nextInt();

		StudentsNameIdSubject sns = new StudentsNameIdSubject();

		sns.studentsDetails(Name, id, subject1, subject2, subject3);
		float per = sns.subjects(subject1, subject2, subject3);

		sns.showDetails(Name, id, subject1, subject2, subject3, per);

		sc.close();
	}

}
