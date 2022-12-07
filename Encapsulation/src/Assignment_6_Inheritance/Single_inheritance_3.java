package Assignment_6_Inheritance;

class Employee {
	void salary() {
		System.out.println("Salary is: '60,000.00/-'");
	}
}

class Programmer extends Employee {
	void bonus() {
		System.out.println("Bonus is: '6000.00/-'");
	}
}

public class Single_inheritance_3 {

	public static void main(String[] args) {
		Programmer pm = new Programmer();
		pm.salary();
		pm.bonus();

	}

}
