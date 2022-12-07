import java.util.Scanner;

public class PrimeNumberUsingBoolean {

	public static void main(String[] args) {

		int num, i = 2;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number");
		num = sc.nextInt();

		while (i <= num / 2) {

			if (num % i == 0) {
				flag = true;
				break;
			}

			++i;
		}

		if (!flag) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}
		sc.close();

	}

}
