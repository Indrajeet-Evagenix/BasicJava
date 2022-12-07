package AssignmentOnContainment;

public class EmpDeptMyDateMainGetterSetter {

	public static void main(String[] args) {
		DepartmentGetterSetter dept = new DepartmentGetterSetter();
		dept.setDepartmentId(12345);
		dept.setDepartmentName("Computer");

		MyDateGetterSetter mDate = new MyDateGetterSetter();
		mDate.setDay(15);
		mDate.setMonth(05);
		mDate.setYear(2020);

		EmployeeGetterSetter empl = new EmployeeGetterSetter();
		empl.setEmpId(101);
		empl.setEmpName("Indrajeet Gupta");
		empl.setEmpSalary(500000);
		empl.setDept(dept);
		empl.setMyDate(mDate);

		System.out.println(empl);

	}

}
