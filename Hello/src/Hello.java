// Key of Basic java
// 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
interface OldMobile {
	void calling();

	void messaging();

	void fm();

	void ram();

	void calculator();

	void calender();

	void battery();
}

class NormalMobile {
	void keyPad() {
		System.out.println("Normal Mobile have KeyPad");
	}

	void dualSim() {
		System.out.println("Normal Mobile have Dual Sim");
	}
}

class SmartPhone extends NormalMobile implements OldMobile {

	void touchPad() {
		System.out.println("Smart Phone have Touch Pad");
	}

	void camera() {
		System.out.println("Smart Phone have Camera for Clicking Picture");
	}

	void videoRecording() {
		System.out.println("Smart Phone have Video Recording");
	}

	@Override
	public void calling() {
		System.out.println("Old Mobile have Calling Featrues");

	}

	@Override
	public void messaging() {
		System.out.println("Old Mobile have Calling Message");

	}

	@Override
	public void fm() {
		System.out.println("Old Mobile have FM");

	}

	@Override
	public void ram() {
		System.out.println("Old Mobile have RAM");

	}

	@Override
	public void calculator() {
		System.out.println("Old Mobile have Calculator");

	}

	@Override
	public void calender() {
		System.out.println("Old Mobile have Calender");

	}

	@Override
	public void battery() {
		System.out.println("Old Mobile have Removable Battery");

	}

}

public class Hello {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();

		sp.calling();
		sp.messaging();
		sp.fm();
		sp.ram();
		sp.calculator();
		sp.calender();

		sp.keyPad();
		sp.dualSim();

		sp.touchPad();
		sp.camera();
		sp.videoRecording();

	}

}
