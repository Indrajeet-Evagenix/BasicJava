import java.util.Scanner;

public class PrintEvenNumber {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		number = sc.nextInt();

		while (number >= 121 && number <= 229) {
			if (number % 2 == 0) {
				System.out.println("Even Number is: " + number);
			}
			number++;
		}
		sc.close();

	}

}
