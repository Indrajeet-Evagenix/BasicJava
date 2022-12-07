package TakingInputfromUser;

public class GetterSetterMain {

	public void showDetails(GetterSetterTakingInputFromUser pf) {

		System.out.println("-----*****-----");
		System.out.println("Employee id is: " + pf.getEmpId()
				+ ", Employee Salary is: " + pf.getEmpSalary()
				+ "\nEmployee Name: " + pf.getEmpName() + ", Department: "
				+ pf.getEmpDepartment() + "\nEmployee Contact Number is: "
				+ pf.getEmpContact());

		// int bal = pf.getEmpSalary();
		// pf.setEmpSalary(bal - amount);

		pfCalculator(pf);

		System.out.println("After Calculating PF Employee Salary is: "
				+ pf.getEmpSalary());

	}

	int pfCalculator(GetterSetterTakingInputFromUser pf) {
		int bal = (pf.getEmpSalary() * 8) / 100;
		pf.setEmpSalary(pf.getEmpSalary() - bal);

		return pf.getEmpSalary();
	}

	public static void main(String[] args) {
		GetterSetterTakingInputFromUser gse = new GetterSetterTakingInputFromUser();

		gse.acceptDetails();

		// gse.acceptDetails(101, 70000, "Satyam", "1254698785", "Electrical");

		GetterSetterMain gsmp = new GetterSetterMain();
		// gsmp.pfCalculator(6000, gse);

		gsmp.showDetails(gse);

	}
}
