package ConstructorExample;

public class AddressPersonMain1 {

	public static void main(String[] args) {
		// For Object 1
		Address1 add = new Address1(401209, "Santosh Bhuvan", "Nallasopara",
				"Maharashtra");
		Person1 pr = new Person1(101, "Indrajeet Gupta", "8412967583",
				"indrajeet@123", add);

		System.out.println(pr);

		/*// For Object 2
		Address1 add1 = new Address1(401203, "Azad Nagar", "vasai",
				"Maharashtra");
		Person1 pr1 = new Person1(101, "Ankit Mishra", "9874563210",
				"ankit@123", add1);

		System.out.println(pr1);

		// For Object 3
		Address1 add2 = new Address1(401209, "Omkar Nagar", "Virar",
				"Maharashtra");
		Person1 pr2 = new Person1(101, "Ashish Pal", "8087984690",
				"ashish@123", add2);

		System.out.println(pr2);*/

	}

}
