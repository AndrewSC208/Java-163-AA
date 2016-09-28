// Employee class:
public class Employee {

	private int empNum;
	private String empLastName;
	private String empFirstName;
	private double empSalary;

	// methods go here:

	// get method:
	public int getEmpNum() {
		return empNum;
	}
	// set method:
	public void setEmpNum(int emp) {
		empNum = emp;
	}

	// get and set methods for empLastName();
	public String getEmpLastName() {
		return empLastName;
	}
	public void String setEmpLastName(String name) {
		// this is an assignment statement that empFirstName will be set equal to name that is passed throught the method: 
		empLastName = name;
	}
	// get and set methods for empFirstName():
	public String getFirstName() {
		return empFirstName;
	}
	// this is the setFirstName() method: 
	public void String setFirstName(String name) {
		empFirstName = name;
	}
	// get and set empSalary methods():
	public double getEmpSalary() {
		return empSalary;
	}
	// set empSalary method:
	public void double setEmpSalary(double sal) {
		empSalary = sal;
	}
	// end of get and set methods. 

}