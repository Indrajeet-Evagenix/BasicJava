import java.util.Scanner;

public class TableOfGivenNumber {

	public static void main(String[] args) {
		int num, table;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			table = num * i;
			System.out.println(table);
		}
		sc.close();
	}
}
