
//-------------------- DeclareTwoEmployees.java pulls this class into it and uses the method. Interesting. 
public class Employee {

	// Private data fields:
	private int empNum;
	private String empLastName;
	private String empFirstName;
	private double empSalary;
	

	// Public get and set methods for EmpNum:
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int emp) {
		empNum = emp;
	}

	// Public get and set methods for EmpLastName:
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String name) {
		empLastName = name;
	}

	// Public get and set methods for EmpFirstName:
	public void getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFistName(String name) {
		empFirstName = name;
	}

	// Public get and set methods for EmpSalary
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double sal) {
		empSalary = sal;
	}

} // end of Employee class.

