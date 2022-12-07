package AssignmentUsingSwitchCase;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		int number1, number2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The First Number");
		number1 = sc.nextInt();
		System.out.println("Please Enter The Second Number");
		number2 = sc.nextInt();

		switch (number1 > number2) {
		case 0:
			System.out.println("Greatest Number is: " + number1);
			break;
		case 0:
			System.out.println("Greatest Number is: " + number2);
			break;
		}
		sc.close();

	}

}
