public class ConstructorChaining {
	/* In constructor chaining we can call in one constructor to other
	 constructor one by one within constructor*/
	
	// we can not call second constructor to first constructor
	// or we can not call third constructor to second constructor
	// or we can not call fourth constructor to third constructor
	ConstructorChaining() {
		System.out.println("simple constructor");
	}

	ConstructorChaining(int x) {
		this();
		System.out.println("1 Parameterized constructor");
	}

	ConstructorChaining(int x, int y) {
		this(10);
		System.out.println("2 Parameterized constructor");

	}

	ConstructorChaining(int x, int y, int z) {
		this(10, 111);
		System.out.println("3 Parameterized constructor");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
