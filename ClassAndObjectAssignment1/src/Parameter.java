import java.util.Scanner;

public class Parameter {
	void factors(int fact) {
		int sum = 0;
		for (int i = 1; i <= fact; i++) {
			if (fact % i == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		// create a one method which take integer type of input and find sum of
		// factors of given parameter
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number");
		int a = sc.nextInt();

		Parameter pr = new Parameter();

		pr.factors(a);
		sc.close();
	}

}
