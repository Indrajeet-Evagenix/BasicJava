// How abstract class is define ?
// In abstract class there are abstract signature or method
// We can override the abstract class in another class by implementing abstract signature

public abstract class Car {// in abstract class we can not create object of abstract class

	String engine;
	int price;// Constructors allowed in abstract class

	void wheelNumber() {
		System.out.println("Car has 4 Wheel");
	}

	void headLights() {
		System.out.println("Car has 2 HeadLights");
	}

	// Define Abstract method ?
	// Abstract method is an method which is in return type and method name
	// and no any body of abstract method in abstract class
	abstract void dashboard();

	abstract void safetyFeatures();

	abstract void buildQuality();

}