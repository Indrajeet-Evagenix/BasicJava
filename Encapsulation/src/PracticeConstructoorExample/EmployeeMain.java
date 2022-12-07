package PracticeConstructoorExample;

public class EmployeeMain {

	public static void main(String[] args) {
		Address ad = new Address(172, 401209, "Sai Nagr Welfare Society","Mumbai");
		/*ad.acceptAddressDetails(172, 401209, "Sai Nagr Welfare Society",
				"Mumbai");*/

		
		Employee emp = new Employee(102,"Mukesh Singh", 65000,ad);
		
		System.out.println(emp);
		
//		emp.acceptEmployeeDetails(123, "Indrajeet Gupta", 60000, ad);

		/*emp.showEmployeeDetails();
		System.out.println("-----*****-----");
		ad.showAddress();*/

	}

}
