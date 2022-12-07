import java.util.Scanner;

public class AdditionOFDigitsNumber {
	public static void main(String[] args) {
		int i = 1, number, sum = 0, product = 1, cnt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number");
		number = sc.nextInt();
//		while (number != 0) {
//			int r = number % 10;
//			sum = sum + r;
//			number = number / 10;
//		}
//		System.out.println("Addition is: " + sum);

		// Product of Digits
//		while (number != 0) {
//			int r = number % 10;
//			product = product * r;
//			number = number / 10;
//		}
//		System.out.println("Addition is: " + product);

		// Count of Digits
		while (number != 0) {
			int r = number % 10;
			cnt++;
			number = number / 10;
		}
		System.out.println("Addition is: " + cnt);
		sc.close();

	}

}
