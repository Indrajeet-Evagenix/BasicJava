import java.util.Scanner;

public class DigitsOfProduct {

	public static void main(String[] args) {
		int num, product = 1, rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number");
		num = sc.nextInt();

		while (num != 0) {
			rem = num % 10;
			product = product * rem;
			num = num / 10;
		}
		System.out.println(product);
		sc.close();
	}

}
