package Pattern;
import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		int i, j, k, row;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number");
		row = sc.nextInt();

		for (i = row; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (k = i; k <= row - 1; k++) {
				System.out.print(k);
			}
			for (int l = row; l >= i; l--) {
				System.out.print(l);
			}
			System.out.println();
		}
		sc.close();
	}

}
