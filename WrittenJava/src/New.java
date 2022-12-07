import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		int i = 1, number, numbers;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number");
		number = sc.nextInt();
		while (i <= 10) {
			numbers = number * i;
			System.out.println(numbers + " ");
			i++;
		}
		sc.close();

	}

}
