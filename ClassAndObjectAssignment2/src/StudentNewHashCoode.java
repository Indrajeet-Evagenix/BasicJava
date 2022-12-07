
public class StudentNewHashCoode {

	public static void main(String[] args) {
		StudentNewHashCoode st = new StudentNewHashCoode();
		StudentNewHashCoode st1 = new StudentNewHashCoode();

		System.out.println(st.hashCode());
		System.out.println(st1.hashCode());

		System.out.println(st);
		System.out.println(st1);

		// OR

		st1 = st;

		System.out.println(st);
		System.out.println(st1);

		System.out.println(st.hashCode());
		System.out.println(st1.hashCode());

	}

}
