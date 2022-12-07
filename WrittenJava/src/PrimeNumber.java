import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int number, i = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number");
		number = sc.nextInt();

		int mid = number / 2;

		while (i <= mid) {
			if (number % i == 0) {
				break;
			}
			i++;
		}
		if (i > mid) {
			System.out.println("The Given Number is Prime");
		} else {
			System.out.println("The Given Number is Not Prime");
		}
		sc.close();

	}

}
