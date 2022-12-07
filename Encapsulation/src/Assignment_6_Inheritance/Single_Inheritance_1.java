package Assignment_6_Inheritance;

class Bicycle {
	void maxSpeed() {
		System.out.println("120 KMPH");
	}
}

class MountainBike extends Bicycle {
	void minSpeed() {
		System.out.println("0 KMPH");
	}
}

public class Single_Inheritance_1 {

	public static void main(String[] args) {
		MountainBike mb = new MountainBike();

		mb.maxSpeed();
		mb.minSpeed();

	}

}
