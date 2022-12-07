import java.util.Scanner;

public class MenuDrivenUsingDoWhile {

	public static void main(String[] args) {
		int num, quentity, priceForAlooParatha = 25, priceForGobhiParatha = 30, priceForMixParatha = 30,
				priceForPaneerParatha = 45, priceForMethiParatha = 50, priceForOnionParatha = 40,
				priceForPlainParatha = 20, priceForSakkarParatha = 20;
		char ch;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("************Welcome To Kinara-Dhaba************");
			System.out.println("********BREAKFAST********");
			System.out.println(" 1. Aloo Paratha With Butter	25/-\n 2. Gobhi Paratha With Butter	30/-\n "
					+ "3. Mix Paratha With Butter	30/-\n 4. Paneer paratha With Butter	45/-\n "
					+ "5. Methi Paratha With Butter	50/-\n 6. Onion Paratha With Butter	40/-\n "
					+ "7. Plain Paratha With Butter	20/-\n 8. Sakkar Paratha With Butter	20/-\n ");
			System.out.println("Please Select the Menu And Enter the Number! What You Want to Eat ?");
			num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("Enter The Quentity of Aloo Paratha With Butter");
				quentity = sc.nextInt();
				priceForAlooParatha = priceForAlooParatha * quentity;
				System.out.println("The total Price of '" + quentity + "' Aloo Paratha With Butter is: "
						+ priceForAlooParatha + "/-");
				System.out.println("**********Thank You.***********\n**********Visit Again.***********");
				break;
			case 2:
				System.out.println("Enter The Quentity of Gobhi Paratha With Butter");
				quentity = sc.nextInt();
				priceForGobhiParatha = priceForGobhiParatha * quentity;
				System.out.println("The total Price of '" + quentity + "' Gobhi Paratha With Butter is: "
						+ priceForGobhiParatha + "/-");
				System.out.println("**********Thank You.***********\n**********Visit Again.***********");
				break;
			case 3:
				System.out.println("Enter The Quentity of Mix Paratha With Butter");
				quentity = sc.nextInt();
				priceForMixParatha = priceForMixParatha * quentity;
				System.out.println("The total Price of '" + quentity + "' Mix Paratha With Butter is: "
						+ priceForMixParatha + "/-");
				System.out.println("**********Thank You.***********\n**********Visit Again.***********");
				break;
			case 4:
				System.out.println("Enter The Quentity of Paneer Paratha With Butter");
				quentity = sc.nextInt();
				priceForPaneerParatha = priceForPaneerParatha * quentity;
				System.out.println("The total Price of '" + quentity + "' Paneer Paratha With Butter is: "
						+ priceForPaneerParatha + "/-");
				System.out.println("**********Thank You.***********\n**********Visit Again.***********");
				break;
			case 5:
				System.out.println("Enter The Quentity of Methi Paratha With Butter");
				quentity = sc.nextInt();
				priceForMethiParatha = priceForMethiParatha * quentity;
				System.out.println("The total Price of '" + quentity + "' Methi Paratha With Butter is: "
						+ priceForMethiParatha + "/-");
				System.out.println("**********Thank You.***********\n**********Visit Again.***********");
				break;
			case 6:
				System.out.println("Enter The Quentity of Onion Paratha With Butter");
				quentity = sc.nextInt();
				priceForOnionParatha = priceForOnionParatha * quentity;
				System.out.println("The total Price of '" + quentity + "' Onion Paratha With Butter is: "
						+ priceForOnionParatha + "/-");
				System.out.println("**********Thank You.***********\n**********Visit Again.***********");
				break;
			case 7:
				System.out.println("Enter The Quentity of Plain Paratha With Butter");
				quentity = sc.nextInt();
				priceForPlainParatha = priceForPlainParatha * quentity;
				System.out.println("The total Price of '" + quentity + "' Plain Paratha With Butter is: "
						+ priceForPlainParatha + "/-");
				System.out.println("**********Thank You.***********\n**********Visit Again.***********");
				break;
			case 8:
				System.out.println("Enter The Quentity of Sakkar Paratha With Butter");
				quentity = sc.nextInt();
				priceForSakkarParatha = priceForSakkarParatha * quentity;
				System.out.println("The total Price '" + quentity + "' of Sakkar Paratha With Butter is: "
						+ priceForSakkarParatha + "/-");
				System.out.println("**********Thank You.***********\n**********Visit Again.***********");
				break;
			default:
				System.out.println("Please Choose Given Menu Options");
			}
			System.out.println("Do You Want to Continue Your Order ??: Press 'Y/N'");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
		sc.close();

	}
}
