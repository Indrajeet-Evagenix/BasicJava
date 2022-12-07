package Pattern;
//import java.util.Scanner;


public class Pattern3 {

	public static void main(String[] args) {
//		int row;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Row Number");
//		row = sc.nextInt();
		
		for(char i='a';i<='d';i++)
		{
			for(char j='a';j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
//		sc.close();

	}

}
