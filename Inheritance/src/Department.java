public class Department {

	private int id;
	private String departmentName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String toString() {
		System.out.println("----Department Information-----");
		return "Department id: " + id + ", Department Name: " + departmentName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
