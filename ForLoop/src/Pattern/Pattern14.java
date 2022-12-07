package Pattern;
import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		int i, j, row, n1 = 0, n2 = 1, n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number");
		row = sc.nextInt();

		for (i = 0; i <= row; i++) {
			for (j = 1; j <= i; j++) {
				if (i == 1 && j == 1) {
					System.out.print("0" + " ");
					continue;
				}
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
				System.out.print(n3 + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
