
public class Address {

	int pincode;
	String area, city, state;

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String toString() {
		return "Address is: " + area + ", " + city + ", " + state + ", " + pincode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
