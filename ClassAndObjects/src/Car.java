import java.util.Scanner;

public class Car {
	String carName, carColor, modeOfPayment, carModel;
	int carSpeed, marutiPrice = 1030000, volvoPrice = 9330000, mercedesPrice = 4410000, mahindraPrice = 610000,
			toyotaPrice = 1810000, bmwPrice = 7990000;
	float discount;

	void acceptDetails() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose Car Color Ex.(Red, White, Silver, Black, Maroon)");
		carColor = sc.next();
		System.out.println("Enter Speed of Car Ex.(85KM/H-150KM/H)");
		carSpeed = sc.nextInt();
	}

	void setCarPrice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Car Name Ex.(Maruti, Volvo, Mercedes, Mahindra, Toyota, BMW)");
		carName = sc.next();
		if (carName.equalsIgnoreCase("Maruti")) {
			System.out.println("Price of Maruti 'Grand Vitara' is: 10,30,000.00 /-");
		} else if (carName.equalsIgnoreCase("Volvo")) {
			System.out.println("Price of Volvo 'XC90' is: 93,30,000.00 /-");
		} else if (carName.equalsIgnoreCase("Mercedes")) {
			System.out.println("Price of Mercedes 'Benz GLA' is: 44,10,000.00 /-");
		} else if (carName.equalsIgnoreCase("Mahindra")) {
			System.out.println("Price of Mahindra 'KUV 100 NXT' is: 6,10,000.00 /-");
		} else if (carName.equalsIgnoreCase("Toyota")) {
			System.out.println("Price of Toyota 'Innova Hycross' is: 18,10,000.00 /-");
		} else if (carName.equalsIgnoreCase("BMW")) {
			System.out.println("Price of BMW 'X5' is: 79,90,000.00 /-");
		} else {
			System.out.println("Please Enter Car Name Those Are Mentioned Above");
		}
	}

	void display() {
		System.out.println("Car Name is: " + carName + "\nCar Price: " + marutiPrice + "\nCar Color: " + carColor);
	}

	void discount() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nChoose Mode of Payments ex.(Online/Cash/Card)");
		modeOfPayment = sc.next();

		System.out.println("\nMode of Payments: " + modeOfPayment);
		if ((modeOfPayment.equalsIgnoreCase("Online")) || (modeOfPayment.equalsIgnoreCase("Cash"))
				|| (modeOfPayment.equalsIgnoreCase("Card"))) {
			discount = (marutiPrice * 5) / 100;
			System.out.println("Discount is: '" + discount + "'");
			System.out.println("New Price: " + (marutiPrice - discount));
		}
	}

	public static void main(String[] args) {
		Car cars = new Car();

		cars.setCarPrice();
		cars.acceptDetails();
		cars.display();
		cars.discount();

	}

}
