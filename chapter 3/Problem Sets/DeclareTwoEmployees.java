
public class DeclareTwoEmployees { 
	// this is the main class:

	public static void main(String[] args) {
		// varaible declarations:
		int funTimes;

		// math 
		funTimes = 27 * 43;

		// object creation:
		Employee clerk = new Employee();
		Employee driver = new Employee();
		Employee coolGuy = new Employee();
		Employee times = new Employee();
		Employee practice = new Employee();

		// object instiantions
		clerk.setEmpNum(345);
		driver.setEmpNum(567);
		coolGuy.setEmpNum(456);
		times.setEmpNum(funTimes);
		practice.setEmpNum(567);
 	
 		// Print statements:
		System.out.println("The clerk's number is " + clerk.getEmpNum() + " and the driver's number is " + driver.getEmpNum());
		System.out.println("This is the coolGuy varaible " + coolGuy.getEmpNum());
		System.out.println(times.getEmpNum());
		System.out.println(practice.getEmpNum());
		
	} // end of main class

} // end of DeclaraTwoEmployees()