package AssignmentOnContainment;

public class PersonAddressGetterSetterMain {

	public static void main(String[] args) {
		AddressGetterSetter add=new AddressGetterSetter();
		add.setCity("Vasai");
		add.setCountry("India");
		add.setState("Maharashtra");
		
		IdProofGetterSetter idgs=new IdProofGetterSetter();
		idgs.setNumber(123);
		idgs.setName("Indrajeet Gupta");
		idgs.setAddress("Virar");
		
		PersonGetterSetter per=new PersonGetterSetter();
		per.setpAge(24);
		per.setpGender("Male");
		per.setpName("Ankit Mishra");
		per.setAddress(add);
		per.setId(idgs);
		
		System.out.println(per);
		System.out.println();
		
		

	}

}
