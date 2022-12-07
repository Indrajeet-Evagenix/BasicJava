package AssignmentOnContainment;

public class DepartmentGetterSetter {

	int departmentId;
	String departmentName;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String toString() {
		return "Department id: " + departmentId + ", Department Name: "
				+ departmentName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
