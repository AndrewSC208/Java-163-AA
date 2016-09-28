// creating a class that contains instance fields and methods:
public class CompleteEventSite {
	// data type declarations:
	double hourlyFee;
	String siteName;

	// private variable declaration:
	private int siteNumber;

	// To add a constructor to the EventSite class:
	public CompleteEventSite() {
		siteNumber = 999;
		hourlyFee = 1.0;
		siteName = "Andrew";
	}

	// get and set methods for SiteNumber:
	public int getSiteNumber() {
		return siteNumber;
	}
	public void setSiteNumber(int n) {
		siteNumber = n;
	}

	// get and set methods for hourlyFee:
	public double getHourlyFee() {
		return hourlyFee;
	}
	public void setHourlyFee(double x) {
		hourlyFee = x; 
	}

	// get and set methods for siteName:
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String name) {
		siteName = name;
	}
}