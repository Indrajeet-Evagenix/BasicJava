package OverloadingExmple;
public class Example1 {

	void add(int a, int b) {
		System.out.println("Addition of 2 number is: " + (a + b));
	}

	void add(int a, int b, int c) {
		System.out.println("Addition of 3 number is: " + (a + b + c));
	}

	void add(int a, String b) {
		System.out.println("Addition of 1 number and 1 String is: " + (a + b));
	}

	void add(String a, int b) {
		System.out.println("Addition of 1 String and 1 number is: " + (a + b));
	}

	void add(String a, String b) {
		System.out.println("Addition of 2 String is: " + (a + b));
	}

	public static void main(String[] args) {
		Example1 ex=new Example1();
		
		ex.add(5, 9);
		ex.add("hello",5);
		ex.add(6, "Hello");
		ex.add("hello ", "Hello");
		ex.add(5, 6, 8);

	}

}
