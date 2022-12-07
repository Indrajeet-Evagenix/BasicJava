package Static;

public class InstanceBlockExample {

	int id;
	String name, producer;
	// What are the ways to initialize global variable ?
	// Constructor, Methods, Instance Block

	
	// Where are static variable initialize ?
	// Constructor, static method, static block, Instance Block
	{
		System.out.println("Instance Block 1");
		id = 1;
		name = "karan";
		producer = "karan with coffee";
	}

	// Instance Block will be called for every object creation before constructor
	{
		System.out.println("Instance Block 2");
		id = 2;
		name = "karan johar";
		producer = "karan with coffee 2";
	}

	InstanceBlockExample() {
		System.out.println("Simple Construuctor 1");
		 id=3;
		 name="milkShake";
		 producer="karan with coffee 3";
	}

	void display() {
		System.out.println(id + " " + name + " " + producer);
	}

	public static void main(String[] args) {
		InstanceBlockExample ibe = new InstanceBlockExample();

		ibe.display();

		System.out.println("------******------");
		InstanceBlockExample ibe1 = new InstanceBlockExample();

		ibe1.display();

	}

}
