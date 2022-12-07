import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int num1, num2;
		char ch;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Please Enter Two Number");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println("Addition of Two Numbers is: " + (num1 + num2));
			System.out.println("Do You Want to Continue Press ?? 'Y/N'");
			ch = sc.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');
		sc.close();

	}

}
