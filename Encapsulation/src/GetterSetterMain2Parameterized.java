
public class GetterSetterMain2Parameterized {

	public void showDetails(int amount, GetterSetterEmployee pf) {

		System.out.println("-----*****-----");
		System.out.println("Employee id is: " + pf.getEmpId()
				+ ", Employee Salary is: " + pf.getEmpSalary()
				+ "\nEmployee Name: " + pf.getEmpName() + ", Department: "
				+ pf.getEmpDepartment() + "\nEmployee Contact Number is: "
				+ pf.getEmpContact());

		int bal = pf.getEmpSalary();
		pf.setEmpSalary(bal - amount);

		System.out.println("After Calculating PF Employee Salary is: "
				+ pf.getEmpSalary());

	}

	public static void main(String[] args) {
		GetterSetterEmployee gse = new GetterSetterEmployee();

		gse.acceptDetails(101, 70000, "Satyam", "1254698785", "Electrical");

		GetterSetterMain2Parameterized gsmp = new GetterSetterMain2Parameterized();
		gsmp.showDetails(6000, gse);

	}

}
