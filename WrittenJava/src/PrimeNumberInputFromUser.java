import java.util.Scanner;

public class PrimeNumberInputFromUser {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number");
		number = sc.nextInt();

		for (int i = 2; i <= number; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println("the Prime Number is: " + i);
			}
		}

	}

}
