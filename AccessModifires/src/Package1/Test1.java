package Package1;

public class Test1 {

	int a = 100;
	private int b = 200;
	protected int c = 300;
	public int d = 400;

	void display() {

	}

	void display1() {

	}
	
	protected void display2() {

	}

	public static void main(String[] args) {
		Test1 ts = new Test1();

		System.out.println(ts.a); // Default
		System.out.println(ts.b); // Private
		System.out.println(ts.c); // Protected
		System.out.println(ts.d); // Public

	}

}
