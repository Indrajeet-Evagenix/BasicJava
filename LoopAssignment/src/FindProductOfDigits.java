import java.util.Scanner;

public class FindProductOfDigits {

	public static void main(String[] args) {
		int num, product = 1, temp, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		num = sc.nextInt();

		temp = num;

		while (temp > 0) {
			int rem = temp % 10;
			product = product * rem;

			temp = temp / 10;
		}
		System.out.println("The Product of '" + num + "' is: " + product);

		sc.close();
	}

}
