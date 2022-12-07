import java.util.Scanner;

public class EmpDetailTakingInputFromMethod {

	int empId;
	long empContact;
	String empName, empEmail, empDepartment;
	float empSalary, pf, newSalary;
	char rating;

	void acceptDetails() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee Details");
		System.out.println("Enter Employee Id Number");
		empId = sc.nextInt();
		System.out.println("Enter Employee Name");
		empName = sc.next();
		System.out.println("Enter Department Name");
		empDepartment = sc.next();
		System.out.println("Enter The Rating of The Employee(A/B/C/D): ");
		rating = sc.next().charAt(0);
		System.out.println("Enter Salary of Employee");
		empSalary = sc.nextInt();
		System.out.println("Enter Contact Number of Employee");
		empContact = sc.nextLong();
		System.out.println("Enter Email Address of Employee");
		empEmail = sc.next();
	}
	
	void bonus() {

		System.out.println("\nOriginal salary is: " + empSalary);
		if (rating == 'A') {
			newSalary = empSalary + (empSalary * 0.15f);
		} else if (rating == 'B') {
			newSalary = empSalary + (empSalary * 0.10f);
		} else if (rating == 'C') {
			newSalary = empSalary + (empSalary * 0.05f);
		} else {
			newSalary = empSalary;
		}
		System.out.println("Salary After Adding Bonus is: " + newSalary);
	}

	float pfCalculator() {
		pf = (newSalary * 8) / 100;
		return pf;
	}
	
//	public String toString(){
//		return "\nEmployee Id is: " + empId + ", Employee Name: "
//				+ empName + "\nEmployee Department: " + empDepartment
//				+ ", Employee New Salary: " + newSalary + "\nEmployee Contact: "
//				+ empContact + ", Employee Email: " + empEmail;
//	}

	void display() {
		System.out.println("\nEmployee Id is: " + empId + ", Employee Name: "
				+ empName + "\nEmployee Department: " + empDepartment
				+ ", Employee New Salary: " + newSalary + "\nEmployee Contact: "
				+ empContact + ", Employee Email: " + empEmail);
		System.out.println("PF of Employee is: " + pf);
	}

	public static void main(String[] args) {

		EmpDetailTakingInputFromMethod emp = new EmpDetailTakingInputFromMethod();

		emp.acceptDetails();
		emp.bonus();
		emp.pfCalculator();
		
//		System.out.println(emp);
		
//		EmpDetailTakingInputFromMethod emp1 = new EmpDetailTakingInputFromMethod();
//
//		emp1.acceptDetails();
//		emp1.pfCalculator();
//		
//		EmpDetailTakingInputFromMethod emp2 = new EmpDetailTakingInputFromMethod();
//
//		emp2.acceptDetails();
//		emp2.pfCalculator();
//		
//		EmpDetailTakingInputFromMethod emp3 = new EmpDetailTakingInputFromMethod();
//
//		emp3.acceptDetails();
//		emp3.pfCalculator();
//		
//		EmpDetailTakingInputFromMethod emp4 = new EmpDetailTakingInputFromMethod();
//
//		emp4.acceptDetails();
//		emp4.pfCalculator();
		
		emp.display();
//		emp1.display();
//		emp2.display();
//		emp3.display();
//		emp4.display();

		// EmpDetailTakingInputFromMethod emp1 = new
		// EmpDetailTakingInputFromMethod();
		//
		// emp1.acceptDetails();
		// emp1.display();
	}

}
