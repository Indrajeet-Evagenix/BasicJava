public class PrimeNumberBetween {

	public static void main(String[] args) {
		int i = 2, low = 300, high = 400;
		System.out.print("The Prime Number Between '200' to '400' is: ");

		while (low < high) {
			boolean flag = false;

			for (i = 2; i <= low / 2; i++) {
				if (low % i == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.print(low + " ");
			}
			low++;
		}
	}
}
