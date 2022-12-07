public class College {

	private int collegeCode;
	private String collegeName, coollegeAddress;

	Department collegeDepartment;// Reference Object
	Library collegeLibrary;

	public int getCollegeCode() {
		return collegeCode;
	}

	public void setCollegeCode(int collegeCode) {
		this.collegeCode = collegeCode;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCoollegeAddress() {
		return coollegeAddress;
	}

	public void setCoollegeAddress(String coollegeAddress) {
		this.coollegeAddress = coollegeAddress;
	}

	public Department getCollegeDepartment() {
		return collegeDepartment;
	}

	public void setCollegeDepartment(Department collegeDepartment) {
		this.collegeDepartment = collegeDepartment;
	}

	public Library getCollegeLibrary() {
		return collegeLibrary;
	}

	public void setCollegeLibrary(Library collegeLibrary) {
		this.collegeLibrary = collegeLibrary;
	}

	public String toString() {
		System.out.println("----College Information-----");
		return "College Code: " + collegeCode + "\nCollege Name: " + collegeName + "\nCollege Address: "
				+ coollegeAddress;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
