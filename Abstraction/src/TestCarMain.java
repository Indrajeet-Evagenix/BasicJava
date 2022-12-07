
interface TestCar {
	void milage();

	void crash();

	void speedTest();

	void breakTest();

	void loadTest();
}

class Swift1 implements TestCar {

	@Override
	public void milage() {
		System.out.println("Milage of Car is: 25 KM/L");

	}

	@Override
	public void crash() {
		System.out.println("Car Many Times Get Crashed");

	}

	@Override
	public void speedTest() {
		System.out.println("Speed of Car Maximum 160 KM/H");

	}

	@Override
	public void breakTest() {
		System.out.println("Break Test Success");

	}

	@Override
	public void loadTest() {
		System.out.println("Car has Capacity to 4-5 Person at a Time");

	}

}

public class TestCarMain {

	public static void main(String[] args) {
		Swift1 st = new Swift1();

		st.milage();
		st.crash();
		st.speedTest();
		st.breakTest();
		st.loadTest();

	}

}
