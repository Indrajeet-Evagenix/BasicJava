import java.util.Scanner;

public class GetterSetterEmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GetterSetterEmployee gse = new GetterSetterEmployee();

		System.out.println("Enter Number of Employee");
		int num = sc.nextInt();
		// System.out.println("Enter " + num + " Employee details");
		for (int i = 1; i <= num; i++) {
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
		}
		sc.close();
	}

}
