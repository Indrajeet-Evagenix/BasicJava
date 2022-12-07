package AssignmentOnContainment;

public class MyDateUsingConstructor {
	int day, month, year;

	MyDateUsingConstructor(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String toString() {
		return "MyDate is: " + day + "/" + month + "/" + year;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
