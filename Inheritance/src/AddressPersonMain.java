
public class AddressPersonMain {

	public static void main(String[] args) {
		Address add = new Address();
		add.setArea("Santosh Bhuvan");
		add.setCity("Nallasopara");
		add.setPincode(401209);
		add.setState("Maharashtra");

		Person pr = new Person();
		pr.setId(12);
		pr.setpContact("1234567890");
		pr.setpEmail("indrajeet@1234");
		pr.setpName("Indrajeet Gupta");
		pr.setAddress(add);

		System.out.println(pr);
		/*
		 * System.out.println("----------*********-----------");
		 * 
		 * Address1 add1=new Address1(); add1.setArea("Ashok Singh Chawl");
		 * add1.setCity("Vasai"); add1.setPincode(401208); add1.setState("Maharashtra");
		 * 
		 * Person pr1=new Person(); pr1.setId(12); pr1.setpContact("9874563211");
		 * pr1.setpEmail("kamal@1234"); pr1.setpName("Kamal Patel");
		 * pr1.setAddress(add1);
		 * 
		 * System.out.println(pr1);
		 * System.out.println("----------*********-----------");
		 * 
		 * Address1 add2=new Address1(); add2.setArea("azad nagar");
		 * add2.setCity("Virar"); add2.setPincode(401203); add2.setState("Maharashtra");
		 * 
		 * Person pr2=new Person(); pr2.setId(12); pr2.setpContact("12456975235");
		 * pr2.setpEmail("ankit@1234"); pr2.setpName("Ankit Mishra");
		 * pr2.setAddress(add2);
		 * 
		 * System.out.println(pr2);
		 */

	}

}
