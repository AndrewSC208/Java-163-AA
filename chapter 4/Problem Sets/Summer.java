// Summer.java

import java.util.*;

public class Summer {
	public static void main(String[] args) {

		// variables:
		int currentDayOfYear, daysTillSummer;
		final int FIRST_DAY_OF_SUMMER = 172;
		
		// setting new GregorianCalendar for today and the first day of the year:
		GregorianCalendar today = new GregorianCalendar();

		// Set day's:
		currentDayOfYear = today.get(GregorianCalendar.DAY_OF_YEAR);
		daysTillSummer = FIRST_DAY_OF_SUMMER - currentDayOfYear;

		System.out.println("We have " + daysTillSummer + " day's until summer!");
		
	}
}