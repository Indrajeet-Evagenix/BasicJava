package StarPattern;
import java.util.Scanner;

public class StarPattern4 {

	public static void main(String[] args) {
		int i, j, k, number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number");
		number = sc.nextInt();

		for (i = 1; i <= number; i++) {
			for (j = 1; j <= number - i; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();

	}

}
