package AssignmentOnContainment;

public class EmployeeGetterSetter {

	int empId;
	String empName;
	float empSalary;

	DepartmentGetterSetter dept;
	MyDateGetterSetter myDate;

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

	public DepartmentGetterSetter getDept() {
		return dept;
	}

	public void setDept(DepartmentGetterSetter dept) {
		this.dept = dept;
	}

	public MyDateGetterSetter getMyDate() {
		return myDate;
	}

	public void setMyDate(MyDateGetterSetter myDate) {
		this.myDate = myDate;
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
