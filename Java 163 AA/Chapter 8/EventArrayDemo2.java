// Creating and interactrive application that create an array of objects
import javax.swing.*;
public class EventArrayDemo2 {
  public static void main(String[] args) {
    // Variables and arrays:
    String[] eventTypes = {"", "Private", "Corporate", "Non-profit"};
    String choicesString = "";
    String strSelectedEvent;
    int selectedEvent;
    Event[] someEvents = new Event[5];
    int x;
    
    // Adda for loop that builds the String to be used as part of the prompt for the user:
    for(x = 1; x < eventTypes.length; ++x) {
      choicesString = choicesString + "\n" + x + " " + eventTypes[x];
    }
    
    // The next for loop executes one time for each Event object that is instantiated. It prompts the user, converts the user's choice to an integer, forces the hcoice to 0 if it is invalid, and finally created the object:
    for(x = 0; x < someEvents.length; ++x) {
      strSelectedEvent = JOptionPane.showInputDialog(null, "Event #" + (x + 1) + " Enter the number for the type of event you want" + choicesString);
      selectedEvent = Integer.parseInt(strSelectedEvent);
      if(selectedEvent < 1 || selectedEvent > 3) {
        selectedEvent = 0;
      }
      someEvents[x] = new Event(selectedEvent);
    }
    
   // The last for loop lists the details of each created Event:
    for(x = 0; x < someEvents.length; ++x) {
      System.out.println(someEvents[x].getType() + " " + eventTypes[someEvents[x].getType()] + " " + someEvents[x].getRate() + " " + someEvents[x].getManager());
    }
    
    
  }
}