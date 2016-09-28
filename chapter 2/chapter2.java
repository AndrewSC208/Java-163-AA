// this is the exerciste files for chapter 2


// import this to run the keyboard scanner

import javax.swing.JOptionPane;

public class chapter2 {

	public static void main(String[] args) {

		int selection;
		boolean isYes;
		selection = JOptionPane.showConfirmDialog(null, "Do you want to upgrade to first class?");
		isYes = (selection == JOptionPane.YES_OPTION);

		JOptionPane.showMessageDialog(null, "You responded " + isYes);

	}
}

