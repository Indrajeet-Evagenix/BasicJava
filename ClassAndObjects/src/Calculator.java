import java.util.Scanner;

public class Calculator {

	void add() {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("*****For Addition*****\nEnter Two Numbers");
		System.out.println("Enter First Numbers");
		a = sc.nextInt();
		System.out.println("Enter Second Numbers");
		b = sc.nextInt();
		System.out.println("The Addition Of Two Numbers is: " + (a + b));

	}

	void sub() {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("*****For Substraction*****\nAgain Enter Two Numbers");
		System.out.println("Enter First Numbers");
		a = sc.nextInt();
		System.out.println("Enter Second Numbers");
		b = sc.nextInt();
		System.out.println("The Substraction Of Two Numbers is: " + (a - b));

	}

	void mul() {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("*****For Multiplication*****\nAgain Enter Two Numbers");
		System.out.println("Enter First Numbers");
		a = sc.nextInt();
		System.out.println("Enter Second Numbers");
		b = sc.nextInt();
		System.out.println("The Multiplication Of Two Numbers is: " + (a * b));

	}

	void division() {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("*****For Division*****\nAgain Enter Two Numbers");
		System.out.println("Enter First Numbers");
		a = sc.nextInt();
		System.out.println("Enter Second Numbers");
		b = sc.nextInt();
		System.out.println("The Division Of Two Numbers is: " + (a / b));

	}

}
