import java.util.Scanner;

public class DaysWeeksYears {

	public static void main(String[] args) {
		int days, weeks, years, day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number of Days");
		days = sc.nextInt();

		years = days / 365;
		days = days % 365;

		System.out.println("No. of Years is: " + years);

		weeks = days / 7;
		days = days % 7;

		System.out.println("No. of Extra Weeks is: " + weeks);

		day = days;
		System.out.println("No. of Extra Days is: " + day);

		sc.close();
	}

}
