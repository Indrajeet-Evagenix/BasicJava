
interface C {
	void add(int a, int b);

	void multiply(int a, int b);

	void sqrt(int a);
}

interface D {
	void sub(int a, int b);

	void sqrt(int a);

}

class CDF {

	public void sqrt(int a) {
		System.out.println("Square root of: " + Math.sqrt(a));
	}

	public void add(int a, int b) {
		System.out.println("Addition is: " + (a + b));
	}

}

class DEF extends CDF implements C, D {

	public void add(int a, int b) {
		System.out.println("Addition is: " + (a + b));
	}

	public void multiply(int a, int b) {
		System.out.println("Multiplication is: " + (a * b));
	}

	public void sub(int a, int b) {
		System.out.println("Substraction is: " + (a - b));
	}
}

public class Multiple_2 {

	public static void main(String[] args) {
		DEF de = new DEF();

		de.add(20, 25);
		de.sub(20, 10);
		de.multiply(2, 5);
		de.sqrt(49);

	}

}
