package Package1;

public class Test2 extends Test1 {

	void display() {

	}

	private display1() { // we can not Reduce Complexity or visibility of Methods to another subclass

	}

	public void display2() { // we can increase Complexity or visibility of Methods to another subclass

	}

	public static void main(String[] args) {
		Test2 ts = new Test2();

		System.out.println(ts.a); // Default
		System.out.println(ts.b); // Private
		System.out.println(ts.c); // Protected
		System.out.println(ts.d); // Public

	}

}
