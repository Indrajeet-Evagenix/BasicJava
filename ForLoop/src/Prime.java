import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		int i = 2;
		int mid = num / 2;
		while (i <= mid) {

			if (num % i == 0) {
				break;
			}
			i++;
		}
		if (i > mid) {
			System.out.println("Thi Given number is Prime");
		} else {
			System.out.println("The Given number is not Prime");
		}
		sc.close();
	}
}

/*
 * for (char i = 'e'; i >= 'a'; i--) { for (char j = 'e'; j >= i; j--){
 * System.out.print(j); } System.out.println(); }
 */
/*
 * for (char i = 'a'; i <= 'e'; i++) { for (char j = 'e'; j >= i; j--){
 * System.out.print(j); } System.out.println(); }
 * 
 * for (int i = 1; i <= 5; i++) { for (int j = 1; j <= 2*i-1; j++) {
 * System.out.print(j); } System.out.println(); }
 */

// }
// }
