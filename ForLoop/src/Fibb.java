import java.util.Scanner;

public class Fibb {

	public static void main(String[] args) {
		int a = 0, b = 1, c, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.print(a+" ");
			c = a + b;
			a = b;
			b = c;
		}
		sc.close();
	}

}
