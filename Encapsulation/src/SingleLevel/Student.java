package SingleLevel;

public class Student {

	float percentage, college;

	void grade() {

		if (percentage >= 80) {
			System.out.println("'A' Grade");
		} else if (percentage >= 60) {
			System.out.println("'B' Grade");
		} else if (percentage >= 35) {
			System.out.println("'C' Grade");
		} else {
			System.out.println("Students Failed");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
