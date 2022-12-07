package HeirarchicalMethod;

public class PersonDoctorPatientMain {

	public static void main(String[] args) {
		Doctor dc = new Doctor();
		dc.setId(101);
		dc.setSpecilization("Heart Specialist");
		dc.setLicence("123456");
		dc.setAge(45);
		dc.setName("Ankit");
		dc.setContact(84129675);
		dc.setGender("Male");

		Patient pt = new Patient();
		pt.setId(1);
		pt.setDisease("Heart Failure");
		pt.setBedNumber(12);

		/*
		 * Person ps=new Person(); ps.setName("Ankit Tiwari"); ps.setAge(45);
		 * ps.setContact(84129675); ps.setGender("Male"); ps.setDoctor(dc);
		 * ps.setPatient(pt); ps.display();
		 */

		dc.display();
		pt.display();

	}

}
