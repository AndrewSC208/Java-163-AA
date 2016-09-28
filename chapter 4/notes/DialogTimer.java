// Creating an interactive application with a timer:
import javax.swing.JOptionPane;
import java.util.*;
public class DialogTimer {
	public static void main(String[] args) {
		// variables:
		int time1, time2, milli1, milli2, sec1, sec2, timeDifference;
		final int MILLISECS_IN_SECOND = 1000;

		// set original time:
		GregorianCalendar before = new GregorianCalendar();
		milli1 = before.get(GregorianCalendar.MILLISECOND);
		sec1 = before.get(GregorianCalendar.SECOND);
		time1 = MILLISECS_IN_SECOND * sec1 + milli1;

		// ask question to time:
		JOptionPane.showConfirmDialog(null, "Is stealing ever justified? ");

		//second time to find out how long it took to answer question:
		GregorianCalendar after = new GregorianCalendar();
		milli2 = after.get(GregorianCalendar.MILLISECOND);
		sec2 = after.get(GregorianCalendar.SECOND);
		time2 = MILLISECS_IN_SECOND * sec2 * milli2;

		// compute the difference between times:
		timeDifference = time2 - time1;
		JOptionPane.showMessageDialog(null, "It took " + timeDifference + " milliseconds for you to answer.");
	}
}