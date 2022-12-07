import java.util.Scanner;

public class AllEvenNumbers {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		num = sc.nextInt();

		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println("The Even Given Number is: " + i);
			}

		}
		sc.close();
	}

}
