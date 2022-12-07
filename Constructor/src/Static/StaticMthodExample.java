package Static;

public class StaticMthodExample {
	
	int a=10;
	static int b;
	
	static{
		b++;
		System.out.println("This is a First Block");
	}
	
	static{
		b++;
		System.out.println("This is a Second Block");
	}
	
	static{
		b++;
		System.out.println("This is a Third Block");
	}

	public static void main(String[] args) {
		System.out.println(StaticMthodExample.b);

	}

}
