public class Library {

	private int numberOfBooks;
	private String libraryIncharge;

	public int getNumberOfBooks() {
		return numberOfBooks;
	}

	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}

	public String getLibraryIncharge() {
		return libraryIncharge;
	}

	public void setLibraryIncharge(String libraryIncharge) {
		this.libraryIncharge = libraryIncharge;
	}

	public String toString() {
		System.out.println("----Library Information-----");
		return "Number of Books: " + numberOfBooks + ", Library Incharge: "
				+ libraryIncharge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
