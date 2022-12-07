package PracticeConstructoorExample;

public class Address {

	int srNumber, pinNumber;
	String societyName, cityName;

	Address(int srno, int pin, String society, String city) {

		srNumber = srno;
		pinNumber = pin;
		societyName = society;
		cityName = city;
	}

	/*
	 * public void acceptAddressDetails(int srno, int pin, String society,
	 * String city) { srNumber = srno; pinNumber = pin; societyName = society;
	 * cityName = city; }
	 */

//	public Address(int srno, int pin, String society, String city) {
//		// TODO Auto-generated constructor stub
//	}

	public String toString() {
		return "Address of Employee is: " + srNumber + ", " + societyName
				+ ", " + cityName + ", " + pinNumber;
	}

	/*
	 * public void showAddress() {
	 * System.out.println("Address oof Employee is: " + srNumber + ", " +
	 * societyName + ", " + cityName + ", " + pinNumber); }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
