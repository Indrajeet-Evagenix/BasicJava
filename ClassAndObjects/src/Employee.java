import java.util.Scanner;

public class Employee {
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

	float bonus(char ch) {
		float newSal;
		System.out.println("\nOriginal salary is: " + empSalary);
		if (ch == 'A') {
			newSal = empSalary + (empSalary * 0.15f);
		} else if (ch == 'B') {
			newSal = empSalary + (empSalary * 0.10f);
		} else if (ch == 'C') {
			newSal = empSalary + (empSalary * 0.05f);
		} else {
			newSal = empSalary;
		}
		System.out.println("Salary After Adding Bonus is: " + newSal);
		return newSal;
	}

	float pfCalculator(float sal) {
		pf = (sal * 4) / 100;
		return pf;
	}

	void display(float newSalary) {
		System.out.println("\nEmployee Id is: " + empId + ", Employee Name: "
				+ empName + "\nEmployee Department: " + empDepartment
				+ ", Employee Salary: " + newSalary + "\nEmployee Contact: "
				+ empContact + ", Employee Email: " + empEmail);
		System.out.println("PF of Employee is: " + pf);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("How Many Number of Employee");
		// int number=sc.nextInt();
		// System.out.println("Enter First Employee of Details");
		System.out.println("Enter Employee Id Number");
		int id = sc.nextInt();
		System.out.println("Enter Employee Name");
		String name = sc.next();
		System.out.println("Enter Department Name");
		String department = sc.next();
		System.out.println("Enter The Rating of The Employee(A/B/C/D): ");
		char rating = sc.next().charAt(0);
		System.out.println("Enter Salary of Employee");
		float salary = sc.nextInt();
		System.out.println("Enter Contact Number of Employee");
		long contact = sc.nextLong();
		System.out.println("Enter Email Address of Employee");
		String email = sc.next();

		Employee emp = new Employee();

		emp.acceptDetails(id, name, department, salary, contact, email);
		float newSalary = emp.bonus(rating);
		emp.pfCalculator(newSalary);
		emp.display(newSalary);

		// Employee emp1 = new Employee();
		// System.out.println("\nEnter Another Employee Details");
		// System.out.println("Enter Employee Id Number");
		// id = sc.nextInt();
		// System.out.println("Enter Employee Name");
		// name = sc.next();
		// System.out.println("Enter Department Name");
		// department = sc.next();
		// System.out.println("Enter Salary of Employee");
		// salary = sc.nextInt();
		// System.out.println("Enter Contact Number of Employee");
		// contact = sc.nextLong();
		// System.out.println("Enter Email Address of Employee");
		// email = sc.next();
		//
		// emp1.acceptDetails(id, name, department, salary, contact, email);
		// emp1.pfCalculator();
		// emp1.display();
		//
		// Employee emp2 = new Employee();
		// System.out.println("\nEnter Another Employee Details");
		// System.out.println("Enter Employee Id Number");
		// id = sc.nextInt();
		// System.out.println("Enter Employee Name");
		// name = sc.next();
		// System.out.println("Enter Department Name");
		// department = sc.next();
		// System.out.println("Enter Salary of Employee");
		// salary = sc.nextInt();
		// System.out.println("Enter Contact Number of Employee");
		// contact = sc.nextLong();
		// System.out.println("Enter Email Address of Employee");
		// email = sc.next();
		//
		// emp2.acceptDetails(id, name, department, salary, contact, email);
		// emp2.pfCalculator();
		// emp2.display();
		//
		// Employee emp3 = new Employee();
		// System.out.println("\nEnter Another Employee Details");
		// System.out.println("Enter Employee Id Number");
		// id = sc.nextInt();
		// System.out.println("Enter Employee Name");
		// name = sc.next();
		// System.out.println("Enter Department Name");
		// department = sc.next();
		// System.out.println("Enter Salary of Employee");
		// salary = sc.nextInt();
		// System.out.println("Enter Contact Number of Employee");
		// contact = sc.nextLong();
		// System.out.println("Enter Email Address of Employee");
		// email = sc.next();
		//
		// emp3.acceptDetails(id, name, department, salary, contact, email);
		// emp3.pfCalculator();
		// emp3.display();
		//
		// Employee emp4 = new Employee();
		// System.out.println("\nEnter Another Employee Details");
		// System.out.println("Enter Employee Id Number");
		// id = sc.nextInt();
		// System.out.println("Enter Employee Name");
		// name = sc.next();
		// System.out.println("Enter Department Name");
		// department = sc.next();
		// System.out.println("Enter Salary of Employee");
		// salary = sc.nextInt();
		// System.out.println("Enter Contact Number of Employee");
		// contact = sc.nextLong();
		// System.out.println("Enter Email Address of Employee");
		// email = sc.next();
		//
		// emp4.acceptDetails(id, name, department, salary, contact, email);
		// emp4.pfCalculator();
		// emp4.display();

		sc.close();
	}

}
