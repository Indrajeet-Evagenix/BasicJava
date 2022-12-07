public class PrimeNumberBetween2 {

	public static void main(String[] args) {

		System.out.println("The Prime Number Between '400' to '300' is: \n");

		for (int num = 400; num >= 300; num--) {
			int i = 2;
			int mid = num / 2;
			while (i <= mid) {

				if (num % i == 0) {
					break;
				}
				i++;
			}
			if (i > mid) {
				System.out.print(num + " ");
			}

		}

	}

}
