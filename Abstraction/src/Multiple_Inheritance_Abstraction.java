// when an Interface created in that interface we can write method name only
// we can not implement on that method

// we want implement those method which has written in interface for that
// we create its child class and implement all method in that child class
// and in main method we create child class object and by using that object we call one by one
// all method those are created in child class
interface A {
	void add(int a, int b);

	void sqrt(int a);
}

interface B {
	void sub(int a, int b);

}

class ABC implements A, B {
	public void add(int a, int b) {
		System.out.println("Addition is: " + (a + b));
	}

	public void sub(int a, int b) {
		System.out.println("Substraction is: " + (a - b));
	}

	public void sqrt(int a) {
		System.out.println("Square root of: " + Math.sqrt(25));
	}

}

public class Multiple_Inheritance_Abstraction {

	public static void main(String[] args) {
		ABC ma = new ABC();

		ma.add(10, 20);
		ma.sub(20, 10);
		ma.sqrt(25);

	}

}
