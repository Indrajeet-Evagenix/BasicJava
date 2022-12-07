import java.util.Scanner;

public class Movie1 {

	int yearOfRelease;
	float profit;
	String movieName, acterName, producerName;

	Movie1(int year, String acName, String pcName, float prof) {

		this.yearOfRelease = year;
		this.acterName = acName;
		producerName = pcName;
		profit = prof;
	}

	public String toString() {
		return "\nYear Of Profit is: " + yearOfRelease + "\nProfit: " + profit
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
		System.out.println("Enter Movie Number");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println("\nEnter Year Of Release");
			int year = sc.nextInt();
			System.out.println("Enter Profit");
			float profit = sc.nextFloat();
			System.out.println("Enter Acter Name");
			String aName = sc.next();
			System.out.println("Enter Producer Name");
			String pName = sc.next();

			Movie1 pc = new Movie1(year, aName, pName, profit);
			System.out.println(pc);
//			pc.display();
//			 System.out.println(pc);
		}

		// pc.display();
		sc.close();
	}
}
