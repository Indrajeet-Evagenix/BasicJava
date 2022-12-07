package OverloadingExmple;
public class ShapesArea {

	void area(int a) {
		System.out.println("Area of Square is: " + (a * a));
	}

	void area(int b, int h) {
		System.out.println("Area of Triangle is: " + ((b * h) / 2));
	}

	void area(float r) {
		System.out.println("Area of Circle is: " + (3.14 * r * r));
	}

	void area(float l, int w) {
		System.out.println("Area of Recatngle is: " + (l * w));
	}

	void area(int a, int b, int h) {
		System.out.println("Area of Trapezoid is: " + (((a + b) * h) / 2));
	}

	public static void main(String[] args) {
		ShapesArea sarea = new ShapesArea();

		sarea.area(6);
		sarea.area(8.5f);
		sarea.area(4.2f, 5);
		sarea.area(8, 9);
		sarea.area(5, 4, 6);

	}

}
