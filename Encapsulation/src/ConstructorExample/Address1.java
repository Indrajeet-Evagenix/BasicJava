package ConstructorExample;

public class Address1 {

	int pincode;
	String area, city, state;

	Address1(int pincode, String area, String city, String state) {
		this.pincode = pincode;
		this.area = area;
		this.city = city;
		this.state = state;
	}

	public String toString() {
		return "Address is: " + area + ", " + city + ", " + state + ", "
				+ pincode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
