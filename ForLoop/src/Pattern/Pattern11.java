package Pattern;
import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		int row;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row Number");
		row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j % 2 == 0) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
