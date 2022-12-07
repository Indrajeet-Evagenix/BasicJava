package Static;

public class StaticMethodExample2 {
	
	int a=10;
	static int b;
	
	static class inner{
		void display(){
			b++;
			System.out.println(" "+b);
		}
	}

	public static void main(String[] args) {
		System.out.println(StaticMethodExample2.b);
		
		StaticMethodExample2.inner sme=new StaticMethodExample2.inner();
		
		sme.display();

	}

}
