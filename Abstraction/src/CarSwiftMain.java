
public class CarSwiftMain {

	// how we can call the constructor in inheritance ?
	// when we create its child class object then parent class of constructor
	// automatically called before child class constructor

	public static void main(String[] args) {
		Swift sf = new Swift();
		sf.wheelNumber();
		sf.headLights();
		sf.dashboard();
		sf.buildQuality();
		sf.safetyFeatures();

		sf.acceptDetails("1100 CC", 800000);
		sf.display();

	}

}