import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		int num, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		num = sc.nextInt();

		int temp = num;
		while (num != 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		// System.out.println(sum);

		if (temp % sum == 0) {
			System.out.println("The Given Number is Harshad Number");
		} else {
			System.out.println("The Given Number is Not a Harshad Number");
		}

		sc.close();
	}

}
