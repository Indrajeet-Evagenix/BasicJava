package PracticeWithGetterSetter;

public class EmployeeMain {

	public static void main(String[] args) {
		Address ad = new Address();
		ad.setCityName("Mumbai");
		ad.setPinNumber(401209);
		ad.setSocietyName("Sai Nagar Welfare Sciety");
		ad.setSrNumber(172);

		Employee emp = new Employee();
		emp.setEmpId(123);
		emp.setEmpName("Indrajeet Gupta");
		emp.setEmpSalary(50000);
		emp.setAddress(ad);
		System.out.println(emp);
		// System.out.println(emp.getAddress());
		/*
		 * System.out.println(emp.getEmpId());
		 * System.out.println(emp.getEmpName());
		 * System.out.println(emp.getEmpSalary());
		 * 
		 * System.out.println(ad.getCityName());
		 * System.out.println(ad.getPinNumber());
		 * System.out.println(ad.getSocietyName());
		 * System.out.println(ad.getSrNumber());
		 */

	}

}
