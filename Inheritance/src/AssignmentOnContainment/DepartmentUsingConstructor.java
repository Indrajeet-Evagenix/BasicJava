package AssignmentOnContainment;

public class DepartmentUsingConstructor {

	int departmentId;
	String departmentName;

	DepartmentUsingConstructor(int id, String name) {
		departmentId = id;
		departmentName = name;
	}

	public String toString() {
		return "Department id: " + departmentId + ", Department Name: "
				+ departmentName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
