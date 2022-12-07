import java.util.Scanner;

public class ParameterisedConstructor {

	int yearOfRelease;
	float profit;
	String movieName, acterName, producerName;

	ParameterisedConstructor(int year, String acName, String pcName, float prof) {

		yearOfRelease = year;
		acterName = acName;
		producerName = pcName;
		profit = prof;
	}

	public String toString() {
		return "Year Of Profit is: " + yearOfRelease + "\nProfit: " + profit
				+ "\nActer Name is: " + acterName + "\nProducer Name is: "
				+ producerName;
	}

	void display() {
		System.out.println("Year Of Profit is: " + yearOfRelease + "\nProfit: "
				+ profit + "\nActer Name is: " + acterName
				+ "\nProducer Name is: " + producerName);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Deatils Of The Movie");
		System.out.println("Enter Year Of Release");
		int year = sc.nextInt();
		System.out.println("Enter Profit");
		float profit = sc.nextFloat();
		System.out.println("Enter Acter Name");
		String aName = sc.next();
		System.out.println("Enter Producer Name");
		String pName = sc.next();

		ParameterisedConstructor pc = new ParameterisedConstructor(year, aName,
				pName, profit);

		System.out.println(pc);
		// pc.display();
		sc.close();
	}
}
