import java.util.Scanner;

public class SimpleInterest {

	void sInterest(int p, int r, int t) {
		float a = (p * r * t) / 100;
		System.out.println("Final Amount of Simple Interest is: " + a);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Values");
		System.out.println("Enter The Initial Principle Balance");
		int p = sc.nextInt();
		System.out.println("Enter The Annual Interest Rate");
		int r = sc.nextInt();
		System.out.println("Enter The Time(in year)");
		int t = sc.nextInt();

		SimpleInterest c1 = new SimpleInterest();

		c1.sInterest(p, r, t);

		sc.close();
	}

}
