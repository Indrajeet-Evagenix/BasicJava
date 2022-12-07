
class A {
	final int a = 100; // As any variable we declear as final after that we can not change that
						// variable value
	static String city = "nallasopra"; // As any variable we declear as static after that we can
										// change that variable value

	void display() {
		System.out.println("Value of a in Class A is: " + a);
	}
}

class B extends A {
	void display1() {
		city = "Vasai";
		System.out.println("Value of a in Class B is: " + a);
	}
}

public class Final_Keyword {

	public static void main(String[] args) {
		B b = new B();
		b.display();
		b.display1();
		System.out.println(A.city);

	}

}
