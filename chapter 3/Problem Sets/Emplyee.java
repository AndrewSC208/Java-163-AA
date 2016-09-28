// Employee class:
public class Employee {
	// let declare a private varaible that only this class can see. 
	// this will encapsilate this data and then it will be safe form harmful programms that might try and steal date. 
	private int empNum;

	// this is the get method that we are creating for the EmpNum method(): 
	public int getEmpNum() {
		return empNum;
	} // end of getEmpNum
	// this is the set method that we are creating for the EmpNum method():
	public void setEmpNum(int emp) {
		empNum = emp;
	} // end of setEmpNum
}