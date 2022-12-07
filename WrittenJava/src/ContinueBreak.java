import java.util.Scanner;

public class ContinueBreak {

	public static void main(String[] args) {
		int i = 1, number, numbers;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number");
		number = sc.nextInt();

		while (i <= number) {
			i++;
			if (i % 4 == 0) {
				continue;
//				break;
			}
			System.out.println(i + " ");
		}
		sc.close();

	}

}
