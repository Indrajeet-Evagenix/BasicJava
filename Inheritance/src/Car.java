public class Car {

	int id, price;
	String name, color;
	Engine e;

	/*
	 * Car(int id, String name, int price, String color, Engine e) { this.id = id;
	 * this.name=name; this.price =price; this.color=color; this.e=e;
	 * 
	 * }
	 */

	public String toString() {
		return "Car id: " + id + ", " + name + ", " + price + ", " + color + "\n" + e;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	public static void main(String[] args) {

	}

}
