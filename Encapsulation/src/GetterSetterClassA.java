class ClassA {
	private int value1;
	private String value2;

	public int getValue1() {
		return value1;
	}

	public void setValue1(int num) {
		this.value1 = num;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String s) {
		this.value2 = s;
	}
}

public class GetterSetterClassA {

	public static void main(String[] args) {
		ClassA obj = new ClassA();

		obj.setValue1(34);
		obj.setValue2("indra");

		System.out.println("Value1 is: " + obj.getValue1());
		System.out.println("Value2 is: " + obj.getValue2());

	}

}
