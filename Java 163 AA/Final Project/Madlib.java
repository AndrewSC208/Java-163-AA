/* Filename Madlib.java */
/* Written by Andrew Meiling */
/* Written on May 3rd, 2014 */
/* Final Project */
/* Game Zone exercise #14 */
/* Pg 102 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */
/* MEID AND2182148 */

import javax.swing.*;

public class Madlib 
{
	public static void main(String[] args)
	{
		// variables:
		String place, adj, verbing, famous, friend, verb, instrument, room;
		int YES_NO_OPTION = 0;
		int num = 1;
		
		do
		{
			place = JOptionPane.showInputDialog(null, "Please enter a place.");
			adj = JOptionPane.showInputDialog(null, "Please enter a adjective.");
			verbing = JOptionPane.showInputDialog(null, "Please enter a verb ending in -ing.");
			famous = JOptionPane.showInputDialog(null, "Please enter a famous person.");
			friend = JOptionPane.showInputDialog(null, "Please enter a friend's name.");
			verb = JOptionPane.showInputDialog(null, "Please enter a present tense verb.");
			instrument = JOptionPane.showInputDialog(null, "Please enter a musical instrument");
			room = JOptionPane.showInputDialog(null, "Please enter a room.");
			// Print out the madlib:
			System.out.println("I fell asleep yesterday listening to an old album that my mom had. I really enjoyed it, though I had a weird dream. It was kind of like one of the old songs.");
			System.out.println("I've been workin' in " + place + "," + " All the " + adj + " day.");
			System.out.println("Just to pass the time away.");
			System.out.println("Don't you hear the whistle " + verbing + "?");
			System.out.println("Rise up so early in the horn. ");
			System.out.println("Don't you hear " + famous + "shouting " + friend + ", " + verbing + " your horn?");
			System.out.println(friend + ", won't you, " + verb + ",");
			System.out.println(friend + ", won't you, " + verb + ",");
			System.out.println(friend + ", won't you, " + verb + " your horn?");
			System.out.println(friend + ", won't you, " + verb + ",");
			System.out.println(friend + ", won't you, " + verb + ",");
			System.out.println(friend + ", won't you, " + verb + " your horn?");
			System.out.println("Someone's in the " + room + " with " + friend + ".");
			System.out.println("Someone's in the " + room + ", I know.");
			System.out.println("Someone's in the " + room + " with " + friend + ".");
			System.out.println("Strumming on the old " + instrument + ".");
			System.out.println("It was the weirdest dream I've had in a long time!");

			num = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "No",JOptionPane.YES_NO_OPTION);

		} while(num == 0); 

	}
}