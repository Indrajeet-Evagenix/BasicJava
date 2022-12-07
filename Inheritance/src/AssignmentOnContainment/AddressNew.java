package AssignmentOnContainment;

public class AddressNew {

	String city, state, country;

	AddressNew(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public String toString(){
		return "Address: "+city+", "+state+", "+country;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
