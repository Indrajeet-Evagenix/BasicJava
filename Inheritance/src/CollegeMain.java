
public class CollegeMain {

	public static void main(String[] args) {
		Department dept=new Department();
		dept.setId(12);
		dept.setDepartmentName("Computer");
		
		Library lib=new Library();
		lib.setNumberOfBooks(400);
		lib.setLibraryIncharge("Mr. Alok Gupta");
		
		College clg=new College();
		clg.setCollegeCode(12345);
		clg.setCollegeName("Thakur College of Engineering And Managements");
		clg.setCoollegeAddress("Mumbai");
		clg.setCollegeDepartment(dept);
		clg.setCollegeLibrary(lib);
		
		System.out.println(clg);
		System.out.println(clg.getCollegeDepartment());
		System.out.println(clg.getCollegeLibrary());
	}

}
