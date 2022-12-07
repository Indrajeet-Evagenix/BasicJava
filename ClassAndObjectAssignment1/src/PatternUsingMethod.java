import java.util.Scanner;

public class PatternUsingMethod {

	void pattern1(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void pattern2(int row) {
		System.out.println();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Row");
		int r = sc.nextInt();

		PatternUsingMethod pt = new PatternUsingMethod();

		pt.pattern1(r);
		pt.pattern2(r);

		sc.close();

	}

}
