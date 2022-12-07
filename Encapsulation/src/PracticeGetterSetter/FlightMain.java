package PracticeGetterSetter;

public class FlightMain {

	public void showDetails(Flight values) {
		System.out.println("-----Passenger Details Given Below-----");
		System.out.println("Passenger id: " + values.getId() + ", Fligh Name: "
				+ values.getCompanyName() + "\nSource: " + values.getSource()
				+ ", Destination: " + values.getDestination());

		System.out.println("-----*****-----");
		if (values.getTicketRate() < 10000) {
			System.out.println("Your Ticket Booked in 'Economy-Class'");
		} else {
			System.out.println("Your Ticket Booked in 'Business-Class'");
		}

	}
	
	void ticket(){
		
	}

	public static void main(String[] args) {
		Flight fly = new Flight();

		fly.acceptDetails(101, "Indigo", "Mumbai", "Bagdogra", "Economy-Class",
				12000);

		FlightMain flym = new FlightMain();
		flym.showDetails(fly);

	}

}
