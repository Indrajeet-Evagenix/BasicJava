import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		int num, count = 0, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		num = sc.nextInt();

		temp = num;

		while (temp != 0) {
			count++;
			temp = temp / 10;
		}
		System.out.println(count);
		sc.close();
	}

}
