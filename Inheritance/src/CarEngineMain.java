
public class CarEngineMain {

	public static void main(String[] args) {
		
		// By using ParameteriZed Constructor 
		/*Engine e1=new Engine("100-RPM",89,4,"Tata");
		
		Car c1=new Car(1234,"Zest",950000,"White",e1);
		
		System.out.println(c1);*/
		
		
		// By Using Setter And Getter Method
		Engine e1=new Engine();
		e1.setRpm("1000-Rpm");
		e1.setCylinder(4);
		e1.setTorque(89);
		e1.setCompany("Tata");
		
		Car c1= new Car();
		c1.setColor("White");
		c1.setId(12);
		c1.setName("Zest");
		c1.setPrice(950000);
		c1.setE(e1);
		
		/*System.out.println(e1.getCompany());
		System.out.println(e1.cylinder);
		System.out.println(e1.getRpm());
		System.out.println(e1.getCylinder());*/
		
		System.out.println(c1.getE());
		/*System.out.println(c1.getE().company);
		System.out.println(c1.getE().cylinder);
		System.out.println(c1.getE().rpm);
		System.out.println(c1.getE().torque);
*/		
		

	}

}
