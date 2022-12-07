package TakingInputfromUser;

import java.util.Scanner;

public class GetterSetterTakingInputFromUser {
	
	int empId, empSalary;
	String empName, empContact, empDepartment;

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpSalary(int f) {
		this.empSalary = f;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpContact(String empContact) {
		this.empContact = empContact;
	}

	public String getEmpContact() {
		return empContact;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void acceptDetails() {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Employee id");
		this.empId=sc.nextInt();
		System.out.println("Enter Employee Name");
		this.empName=sc.next();
		System.out.println("Enter Employee Salary");
		this.empSalary=sc.nextInt();
		System.out.println("Enter Employee Contact Number");
		this.empContact=sc.next();
		System.out.println("Enter Employee Department Name");
		this.empDepartment=sc.next();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
