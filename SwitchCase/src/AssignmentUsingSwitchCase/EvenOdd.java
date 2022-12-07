package AssignmentUsingSwitchCase;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number");
		number = sc.nextInt();

		switch (number % 2) {
		case 0:
			System.out.println("The Given Number is Even: " + number);
			break;
		default:
			System.out.println("The Given Number is Odd: " + number);
		}

		sc.close();
	}

}
