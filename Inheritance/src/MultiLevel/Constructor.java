package MultiLevel;

class A 
{
	A() {
		System.out.println("Class A");
	}
}

class B extends A 
{
	B() {
		System.out.println("Class B");
	}

	B(int a) {
		System.out.println("Class B Parameterized");
	}
}

class C extends B 
{
	C() {
		super(10);
		System.out.println("Class C");
	}

}

class Constructor {

	public static void main(String[] args) {
		C c1 = new C();

	}

}