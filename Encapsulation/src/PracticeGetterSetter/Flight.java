package PracticeGetterSetter;

public class Flight {

	private int id;
	private String companyName, source, destination, classOfFlight;
	private float ticketRate;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSource() {
		return source;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDestination() {
		return destination;
	}

	public void setClassOfFlight(String classOfFlight) {
		this.classOfFlight = classOfFlight;
	}

	public String getClassOfFlight() {
		return classOfFlight;
	}
	
	public void setTicketRate(float ticketRate) {
		this.ticketRate = ticketRate;
	}

	public float getTicketRate() {
		return ticketRate;
	}

	public void acceptDetails(int id, String companyName, String source,
			String destination, String classOfFlight, float ticketRate) {
		this.id = id;
		this.companyName = companyName;
		this.source = source;
		this.destination = destination;
		this.classOfFlight = classOfFlight;
		this.ticketRate = ticketRate;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
