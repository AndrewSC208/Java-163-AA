public class CompleteEventSite {

	// variable declaration:
	private int siteNumber;
	// declaration variables for  
	private double hourlyFee;
	private String venuName;


	
	public CompeteEventSite() {
		siteNumber = 999;
	}

	//----------------------------- get and set Method start
	// this is the get Site Number method: The reason for doing all of this is to encapsulate all of the information: 
	public int getSiteNumber() {
		return siteNumber;
	}
	// This will use the set method for SiteNumber so that I can set the value of siteNumber to whatever I pass through n. This must be an int and nothing else.  
	public void setSiteNumber(int n) {
		siteNumber = n;
	}
	
	//----------------------------- get and set Method start
	// this the getHourlyFee() method that returns the value of hourlyFee double.
	public double getHourlyFee() {
		return hourlyFee;
	}
	// this is the set HourlyFee method that will name takes a double and assigns it to x and then x is set equal to hourlyFee. The setHourlyFee() is the method and the double that is used is hourlyFee
	public double setHourlyFee(double x) {
		hourlyFee = x; 
	}

	//---------------------------- get and set Method start
	public String getVenuName() {
		return venuName;
	}
	// this is the set VenuName method that will take a string and pass it to y and then assign y to venuName:
	public String setVenuName(String y) {
		venuName = y;
	}
}