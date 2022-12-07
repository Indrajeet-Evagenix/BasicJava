package Static;

public class StaticMethodMain {

	public static void main(String[] args) {
		
// 		Calling The Static Variable of Another Class to in This Class
		System.out.println(StaticMethod.universityName + "\n"
				+ StaticMethod.collegeName);
		
//		Calling The Method of Another Class by Using its ClassName
		StaticMethod.setVariables();
		
		StaticMethod sm = new StaticMethod();
		StaticMethod sm1 = new StaticMethod();
		StaticMethod sm2 = new StaticMethod();
		
//		System.out.println(sm.universityName);
//		System.out.println(sm.collegeName);

	}

}
