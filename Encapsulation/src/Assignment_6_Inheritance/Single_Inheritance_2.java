package Assignment_6_Inheritance;

class Animal {
	void eat() {
		System.out.println("Eating");
	}
}

class Cat extends Animal {
	void bark() {
		System.out.println("Barking");
	}
}

public class Single_Inheritance_2 {

	public static void main(String[] args) {
		Cat ct = new Cat();
		ct.eat();
		ct.bark();

	}

}
