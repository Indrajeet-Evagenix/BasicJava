package AssignmentOnContainment;

public class EmployeeUsingConstructor {

	int empId;
	String empName;
	float empSalary;

	MyDateUsingConstructor myDate;
	DepartmentUsingConstructor dept;

	EmployeeUsingConstructor(int id, String name, float sal,
			DepartmentUsingConstructor dept, MyDateUsingConstructor myDate) {
		empId = id;
		empName = name;
		empSalary = sal;
		this.myDate = myDate;
		this.dept = dept;
	}

	public String toString() {
		return "Employee id: " + empId + ", Employee Name: " + empName
				+ ", Employee Salary: " + empSalary + "\n" + myDate + "\n"
				+ dept;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
