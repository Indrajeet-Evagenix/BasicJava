package AssignmentUsingSwitchCase;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int number, n1, n2, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("***********Menu***********");
		System.out.println(
				"Press '1' for Addition\nPress '2' for Substraction\nPress '3' for Multiplication\nPress '4' for Divide\nPress '5' for Percentage");
		number = sc.nextInt();

		switch (number) {
		case 1:
			System.out.println("Enter The First Number");
			n1 = sc.nextInt();
			System.out.println("Enter The Second Number");
			n2 = sc.nextInt();
			result = n1 + n2;
			System.out.println("Addition of '" + n1 + "' and '" + n2 + "' is: " + result);
			break;
		case 2:
			System.out.println("Enter The First Number");
			n1 = sc.nextInt();
			System.out.println("Enter The Second Number");
			n2 = sc.nextInt();
			result = n1 - n2;
			System.out.println("Substraction of '" + n1 + "' and '" + n2 + "' is: " + result);
			break;
		case 3:
			System.out.println("Enter The First Number");
			n1 = sc.nextInt();
			System.out.println("Enter The Second Number");
			n2 = sc.nextInt();
			result = n1 * n2;
			System.out.println("Multiplication of '" + n1 + "' and '" + n2 + "' is: " + result);
			break;
		case 4:
			System.out.println("Enter The First Number");
			n1 = sc.nextInt();
			System.out.println("Enter The Second Number");
			n2 = sc.nextInt();
			result = n1 / n2;
			System.out.println("Divide of '" + n1 + "' and '" + n2 + "' is: " + result);
			break;
		case 5:
			System.out.println("Enter The First Number");
			n1 = sc.nextInt();
			System.out.println("Enter The Second Number");
			n2 = sc.nextInt();
			result = n1 % n2;
			System.out.println("Percentage of '" + n1 + "' and '" + n2 + "' is: " + result);
			break;
		default:
			System.out.println("Enter The Valid Number");
		}
		sc.close();
	}

}
