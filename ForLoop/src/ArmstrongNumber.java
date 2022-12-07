import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num, sum = 0, temp, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		num = sc.nextInt();
		temp = num;

		while (temp != 0) {
			count++;
			temp = temp / 10;
		}
		temp = num;
		while (temp != 0) {
			int power = 1;
			int remainder = temp % 10;
			for (int i = 1; i <= count; i++) {
				power = power * remainder;
			}
			sum = sum + power;
			temp = temp / 10;

			 System.out.println(sum);
		}
		System.out.println("Result is: " + sum);
		if (sum == num) {
			System.out.println("The Given Number '" + num
					+ "' is Armstrong Number !");
		} else {
			System.out.println("The Given Number '" + num
					+ "' is Not a Armstrong Number !");
		}
		sc.close();
	}

}
