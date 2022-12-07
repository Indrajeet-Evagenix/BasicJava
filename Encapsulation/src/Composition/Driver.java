package Composition;

public class Driver {

	int driverId;
	String driverName, driverContact;

	Driver(int id, String name, String contact) {
		driverId = id;
		driverName = name;
		driverContact = contact;
	}

	public String toString() {
		return "Driver Id: " + driverId + ", Driver Name: " + driverName
				+ ", Driver Contact No. " + driverContact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
