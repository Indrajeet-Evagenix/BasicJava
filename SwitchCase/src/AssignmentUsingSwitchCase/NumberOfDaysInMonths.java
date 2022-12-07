package AssignmentUsingSwitchCase;

import java.util.Scanner;

public class NumberOfDaysInMonths {

	public static void main(String[] args) {
		int months;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Months Number");
		months = sc.nextInt();

		switch (months) {
		case 1:
			System.out.println("You have Enterd 'Jan' Month: In This Month Number of Days is '31' ");
			break;
		case 2:
			System.out.println("You have Enterd 'Feb' Month: In This Month Number of Days is '28' ");
			break;
		case 3:
			System.out.println("You have Enterd 'March' Month: In This Month Number of Days is '31' ");
			break;
		case 4:
			System.out.println("You have Enterd 'Apr' Month: In This Month Number of Days is '30' ");
			break;
		case 5:
			System.out.println("You have Enterd 'May' Month: In This Month Number of Days is '31' ");
			break;
		case 6:
			System.out.println("You have Enterd 'June' Month: In This Month Number of Days is '30' ");
			break;
		case 7:
			System.out.println("You have Enterd 'July' Month: In This Month Number of Days is '31' ");
			break;
		case 8:
			System.out.println("You have Enterd 'Aug' Month: In This Month Number of Days is '31' ");
			break;
		case 9:
			System.out.println("You have Enterd 'Sept' Month: In This Month Number of Days is '30' ");
			break;
		case 10:
			System.out.println("You have Enterd 'Oct' Month: In This Month Number of Days is '31' ");
			break;
		case 11:
			System.out.println("You have Enterd 'Nov' Month: In This Month Number of Days is '30' ");
			break;
		case 12:
			System.out.println("You have Enterd 'Dec' Month: In This Month Number of Days is '31' ");
			break;
		default:
			System.out.println("You have Entered Invalid Months Number");
		}
		sc.close();
	}

}
