import java.util.Scanner;

public class BasePower {

	public static void main(String[] args) {
		int base, power = 3, newBase = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		base = sc.nextInt();

		for (int i = 1; i <= power; i++) {
			newBase = newBase * base;
		}
		System.out.println(newBase + "");
		sc.close();
	}

}
