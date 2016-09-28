// Event.java
public class Event {
  private int typeOfEvent;
  private double rate;
  private String manager;
  
  //constructor:
  public Event(int eType) {
    double[] rateSchedule = {0.00,          47.99,             75.99,             40.99};
    String[] managerList =  { "X", "Dustin Britt", "Carment Lindsey", "Robin Armanetti"};
    typeOfEvent = eType;
    if(eType > rateSchedule.length)
      eType = 0;
      
    rate    = rateSchedule[eType];
    manager = managerList[eType];
}
  
  // get methods:
  public int getType () {
    return typeOfEvent;
  }
  public double getRate() {
    return rate;
  }
  public String getManager() {
    return manager;
  }
  
  // set methods:
  public void setType(int eventType) {
    typeOfEvent = eventType;
  }
  public void setRate(double eventRate) {
    rate = eventRate;
  }
  public void setManager(String managerName) {
    manager = managerName;
  }
}