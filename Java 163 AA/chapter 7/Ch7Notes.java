// These are chapter 7 notes:
// Characters, Strings, and the StirngBuilder:
public static class Ch7Notes {
  public static void main(String[] args) {
    // This is the main class
  }
}

// Understanding String Data Problems:
  // Manipulating characters and groups of characters provides some challengers for the beginning java programmer:
  
  import java.util.Scanner;
  public class TryToCompareStrings {
    public static void main(String[] args) {
      String aName = "Carmen";
      String anotherName;
      Scanner input = new Scanner(System.in);
      
      // Get anotherName from user:
      System.out.println("Enter your name >");
      anotherName = input.nextLine();
      
      // Compare aName and anotherName
      if(aName == anotherName) {
        System.out.println(aName + " equals " + anotherName);
      } else {
        System.out.println(aName + " does not equal " + anotherName);
      }
      
      
    }
  }
  
// >> This will always output "Carmen does not equal Carmen."

  // The problem stems from the fact that in Java String is a class, and each created String is a class object.
  // As an object, a String variable name is not a simple data type-it is a reference; that is, a variable that holds a memory address.
    // Therefore, when you compare two Strings using the == operator, you are not comparing their values, but their computer memory locations.
    
  // To compare the contents of the memory locations use this:
    Character // A class whose instances can hold a single character value. This class also defines methods that can manipulate or inspect single-character data.
    String // A class for working with fixed-string data--that is, unchanging data compased of multipe characters.
    StringBuilder /* and */ StringBuffer // Classes for soring and manipulating changeable data composed of multiple characters.
    
// MANIPULATING CHARACTERS:
  // The character class contains stadard methods for testing the values of character. Table 7-1 page 304.
    // Methods that begin with "is", such as isUpperCase(), return a boolean value that can be used in comparison statements;
    
    // METHOD:                DESCRIPTION:
       isUpperCase()          // tests if character is uppercase
       toUpperCase()          // Returns the uppercase equivalent of the argument; no change is made it the argument is not a lowercase letter.
       
       isLowerCase()          // Testes if character is lowercase.
       toLowerCase()          // Returns the lowercase equivalent of the argument; no change is made if the argument is not an uppercase letter.
       
       isDigit()              // returns true if the argument is a digit (0-9) and false if otherwise
       
       isLetter()             // Returns true if the argument is a letter and false otherwise.
       
       isLetterOrDigit()      // Returns if the argument is a letter or digit and false otherwise.
       
       isWhitespace()         // Returns true if the argument is whitespace and false otherwise; this includes the space, tab, newline, carriage                                  return, and form feed.
       
// Character class is defines in java.lang and is automatically imported into every program you write.

import java.util.Scanner;

public class TestCharacter {
  
  public static void main(String[] args) {
    // Variables:
    char aChar;
    String aString;
    
    // Create scanner:
    Scanner keyboard = new Scanner(System.in);
    
    // Get char from user:
    System.out.prin("Enter a character... ");
    aString = keyboard.nextline();
    aChar = aString.charAt(0);
    System.out.println("The character is " + aChar);
    
    // is aChar uppercase:
    if(Character.inUpperCase(aChar)) {
      System.out.println(aChar + " is uppercase");
    } else {
      System.out.println(aChar + " is not uppercase");
    }
    
    // is aChar lowercase:
    if(Character.isLowerCase(aChar)) {
      System.out.println(aChar + " is lowercase");
    } else {
      System.out.println(aChar + " is not lowercase");
    }
    
    //Change aChar to lowercase:
    aChar = Character.toLowerCase(aChar);
    System.out.println("After toLowerCase(), aChar is " + aChar);
    //Change aChar to uppercase:
    aChar = Character.toUpperCase(aChar);
    System.out.println("After toUpperCase(), aChar is " + aChar);
    
    // find out if aChar is a letter or a digit:
    if(Character.isLetterOrDigit(aChar)) {
      System.out.println(aChar + " is a letter or digit");
    } else {
      System.out.println(aChar + " is neither a letter nor a digit.");
    }
    
    // find out if aChar is whitespace:
    if(Character.isWhitespace(aChar)) {
      System.out.println(aChar + " is whitespace");
    } else {
      System.out.println(aChar + " is not whitespace");
    }
  }
}

