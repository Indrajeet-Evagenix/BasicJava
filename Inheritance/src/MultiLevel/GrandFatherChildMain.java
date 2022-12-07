package MultiLevel;

public class GrandFatherChildMain {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.setChildFirstName("Indrajeet");
		ch.setFatherFirstName("Kishanlal");
		ch.setGrandFatherFirstName("Ramlakhan");
		ch.setGrandFatherMiddleName("Agnu");

		GrandFather.setLastName("Gupta");

		ch.display();

	}

}
