// To call a static method from a method within another class:
public class TestStatement {
	public static void main(String[] args) {

		System.out.println("Calling method from another class");
		System.out.println(" ");
		// Calling the statementOfPhilosop
		// to call a method from a static class you have to type in the class a dot and then the method: Seems pretty straigt forward. 
		SetUpSite.statementOfPhilosophy();

	}
}