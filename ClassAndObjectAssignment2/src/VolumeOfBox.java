import java.util.Scanner;

public class VolumeOfBox {
	int volumeOfBox, length, width, height;

	void acceptDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length Of The Box");
		length = sc.nextInt();
		System.out.println("Enter Width Of The Box");
		width = sc.nextInt();
		System.out.println("Enter Height Of The Box");
		height = sc.nextInt();

	}

	void volume() {

		volumeOfBox = length * width * height;

	}

	void display() {
		System.out.println("Volume Of The Box is: " + volumeOfBox);
	}

	public static void main(String[] args) {
		VolumeOfBox vb = new VolumeOfBox();

		vb.acceptDetails();
		vb.volume();
		vb.display();

	}

}
