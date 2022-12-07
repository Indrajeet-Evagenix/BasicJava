package AssignmentOnContainment;

public class PersonAddressNewMain {

	public static void main(String[] args) {
		IdProof add=new IdProof(12,"Indrajeet","nallasopara");
		
		AddressNew addressNew=new AddressNew("vasai","Maharashtra","India");
		
		PersonNew per=new PersonNew(25,8412967,"Indrajeet Gupta","Male",addressNew, add);
		
		System.out.println(per);

	}

}
