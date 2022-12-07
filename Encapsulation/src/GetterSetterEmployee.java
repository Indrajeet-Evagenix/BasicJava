public class GetterSetterEmployee {

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

	public void acceptDetails(int id, int salary, String name, String contact, String dept) {
		this.empId = id;
		this.empSalary = salary;
		this.empName = name;
		this.empContact = contact;
		this.empDepartment = dept;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
