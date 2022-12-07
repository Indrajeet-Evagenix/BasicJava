import java.util.Scanner;

public class BaseIndexPower {

	public static void main(String[] args) {
		int base, index, power = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Base");
		base = sc.nextInt();
		System.out.println("Please Enter The Index");
		index = sc.nextInt();

		for (int i = 1; i <= index; i++) {
			power = power * base;
		}
		System.out.println(power);
		sc.close();
	}

}
