package Assignment_6_Inheritance;

public class PersonIdProofMain {

	public static void main(String[] args) {
		IdProof id = new IdProof("Adhar Card", "123456", "3 Year");
		Person ps = new Person(101, "Indrajeet Gupta", "8412967583", "Mumbai", id);

		System.out.println(ps);

	}

}
