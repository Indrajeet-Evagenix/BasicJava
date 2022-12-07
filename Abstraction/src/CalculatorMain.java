
interface Calculator {
	void addition(int a, int b);

	void substraction(int a, int b);

	void multiplication(int a, int b);

	void division(int a, int b);
}

class SciCalculator implements Calculator {

	void power(int a, int b) {
		System.out.println("The Power '" + a + "' of '" + b + "' is: " + Math.pow(a, b));
	}

	void squarRoot(int a) {
		System.out.println("Square Root of '" + a + "' is: " + Math.sqrt(a));
	}

	void square(int a) {
		System.out.println("Square of number '" + a + "' is: " + (a * a));
	}

	@Override
	public void addition(int a, int b) {
		System.out.println("Addition of (" + a + "+" + b + ") is: " + (a + b));

	}

	@Override
	public void substraction(int a, int b) {
		System.out.println("Substraction of (" + a + "-" + b + ") is: " + (a - b));

	}

	@Override
	public void multiplication(int a, int b) {
		System.out.println("Multiplication of (" + a + "*" + b + ") is: " + (a * b));

	}

	@Override
	public void division(int a, int b) {
		System.out.println("Division (" + a + "/" + b + ") is: " + (a / b));

	}
}

public class CalculatorMain {

	public static void main(String[] args) {
		SciCalculator sc = new SciCalculator();

		sc.addition(10, 20);
		sc.substraction(20, 10);
		sc.multiplication(2, 5);
		sc.division(10, 5);

		sc.power(2, 3);
		sc.squarRoot(81);
		sc.square(6);

	}

}
