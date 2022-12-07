import java.util.Scanner;

public class BonusPfCalculator {

	float bonus(float salary, char ch) {
		float newSal;
		System.out.println("Original salary is: " + salary);
		if (ch == 'A') {
			newSal = salary + (salary * 0.15f);
		} else if (ch == 'B') {
			newSal = salary + (salary * 0.10f);
		} else if (ch == 'C') {
			newSal = salary + (salary * 0.05f);
		} else {
			newSal = salary;
		}
		System.out.println("Salary After Adding Bonus is: " + newSal);
		return newSal;
	}

	void pfCalculator(float salary) {
		float pf = salary * 0.10f;
		System.out.println("PF is: " + pf);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Salary");
		float salary = sc.nextFloat();
		System.out.println("Enter The Rating of The Employee(A/B/C/D): ");
		char r = sc.next().charAt(0);

		BonusPfCalculator bpc = new BonusPfCalculator();

		float newSal = bpc.bonus(salary, r);

		bpc.pfCalculator(newSal);
		
		sc.close();
	}

}