// DECLARING AND COMPARING STRING OBJECTS:
  // A literal string is an unnamed object, or anonymous object, of the string class, and a string variable is simply a named object of the      same class.
  // when you declare a String, object, the String itself--that is, the series of characters contained in the String-- is diestinct from the     identifier you use to refer to it. You can create an object of any other type. For example, the following statement defines an objext name     aGreeting, declares it to be of type String, and assigns an initial value of "Hello" to the String.
  
    String aGreeting = new String("Hello");
    
    // The variable aGreeting stores a referance to a string- object it keeps track of where the String object is stored in memory.
    
    // Since the string object is so populare you can create a string by just writting:
    String aGretting = "Hello"
    
    // COMPARING STRING VALUES:
      //In java, String is a class, and each created String is a class. A String variable name is a referecne; that is, a String variable name       refers to a location in memory, rather than to a particular value.
      // Strings and other objects that can't be changed are immutable.
      
      equals() // Is a methods for comparing two strings.
      
    
  // example:
  
  import java.util.Scanner;
  public class CompareStrings {
    public static void main(String[] args) {
      
      String aName = "Carmen";
      String anotherName;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter your name > ");
      anotherName = input.nextln();
      
      if(aName.equals(anotherName)) {
        System.out.println(aName + " equals " + anotherName);
      } else {
        System.out.print(aName + " dose not equal " + anotherName);
      }
    }
  }
  
  
  equalsIgnoreCase() // Is similar to the equals() method but ignors the case of the parameter that is passed.
  compareTo()        // returns a 0 if you are comparing a two strings with the same memory address. It will pump out a negative number or a positive number                         based on the uni code value of the strings.
  
  // Using Other String Methods:
    toUpperCase() /* and */ toLowerCase() // convert any string to it uppercase or lowercase equivalent.
    length() // returns the length of a String.
      // example:
        String gretting = "Hello";
        int len = greeting.length();
        
    indexOf() // determins whether a specific character occurs within a String.
                  // this will return -1 if the char is not in the string.
                  // the count starts at 0 like all of the other things in java do.
                    // example
                      myName = "Stacy";
                      myName.indexOf('S'); // returns 0
                      myName.indexOf('a'); // returns 2
                      myName.indexOf('q'); // returns -1 because the char is not in the string.
    charAt()  // requires an integer argument that indicates the position of the charaxter that the method returns.
                    // example:
                      myName = "Stacy";
                      myName.charAt(0); // returns 'S'
                      myName.charAt(1); // returns 't'
    endsWith() /* and */ startsWith() // each take a string argument and return true and false if a string object does or dose not end or start with the specidied argument.
                    // example:
                      myName = "Stacy";
                      myName.startsWith("Sta"); // returns true
                      myName.endsWith("z");     // returns false
    replace() // allows you to replace all occurances of some character within a String.
                    // example:
                      String yourName = "Annette";
                      String goofyName = yourName.replace('n', 'X'); // this assigns "Axxette" to goofyName.
    toString() // This method converts any object to a string:
                    // example:
                      theString, someInt = 4;
                      String theString;
                      int someInt = 4;
                      theString = Integer.toString(someInt);
                      
    substring() // takes two integer argument - a start position and end posistion that are both based on the fact that a String's first position is 0.
    
    // Example:
    import javax.swing*
    public class BusinessLetter {
      public static void main(String [] args) {
        String name;
        String firstName = "";
        String familyName = "";
        int x;
        char c;
        name = JOptionPane.showInputDialog(null, "Please enter customer's first and last name");
        x = 0;
        while(x <name.length()) {
          
          if(name.charAt(x) == ' ') {
            firstName = name.substring(0,x);
            familyName = name.substring(x + 1, name.length();
            x = name.length();
          }
          ++x;
        }
        JOptionPane.ShowMessageDialog(null, ",\nI am so glad we are on a first name basis" + "\nbecause I would like the opportunity to" + "\ntalk to you about an affordable insurance" + "\nprotection plan for the entire " + familyName + "\nfamily. Call A-One Family Insurance today" + "\n 1-800-555-9287.");
      }
    }
    
// Converting Strings to Numbers:
  // to convert a string to an integer, you use the integer class, which is part of java.lang and is automatically imported into programs you write.
    // the integer class is an example of a wrapper. A Wrapper is a class or object that is "wrapped around" a simple element;
    parseInt() // wraps a String containing all numbers and will parse all of the numbes out.
      // example:
        int anInt = Integer.parseInt("649"); // stores a 649 as an int in anInt.
        
    // Example: Converting String to Integer:
    import javax.swing.JOptionPane;
    public class ConvertStringToInteger {
      public static void main(String[] args) {
        String stringHours;
        int hours;
        Integer integerHours;
        final double PAY_RATE = 12.25;
        stringHours = JOptionPane.showInputDialog(null, "How many hours did you work this week?");
        integerHours = Integer.valueOf(stringHours);
        hours = inegerHOurs.intValue();
        JOptionPane.shoeMessageDialog(null, "you worked " + hours + " hours at $" PAY_RATE + " per hours" + "\nThat's $" + (hours * PAY_RATE));
      }
    }
    
    // You can also convert a String object to a double value. You must use the Double class.
      parseDouble() // Takes a string argument and returns its double value. much like the parseInt() method.
      
  // Learning about the StringBuilder and StringBuffer Classes:
    // In java, the value of a String is fixed after the String is created; Strings are immutable, or unchangeable. When you write someString = "Hello"; and someString = "Goodbye"; you are actually creating a new variable and for "Goodbye" to fix this you can use the SteingBuilder and StringBuffer methods.
    StringBuilder // is more efficient.
    StringBuffer  // is thread safe. This means you should use it in applications that run multiple threads.
    
    // these statements are true for both:
      StringBuilder message = new StringBuilder("Hello There");
      // you can create an empty string builder like this:
      StringBuilder uninitalizedString = null;
      
      setLength() // sets the length of the StringBuilder object.
      capacity()  //
      
      // example:
      import javax.swing.JOptionPane;
      public class StringBuilderDemo {
        public static void main(String [] args) {
          StringBuilder nameString = new StringBuilder("Barbara");
          int nameStringCapacity = nameString.capacity();
          System.out.println("Capacity of nameString is " + nameStringCapacity);
          StringBuilder("6311 Hickory Nut Grove Road");
          int addStringCapacity = addressString.capacity();
          System.out.println("Capacity of addressString is " + addStringCapacity);
          nameString.setLength(20);
          System.out.println("The name is " + nameString + " end");
          addressString.setLength(20);
          System.out.println("The address is " + addressString);
        }
      }
    
  // The StringBuilder class provides you with four constructors as follows:
    public StringBuilder() // constructs a StringBuilder with no characters and a default size of 16 characters.
    public StringBuilder(int capacity) // constructs a StringBuilder with no characters and a chapaciry specified by the paramers.
    public StringBuilder(String s) // contains the same characters as those stored in the String's object s.
    // You will learn the last one in the advanced inhearatance conceps section.
    
  append() // lets you add characters to the end of a StringBuilder object
    // example:
      StringBuilder phrase = new StringBuilder("Happy");
      phrase.append(" birthday"); // this would return "Happy birthday"
      
  insert() // Lets you add characters at a specific location within a StringBuilder object.
    // example
      phrase.insert(6, "30th"); // this will return "Happy 30th birthday"
  
  setCharAt() // allows you to change a character at a specified position within a StringBuilder.
    // example:
      phrase.setCharAt(6, '4'); // this will return "Happy 40th birthday"
      
  
  
    
                      
                      
    
    
    
  