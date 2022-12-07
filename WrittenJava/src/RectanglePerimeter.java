import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) {
		int length, breadth, perimeter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Length of The Rectangle");
		length = sc.nextInt();
		System.out.println("Enter The Breadth of The Rectangle");
		breadth = sc.nextInt();

		perimeter = 2 * (length + breadth);

		System.out.println("Perimeter of Rectangle is: " + perimeter);

		sc.close();
	}

}
