package AssignmentUsingSwitchCase;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number of Days");
		number = sc.nextInt();

		switch (number) {
		case 1:
			System.out.println("You have Entered '1' That is: 'Monday'");
			break;
		case 2:
			System.out.println("You have Entered '2' That is: 'Tuesday'");
			break;
		case 3:
			System.out.println("You have Entered '3' That is: 'Wednesday'");
			break;
		case 4:
			System.out.println("You have Entered '4' That is: 'Thursday'");
			break;
		case 5:
			System.out.println("You have Entered '5' That is: 'Friday'");
			break;
		case 6:
			System.out.println("You have Entered '6' That is: 'Saturday'");
			break;
		case 7:
			System.out.println("You have Entered '7' That is: 'Sunday'");
			break;
		default:
			System.out.println("You have Entered Invalid Input");
		}
		sc.close();

	}

}
