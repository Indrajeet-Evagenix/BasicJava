package RunTimePolymorphism;

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		
		Fruit f=new Fruit();
		f.taste();
		
		f=new Apple();// Also Known as Upcasting
		f.taste();
		
		f=new Strawberry();
		f.taste();

		/* 
		 * Apple a=(Apple) new Fruit(); a.taste();// Also Known as Downcasting
		 */// That is Not Allowed in Java
	}

}
