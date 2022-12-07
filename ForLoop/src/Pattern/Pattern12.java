package Pattern;
import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		int number, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row Number");
		number = sc.nextInt();

		for (i = number; i >= 1; i--) {
			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (j = i; j <= number; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		for (i = 2; i <= number; i++) {
			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (j = i; j <= number; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}

}
