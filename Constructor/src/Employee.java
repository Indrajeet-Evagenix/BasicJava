/* Emp class in that take Instance Variable empId,empName,empBasicSalary,empHRA,empDRA,grossSalary
 default constructor and another one  parameterized constructor(is,name,aBasicSalary)
 empHRASalary is calculated by 35% of basicSalary and 
 empDRASalary is calculated by 20% of basicSalary
 grossSalary = DRASalary + HRASalary + basicSalary
 create a Method Show EmpDetails
 calculate default constructor and parameterized constructor by passing the value
 */
public class Employee {

	int empId;
	String empName;
	float empBasicSalary, empHRASalary, empDRASalary, grosSalary;

	Employee() {

	}

	Employee(int id, String name, float basicSalary) {
		this.empId = id;
		this.empName = name;
		this.empBasicSalary = basicSalary;
	}

	void salaryCalculated() {
		empHRASalary = (empBasicSalary * 35) / 100;
		System.out.println("Employee HRA Salary is 35% of Basic Salary: " + empHRASalary);
		empDRASalary = (empBasicSalary * 20) / 100;
		System.out.println("Employee DRA Salary is 20% of Basic Salary: " + empDRASalary);
	}

	void grossSalary() {
		grosSalary = empHRASalary + empDRASalary + empBasicSalary;
	}

	void showEmpDetails() {
		System.out.println("Employee id: " + this.empId + "\nEmployee Name: " + empName + "\nEmployee Basic Salary: "
				+ empBasicSalary);
		System.out.println("Net Gross Salary is: " + this.grosSalary);
	}

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.showEmpDetails();

		System.out.println("--------*******--------");
		Employee emp1 = new Employee(1, "indrajeet", 56000);
		emp1.salaryCalculated();
		emp1.grossSalary();
		emp1.showEmpDetails();
	}

}
