//MenuSearch.java
import java.util.*;
import javax.swing.*;
public class MenuSearch
{
	public static void main(String[]args)
	{
		String[] menuChoices = new String[10];
		String entry = "", menuString = "";
		int x = 0;
		int numEntered;
		int highestSub = menuChoices.length - 1;

		// Use the Array.fill() method to fill with "zzzz". You do this so later when you are searching something it will return a value.
		Arrays.fill(menuChoices, "zzzzzz");

		// get info from the user:
		menuChoices[x] = JOptionPane.showInputDialog(null, "Enter an item for today's menu, or zzz to quit:");
		while(!menuChoices[x].equals("zzz") && x < highestSub)
		{
			menuString = menuString + menuChoices[x] + "\n";
			++x;
			if(x < highestSub)
				menuChoices[x] = JOptionPane.showInputDialog(null, "Enter an item for today's menu, or zzz to quit");
		}
		numEntered = x;

		entry = JOptionPane.showInputDialog(null, "Today's menu is:\n" + menuString + "Please make a selection:");
		Arrays.sort(menuChoices, 0, numEntered);
		x = Arrays.binarySearch(menuChoices, entry);
		if(x >= 0 && x < numEntered)
			JOptionPane.showMessageDialog(null, "Excellent choice");
		else
			JOptionPane.showMessageDialog(null, "Sorry _ that item is not on tonight's menu");
	}
}