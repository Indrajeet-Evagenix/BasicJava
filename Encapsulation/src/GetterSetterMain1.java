
public class GetterSetterMain1 {

	public static void main(String[] args) {

		GetterSetterEmployee gse = new GetterSetterEmployee();

		gse.setEmpId(101);
		gse.setEmpSalary(50000);
		gse.setEmpName("indrajeet");
		gse.setEmpContact("8412967583");
		gse.setEmpDepartment("Comp");
		System.out.println("Employee id is: " + gse.getEmpId()
				+ ", Employee Salary is: " + gse.getEmpSalary()
				+ "\nEmployee Name: " + gse.getEmpName() + ", Department: "
				+ gse.getEmpDepartment() + "\nEmployee Contact Number is: "
				+ gse.getEmpContact());
		System.out.println("-----*****-----");

		GetterSetterEmployee gse1 = new GetterSetterEmployee();

		gse1.setEmpId(102);
		gse1.setEmpSalary(55000);
		gse1.setEmpName("Rahul");
		gse1.setEmpContact("1234567890");
		gse1.setEmpDepartment("Civil");
		System.out.println("Employee id is: " + gse1.getEmpId()
				+ ", Employee Salary is: " + gse1.getEmpSalary()
				+ "\nEmployee Name: " + gse1.getEmpName() + ", Department: "
				+ gse1.getEmpDepartment() + "\nEmployee Contact Number is: "
				+ gse1.getEmpContact());
		System.out.println("-----*****-----");

		GetterSetterEmployee gse2 = new GetterSetterEmployee();

		gse2.setEmpId(103);
		gse2.setEmpSalary(45000);
		gse2.setEmpName("Anand");
		gse2.setEmpContact("8087984690");
		gse2.setEmpDepartment("Extc");
		System.out.println("Employee id is: " + gse2.getEmpId()
				+ ", Employee Salary is: " + gse2.getEmpSalary()
				+ "\nEmployee Name: " + gse2.getEmpName() + ", Department: "
				+ gse2.getEmpDepartment() + "\nEmployee Contact Number is: "
				+ gse2.getEmpContact());
		System.out.println("-----*****-----");

		GetterSetterEmployee gse3 = new GetterSetterEmployee();

		gse3.setEmpId(104);
		gse3.setEmpSalary(50000);
		gse3.setEmpName("indrajeet");
		gse3.setEmpContact("8412967583");
		gse3.setEmpDepartment("IT");
		System.out.println("Employee id is: " + gse3.getEmpId()
				+ ", Employee Salary is: " + gse3.getEmpSalary()
				+ "\nEmployee Name: " + gse3.getEmpName() + ", Department: "
				+ gse3.getEmpDepartment() + "\nEmployee Contact Number is: "
				+ gse3.getEmpContact());
		System.out.println("-----*****-----");

		GetterSetterEmployee gse4 = new GetterSetterEmployee();

		gse4.setEmpId(105);
		gse4.setEmpSalary(60000);
		gse4.setEmpName("Ashish");
		gse4.setEmpContact("9876543210");
		gse4.setEmpDepartment("Mech");
		System.out.println("Employee id is: " + gse4.getEmpId()
				+ ", Employee Salary is: " + gse4.getEmpSalary()
				+ "\nEmployee Name: " + gse4.getEmpName() + ", Department: "
				+ gse4.getEmpDepartment() + "\nEmployee Contact Number is: "
				+ gse4.getEmpContact());
		System.out.println("-----*****-----");
	}

}
