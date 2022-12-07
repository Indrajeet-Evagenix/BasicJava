package AssignmentOnContainment;

public class EmployeeDepartmentMydateConstructorMain {

	public static void main(String[] args) {
		DepartmentUsingConstructor dept = new DepartmentUsingConstructor(12345,
				"Computer");

		MyDateUsingConstructor mDate = new MyDateUsingConstructor(14, 05, 2021);

		EmployeeUsingConstructor empl = new EmployeeUsingConstructor(1,
				"Indrajeet Gupta", 50000, dept, mDate);
		
		System.out.println(empl);

	}

}
