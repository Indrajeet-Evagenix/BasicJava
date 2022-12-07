import java.util.Scanner;

public class CalculatorParameter {

	void add(int a, float b) {
		System.out.println("The Addition Of Two NUmbers is: " + (a + b));
	}

	void sub(int a, float b) {
		System.out.println("The Substraction Of Two NUmbers is: " + (a - b));
	}

	void mul(int a, float b) {
		System.out.println("The Multplication Of Two NUmbers is: " + (a * b));
	}

	void division(int a, float b) {
		System.out.println("The Division Of Two NUmbers is: " + (a / b));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Two Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();

		CalculatorParameter c1 = new CalculatorParameter();

		c1.add(a, b);
		c1.sub(a, b);
		c1.mul(a, b);
		c1.division(a, b);

		sc.close();
	}

}
