package ConstructorWritten;

public class CopyOfObjects {
	public static void main(String[] args) {
		CopyOfObjects cb=new CopyOfObjects();
		
		CopyOfObjects cb1=new CopyOfObjects();
		
		cb1=cb;
		
		System.out.println(cb1);
		System.out.println(cb);

	}

}
