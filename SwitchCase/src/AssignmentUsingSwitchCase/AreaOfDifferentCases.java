package AssignmentUsingSwitchCase;

import java.util.Scanner;

public class AreaOfDifferentCases {

	public static void main(String[] args) {
		int number;
		double radius, result, side, h, b, l;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Which Condition you Want to Print !");
		System.out.println(
				"Press '1' for Area of Circle\nPress '2' for Area of Square\nPress '3' for Area of Right Angle Trianlge\nPress '4' for Area of Rectangle Circumference of Circle Perimeter");
		number = sc.nextInt();

		switch (number) {
		case 1:
			System.out.println("Enter the Radius of a Circle");
			radius = sc.nextInt();
			result = (3.14) * radius * radius;
			System.out.println("Area of Cicle is: " + result);
			break;
		case 2:
			System.out.println("Enter the Side of a Square");
			side = sc.nextInt();
			result = side * side;
			System.out.println("Area of Square is: " + result);
			break;
		case 3:
			System.out.println("Enter the Height of a Right Angle Trianlge");
			h = sc.nextInt();
			System.out.println("Enter the Base of a Right Angle Trianlge");
			b = sc.nextInt();
			result = (b * h) / 2;
			System.out.println("Area of Right Angle Trianlge is: " + result);
			break;
		case 4:
			System.out.println("Enter the Length of a Rectangle Circumference of Circle Perimeter");
			l = sc.nextInt();
			System.out.println("Enter the Base of a Rectangle Circumference of Circle Perimeter");
			b = sc.nextInt();
			result = 2 * (l + b);
			System.out.println("Area of Rectangle Circumference of Circle Perimeter is: " + result);
			break;
		default:
			System.out.println("Please Enter The Valid Input");
		}

		sc.close();
	}

}
