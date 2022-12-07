//import java.util.Scanner;

public class SquaresOfNumbers {

	public static void main(String[] args) {
		int num = 0, i;
//		Scanner sc = new Scanner(System.in);
		System.out.println("Squares From '1' to '20' is: ");
//		num = sc.nextInt();
		
		for(i=1;i<=20;i++)
		{
			num=i*i;
			System.out.println("Square Of '"+i+"' is: = '"+num+"'");
		}
	}

}
