// creates class named TestConstructor:
public class TestConstructor {
	// creates main class 
	public static void main(String[] args) {

		// Creates new EventSite with the name of oneSite that is located in EventSite.java
		EventSite oneSite = new EventSite();

		// uses oneSite getSiteNumber() method from EventSite.java
		System.out.println("site number " + oneSite.getSiteNumber());
	}
}