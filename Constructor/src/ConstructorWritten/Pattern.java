package ConstructorWritten;

public class Pattern {

	public static void main(String[] args) {

		for (int i = 9; i >= 1; i--) {
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = i; j <= 9 - 1; j++) {
				System.out.print(j);
			}

			for (int j = 9; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

		/*
		 * for(int i=8;i>=1;i--){
		 * 
		 * for(int j=i;j<=9-1;j++){ System.out.print(j); } System.out.println(); }
		 */
	}

}
