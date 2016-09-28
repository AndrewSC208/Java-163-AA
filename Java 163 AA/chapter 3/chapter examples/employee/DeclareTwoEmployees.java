// -------------------------------
public class DeclareTwoEmployees {

	public static void main(String[] args) {
		// Declaring new employees:
		Employee clerk = new Employee();
		Employee driver = new Employee();

		// using setEmpNum from Employee class
		clerk.setEmpNum(345);
		driver.setEmpNum(567);

		// Print out all of the info.
		System.out.println("The clerk's number is " + clerk.getEmpNum() + " and the driver's number is " + driver.getEmpNum());
	}
}