package PracticeWithGetterSetter;

public class Address {
	
	int srNumber, pinNumber;
	String societyName, cityName;

	public int getSrNumber() {
		return srNumber;
	}

	public void setSrNumber(int srNumber) {
		this.srNumber = srNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public String getSocietyName() {
		return societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String toString(){
		return srNumber + ", " + societyName
				+ ", " + cityName + ", " + pinNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
