package ConstructorWritten;

public class EmployeeMain {

	void showDetails(Employee empl) {
		System.out.println("Employee id: " + empl.getEmpId()
				+ "\nEmployee Name: " + empl.getEmpName()
				+ "\nEmployee Salary: " + empl.getSalary());
	}

	public static void main(String[] args) {
/*		Employee emp = new Employee();

		emp.setEmpId(1);
		emp.setEmpName("Indrajeet Gupta");
		emp.setSalary(45000);
	*/	
	/*	Employee empNew = new Employee();
		EmployeeMain emp1=new EmployeeMain();
		emp1.showDetails(empNew);*/
		
		Employee emp = new Employee();
		emp.acceptDetails(2, "Indrajeet Gupta", 50000);
		
		EmployeeMain emp1=new EmployeeMain();
		emp1.showDetails(emp);
		

		
	}

}

