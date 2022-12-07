import java.util.Scanner;

public class VolumeOfBox {

	void volume(int length, int width, int height) {
		float volume = length * width * height;
		System.out.println("Volume Of The Box is: " + volume);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Length of The Box");
		int l = sc.nextInt();
		System.out.println("Enter Width of The Box");
		int w = sc.nextInt();
		System.out.println("Enter Height of The Box");
		int h = sc.nextInt();

		VolumeOfBox box = new VolumeOfBox();

		box.volume(l, w, h);
		
		sc.close();
	}

}
