import javax.swing.JOptionPane;

public class ch2 {

	public static void main(String[] args) {

		String wageString, dependentsString;
		double wage, weeklyPay;
		int dependents;
		final double HOURS_IN_WEEK = 37.5;

		// set the value of wageString with promt
		wageString = JOptionPane.showInputDialog(null, "Enter employee's hourly wage", "Salary dialog 1", JOptionPane.INFORMATION_MESSAGE);

		// Set the value of weeklyPay
		weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;

		// set the value of dependentsString
		dependentsString = JOptionPane.showInputDialog(null, "How many dependents?", "Salary dialog 2", JOptionPane.QUESTION_MESSAGE);

		// set the dependanrs value
		dependents = Integer.parseInt(dependentsString);

		// output 
		JOptionPane.showMessageDialog(null, "Weekly salary is $" + weeklyPay + "\nDeductions will be made for " + dependents + " dependents");
	}
}