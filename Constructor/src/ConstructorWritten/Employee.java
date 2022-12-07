package ConstructorWritten;


public class Employee {
	
	private int empId;
	private String empName;
	private float salary;
	
	public int getEmpId(){
		return empId;
	}
	
	public void setEmpId(int id){
		empId=id;
	}
	
	public String getEmpName(){
		return empName;
	}
	
	public void setEmpName(String name){
		empName=name;
	}
	
	public float getSalary(){
		return salary;
	}
	
	public void setSalary(float sal){
		salary=sal;
	}
	
	void acceptDetails(int id, String name, float sal){
		empId=id;
		empName=name;
		salary=sal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
