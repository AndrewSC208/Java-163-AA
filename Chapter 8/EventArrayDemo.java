// Creating an Application with an Array of Objects:
public class EventArrayDemo {
  public static void main(String[] args) {
    
    // Declare and array of five event objects, and variables:
    Event[] someEvents = new Event[5];
    int x;
    
    // for loop that calls the Event Construct five times, making each event type 1:
    for(x = 0; x < someEvents.length; ++x) {
      someEvents[x] = new Event(1);
    }
    
    for(x = 0; x < someEvents.length; ++x) {
      System.out.println(someEvents[x].getType() + " " + someEvents[x].getRate() + " " + someEvents[x].getManager());
    } 
       
  }
}