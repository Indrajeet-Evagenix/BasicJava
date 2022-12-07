import java.util.Scanner;

//import java.util.Scanner;

// create a shopping class which contain purchase item name, price of four item and quantity
// create a first method to accept details for shopping
// second method to calculate the bill
// create a third method to display shopping details with bill

public class ShoppingDetails {

	String itemName;
	int priceForItem;
	int quantity;
	float totalBill;

	void acceptDetails(String sName, int price, int qnt) {
		itemName = sName;
		priceForItem = price;
		quantity = qnt;
	}

	void calculateBill() {

		totalBill = priceForItem * quantity;
	}

	void displayShoppingBill() {
		if (quantity > 0) {

			System.out.println("Item Name is: " + itemName + "\nPrice of an Item: " + priceForItem + "\nQuantity: "
					+ quantity + "\nTotal Bill For an Item is: " + totalBill);
		} else {
			System.out.println("Please Entered Quantity of an Item\n");
		}

	}

	public static void main(String[] args) {

		int bottalPrice = 150, deoPrice = 170, watchPrice = 300, booksPrice = 250, quantity;
		Scanner sc = new Scanner(System.in);
		System.out.println("************Welcome To Shoping Center************");
		System.out.println("Enter Item Name Ex. (Bottal, Deo, Watch, Books)");
		String itemName = sc.nextLine();
//		String itemName=name.toLowerCase();

		char ch = 'y';
		int abc = 0;

		ShoppingDetails s = new ShoppingDetails();
		do {
			switch (itemName) {
			case "Bottal":
				System.out.println("Enter Quantity of an Item");
				quantity = sc.nextInt();
				s.acceptDetails(itemName, bottalPrice, quantity);
				s.calculateBill();
				s.displayShoppingBill();
				if (quantity > 0) {
					System.out.println("**********Thank You.***********\n**********Visit Again.***********");
				}
				break;
			case "Deo":
				System.out.println("Enter Quantity of an Item");
				quantity = sc.nextInt();
				s.acceptDetails(itemName, deoPrice, quantity);
				s.calculateBill();
				s.displayShoppingBill();
				if (quantity > 0) {
					System.out.println("**********Thank You.***********\n**********Visit Again.***********");
				}
				break;
			case "Watch":
				System.out.println("Enter Quantity of an Item");
				quantity = sc.nextInt();
				s.acceptDetails(itemName, watchPrice, quantity);
				s.calculateBill();
				s.displayShoppingBill();
				if (quantity > 0) {
					System.out.println("**********Thank You.***********\n**********Visit Again.***********");
				}
				break;
			case "Books":
				System.out.println("Enter Quantity of an Item");
				quantity = sc.nextInt();
				s.acceptDetails(itemName, booksPrice, quantity);
				s.calculateBill();
				s.displayShoppingBill();
				if (quantity > 0) {
					System.out.println("**********Thank You.***********\n**********Visit Again.***********");
				}
				break;
			default:
				System.out.println("Please Entered Item Name Correctly");

			}
			if (abc != 1) {
				System.out.println("Do You Want to Add More Quantity ??: Press 'Y/N'");
				ch = sc.next().charAt(0);
			}
		} while (ch == 'Y' || ch == 'y');

		// System.out.println("Enter Quantity of an Item");
		// int quantity = sc.nextInt();
		// s.acceptDetails(itemName, bottalPrice, quantity);
		// s.calculateBill();
		// s.displayShoppingBill();

		sc.close();
	}

}
