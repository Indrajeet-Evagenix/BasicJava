import java.util.Scanner;

public class CountryNationalgame {

	void countryName(String newGame) {
		switch (newGame) {

		case "India":
			System.out.println("Natinal newGame Of '" + newGame + "' is: 'Hockey'");
			break;

		case "China":
			System.out.println("Natinal newGame Of '" + newGame + "' is: 'Tennis'");
			break;
		case "Bangladesh":
			System.out.println("Natinal newGame Of '" + newGame + "' is: 'Kabaddi'");
			break;
		case "Italy":
			System.out.println("Natinal newGame Of '" + newGame + "' is: 'Football'");
			break;
		case "United States":
			System.out.println("Natinal newGame Of '" + newGame + "' is: 'Baseball'");
			break;
		default:
			System.out.println("Enter Valid Country Name");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Country Name");
		String cName = sc.nextLine();
		// String newName = cName.toLowerCase();

		CountryNationalgame cng = new CountryNationalgame();

		cng.countryName(cName);

		sc.close();
	}

}
