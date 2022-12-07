package RunTimePolymorphism;

public class Fruit {
	void taste() {
		System.out.println("Taste of Fruit");
	}

}

class Apple extends Fruit {
	void taste() {
		System.out.println("Taste of Apple");
	}
}

class Strawberry extends Fruit {
	void taste() {
		System.out.println("Taste of Strawberry");
	}
}
