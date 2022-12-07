package Pattern;
import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		int row;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row Number");
		row = sc.nextInt();
		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}

}
