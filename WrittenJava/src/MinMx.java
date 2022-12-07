import java.util.Scanner;

public class MinMx {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number");
		number = sc.nextInt();

		int min = number % 10;
		int max = number % 10;
		while (number != 0) {
			int remainder = number % 10;
			if (remainder < min) {
				min = remainder;
			}
			if (remainder > max) {
				max = remainder;
			}
			number = number / 10;
		}
		System.out.println("Minimum Digit is: " + min);
		System.out.println("Maximum Digit is: " + max);
		sc.close();

	}

}
