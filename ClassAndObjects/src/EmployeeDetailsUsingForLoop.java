import java.util.Scanner;

public class EmployeeDetailsUsingForLoop {

	int empId;
	long empContact;
	String empName, empEmail, empDepartment;
	float empSalary, pf;

	void acceptDetails(int id, String name, String department, float salary,
			long contact, String email) {
		empId = id;
		empContact = contact;
		empName = name;
		empEmail = email;
		empDepartment = department;
		empSalary = salary;
	}
	
	float pfCalculator() {
		pf = (empSalary * 4) / 100;
		return pf;
	}

	void display() {
		System.out.println("\nEmployee Id is: " + empId + ", Employee Name: "
				+ empName + "\nEmployee Department: " + empDepartment
				+ ", Employee Salary: " + empSalary + "\nEmployee Contact: "
				+ empContact + ", Employee Email: " + empEmail);
		System.out.println("PF of Employee is: " + pf);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Number of Employee");
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			System.out.println("Enter First Employee of Details");
			System.out.println("\nEnter Employee Id Number");
			int id = sc.nextInt();
			System.out.println("Enter Employee Name");
			String name = sc.next();
			System.out.println("Enter Department Name");
			String department = sc.next();
			System.out.println("Enter Salary of Employee");
			float salary = sc.nextInt();
			System.out.println("Enter Contact Number of Employee");
			long contact = sc.nextLong();
			System.out.println("Enter Email Address of Employee");
			String email = sc.next();

			EmployeeDetailsUsingForLoop emp = new EmployeeDetailsUsingForLoop();

			emp.acceptDetails(id, name, department, salary, contact, email);
			emp.pfCalculator();
			emp.display();
		}

		sc.close();
	}

}
