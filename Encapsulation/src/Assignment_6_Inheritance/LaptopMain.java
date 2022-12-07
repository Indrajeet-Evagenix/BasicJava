package Assignment_6_Inheritance;

public class LaptopMain {

	public static void main(String[] args) {
		Laptop lp = new Laptop();
		lp.setNoOfUSBPort(4);
		lp.setProcessorSpeed(120);

		System.out.println("Number of USB Port: " + lp.getNoOfUSBPort());
		System.out.println("Processor Speed is: " + lp.getProcessorSpeed());

	}

}
