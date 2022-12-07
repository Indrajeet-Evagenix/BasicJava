package PracticeWithGetterSetter;

//import Practice.Address;

public class Employee {

	int empId;
	String empName;
	float empSalary;
	Address address;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String toString() {
		return "Employee id: " + empId + "\nEmployee Name: " + empName
				+ "\nEmplooyee Salary: " + empSalary
				+ "\nEmployee Address is: " + address;
	}

	void display(){
		System.out.println("Employee id: " + empId + "\nEmployee Name: " + empName
				+ "\nEmplooyee Salary: " + empSalary
				+ "\nEmployee Address is: " + address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
