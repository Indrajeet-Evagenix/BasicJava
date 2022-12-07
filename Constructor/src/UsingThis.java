import java.util.Scanner;

public class UsingThis {

	int yearOfRelease;
	float profit;
	String movieName, acterName, producerName;

	UsingThis(int yearOfRelease, String acterName, String producerName, float profit) {

		this.yearOfRelease = yearOfRelease;
		this.acterName = acterName;
		this.producerName = producerName;
		this.profit = profit;
	}

	void display() {
		System.out.println("Year Of Profit is: " + this.yearOfRelease + "\nProfit: " + profit + "\nActer Name is: "
				+ acterName + "\nProducer Name is: " + producerName);
	}

	public String toString() {
		return "Year Of Profit is: " + this.yearOfRelease + "\nProfit: " + this.profit + "\nActer Name is: "
				+ this.acterName + "\nProducer Name is: " + this.producerName;
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

		UsingThis ts = new UsingThis(year, aName, pName, profit);

		System.out.println(ts);
		// ts.display();

		sc.close();

	}

}
