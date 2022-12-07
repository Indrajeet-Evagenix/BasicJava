package PracticeConstructoorExample;

public class Employee {

	int empId;
	String empName;
	float empSalary;
	Address address;

	Employee(int id, String name, float sal, Address address) {
		empId = id;
		empName = name;
		empSalary = sal;
		this.address = address;

	}

	/*
	 * public void acceptEmployeeDetails(int id, String name, float sal, Address
	 * add) { empId = id; empName = name; empSalary = sal; address = add; }
	 */

	public String toString() {
		return "Employee id: " + empId + "\nEmployee Name: " + empName
				+ "\nEmplooyee Salary: " + empSalary
				+ "\nEmployee Address is: " + address;
	}

	/*
	 * public void showEmployeeDetails() { System.out.println("Employee id: " +
	 * empId + "\nEmployee Name: " + empName + "\nEmplooyee Salary: " +
	 * empSalary + "\nEmployee Address is: " + address); }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
