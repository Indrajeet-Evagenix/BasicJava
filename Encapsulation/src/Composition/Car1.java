package Composition;

public class Car1 {

	int carId, carPrice;
	String carName, carColor;

	Driver dr;

	Car1(int id, int price, String name, String color, int dId, String dName,
			String dContact) {
		carId = id;
		carPrice = price;
		carName = name;
		carColor = color;

		dr = new Driver(dId, dName, dContact);
	}

	public String toString() {
		return "Car id: " + carId + ", Car Name: " + carName + ", Car Price: "
				+ carPrice + ", Car Color: " + carColor+"\n"+dr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
