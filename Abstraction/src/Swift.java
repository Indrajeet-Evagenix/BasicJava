
public class Swift extends Car {

	void acceptDetails(String engineName, int price) {
		engine = engineName;
		this.price = price;
	}

	void display() {
		System.out.println("Engine Name: " + engine + ", Price: " + price);
	}

	void dashboard() {
		System.out.println("Swift is Looking to Good");
	}

	void safetyFeatures() {
		System.out.println("Swift Features");
	}

	void buildQuality() {
		System.out.println("Swift Quality");
	}

}
