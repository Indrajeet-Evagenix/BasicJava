public class ConstructorUsingDefaultValuesMovie {

	int yearOfRelease;
	float profit;
	String movieName, acterName, producerName;

	// Default Constructor

	ConstructorUsingDefaultValuesMovie() {

	}

	// Simple Constructor Taking User Defined Inputs

	// ConstructorUsingDefaultValuesMovie() {
	// yearOfRelease = 2001;
	// profit = 5000f;
	// acterName = "Mr. James";
	// producerName = "Leonardo";
	// }

	void display() {
		System.out.println("Year Of Profit is: " + yearOfRelease + "\nProfit: "
				+ profit + "\nActer Name is: " + acterName
				+ "\nProducer Name is: " + producerName);
	}

	public static void main(String[] args) {
		ConstructorUsingDefaultValuesMovie titanic = new ConstructorUsingDefaultValuesMovie();
		titanic.display();

	}

}
