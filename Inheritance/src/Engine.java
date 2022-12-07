public class Engine {

	int torque, cylinder;
	String rpm, company;

	/*
	 * Engine(String rpm, int torque, int cylinder, String company){ this.rpm=rpm;
	 * this.torque=torque; this.cylinder=cylinder; this.company=company; }
	 */

	public int getTorque() {
		return torque;
	}

	public void setTorque(int torque) {
		this.torque = torque;
	}

	public int getCylinder() {
		return cylinder;
	}

	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}

	public String getRpm() {
		return rpm;
	}

	public void setRpm(String rpm) {
		this.rpm = rpm;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String toString() {
		return "Company Name: " + company + ", Torque: " + torque + ", Cylinder: " + cylinder + ", RPM: " + rpm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
