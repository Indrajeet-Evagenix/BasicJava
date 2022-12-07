import java.util.Scanner;

public class PfSalary {

	void pfSalary(float salary) {
		float pf = (salary * 15) / 100;
		System.out
				.println("15% of The Given Salary '" + salary + "' is: " + pf);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Salary");
		float a = sc.nextFloat();

		PfSalary c1 = new PfSalary();

		c1.pfSalary(a);
		sc.close();
	}

}
