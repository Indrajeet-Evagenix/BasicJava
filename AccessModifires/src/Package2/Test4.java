package Package2;

import Package1.Test1;

public class Test4 extends Test1{

	public static void main(String[] args) {
		Test4 ts = new Test4();

		System.out.println(ts.a); // Default
		System.out.println(ts.b); // Private
		System.out.println(ts.c); // Protected
		System.out.println(ts.d); // Public

	}

}
