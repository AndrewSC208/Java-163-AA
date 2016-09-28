// TestCompleteEventSite.java
// this is the test program of completeEventSite.java its actually pretty cool and I am pumped that I am starting to wrap my brain around this new programming theory. 
public class TestCompleteEventSite {
	public static void main(String[] args) {

		CompleteEventSite newSite = new CompleteEventSite();

		// print statement to test the construct on EventSite method:
		System.out.println("The name is " + newSite.getSiteName() + " the per hour cost is " + newSite.getHourlyFee() + " dollar's ");

		// okay now I want to change the value of different things in that methods object:

		newSite.setHourlyFee(25);

		System.out.println(newSite.getHourlyFee());
	}
}