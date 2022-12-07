package Static;

public class StaticMethodExample3 {

	int a = 10, c = 20;
	static int b;

	void setData() {
		System.out.println(b + " " + a);
	}

	static boolean setVariables() {
		StaticMethodExample3 sme = new StaticMethodExample3();
		System.out.println(sme.c = 25);
		return false;

	}

	static class inner {
		void display() {
			b++;
			System.out.println(" " + b);

		}
	}

	public static void main(String[] args) {

		StaticMethodExample3.inner sme = new StaticMethodExample3.inner();

		sme.display();

		StaticMethodExample3 sme1 = new StaticMethodExample3();
		System.out.println();
		System.out.println(StaticMethodExample3.setVariables());
	}

}
