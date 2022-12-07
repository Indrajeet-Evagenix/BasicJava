package AssignmentUsingSwitchCase;

import java.util.Scanner;

public class NumberIntoWord {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number Between '1' to '5'");
		number = sc.nextInt();

		switch (number) {
		case 1:
			System.out.println("You have Entered '1' Converted into: 'One'");
			break;
		case 2:
			System.out.println("You have Entered '2' Converted into: 'Two'");
			break;
		case 3:
			System.out.println("You have Entered '3' Converted into: 'Three'");
			break;
		case 4:
			System.out.println("You have Entered '4' Converted into: 'Four'");
			break;
		case 5:
			System.out.println("You have Entered '5' Converted into: 'Five'");
			break;
		default:
			System.out.println("Please Enter Valid Input");
		}
		sc.close();

	}

}
