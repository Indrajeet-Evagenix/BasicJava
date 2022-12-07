import java.util.Scanner;

public class AdditionOfEvenNumber {

	public static void main(String[] args) {
		int i = 1, number, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number");
		number = sc.nextInt();

		while (number != 0) {
			int r = number % 10;
			if (r % 2 == 0) {
				sum = sum + r;
			}
			number = number / 10;
		}
		System.out.println("Addition is: " + sum);
		sc.close();

	}

}
