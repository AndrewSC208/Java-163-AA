// Chapter 9 Notes:
// Sorting Array Elements:
  // sorting: is the process of arranging a series of objects in some logical order.
    // Ascending: objects from lowest value to higest value.
    // Desending: objejects from higest to lowest.
    
    // if you want to sort any two values, valA and valB, in ascending order so that valA is always the lower value:
    if(valA > valB)
    {
      temp = valA;
      valA = valB;
      valB = temp;
    }
    
    // sorting is very easy with only two variables with more then two is when we need to employ an array:
    // buble sort: comparing the objects value over and over again until the smallest one "bubbles to the top"
    
    // To use a bubble sort, you place the original, unsorted values in an array:
    int[] someNums = {1, 2, 7456, 52345, 4234, 64564};
    
    // to sort the code would look like this:
    for(a = 0; a < someNums.length - 1; ++a)
      for(b = 0; b < someNums.length - 1; ++b)
        if(someNums[b] > someNums[b + 1])
        {
          temp = someNums[b];
          someNums[b] = someNums[b + 1];
          someNums[b + 1] = temp;
        }
        
    // this is an example of a very efficient way of writing a sorting method:
    int comparisonsToMake = someNums.length - 1;
    for(a = 0; a < someNums.length - 1; ++a)
    {
      for(b; b < comparisonsToMake; ++b)
      {
        temp = someNums[b] > someNums[b + 1])
        {
          temp = someNums[b];
          someNums[b] = someNums[b + 1];
          someNums[b + 1] = temp;
        }
      }
      -- comparisonsToMake;
    }
    
    // example:
    // This is a sample Employee class,
      // the class holds four data fields and get and set methods for the fields:
    
    public class Employee
    {
      private int empNum;
      private String lastName;
      private String firstName;
      private double salary;
      // get and set EmpNum
      public int getEmpNum()
      {
        return empNum;
      }
      public void setEmpNum(int emp)
      {
        empNum = emp;
      }
      // get and set method lastName:
      public String getLastName()
      {
        return lastName;
      }
      public void setFirstLast(String name)
      {
        lastName = name;
      }
      // get and set method firstName:
      public String getFirstName()
      {
        return firstName;
      }
      public void setFirstName(String name)
      {
        firstName = name;
      }
      // get and set Salary method:
      public double getSalary()
      {
        return salary;
      }
      public void setSalary(double sal)
      {
        salary = sal;
      }
    }
    
    // now you can create a program that contains five Employee objects using the following statement:
    Employee[] someEmps = new Employee[5];
    
    // after you assign data to the objects you can pass the array through a bubble sort method like this:
    public static void bubbleSort(Employee[] array)
    {
      int a, b;
      Employee temp;
      int highSubscript = array.length - 1;
      for(a = 0; a < highSubscript; ++a)
      {
        for(b = 0; b < highSubscript; ++b)
        {
          if(array[b].getSalary() > array[b + 1].getSalary())
          {
            temp = array[b];
            array[b] = array[b + 1];
            array[b + 1] = temp;
          }
        }
      }
    }
    
    // Using two-dimensional and other multidimensional arrays:
      //two-dimensional arrays // have two or more columns of values.
      // when you declare a two-dimentional array in java, you type two sets of brackes after the array type
      // emample:
      int[][] someNumbers = new int[3][4];
      // or you can initializ and declare a two dimentional array at the same time:
      int[][] someNumbers = { {8, 9, 10, 11},
                              {1, 3, 12, 15},
                              {5, 9, 44, 99} };
                              
    // eample for determining rent with a two-dimentional array:
    int[][] rents = { {400, 450, 510},
                      {500, 560, 630},
                      {625, 675, 740},
                      {1000, 1250, 1600} };
    int floor, bedrooms;
    // then any tenant's rent can be referred to as rents[floor][bedrooms]
    // this is an application that shows all of that:
    
    import javax,swing.*;
    class FindRant
    {
      public static void main(String[] args)
      {
        int[][] rents = { {400, 450, 510},
                          {500, 560, 630},
                          {625, 675, 740},
                          {1000, 1250, 1600} };
        String entry;
        int floor;
        int bedrooms;
        
        
        // get data from user and assign to entry:
        entry = JOptionPane.showInputDialog(null, "Enter a floor number ");
        floor = Integer.parsInt(entry);
        entry = JOptionPane.showInputDialog(null, "Enter number of bedrooms");
        bedrooms = Integer.parsInt(entry);
        JOptionPane.showMessageDialog(null, "The rent for " + bedrooms + " bedroom apartment on floor " + floor + " is $" + rents[floor][bedrooms]);
      }
    }
    
    // Passing a Two-Dimensional Array to a method:
    
    // The following method headers accept two-dimensional arrays of ints, doubles, and Employees, repectively:
    public static void displayScores(int[][]acoresArray)
    public static boolean araAllPricesHigh(double[][]prices)
    public static double computePayrollForAllEmployees(Employee[][]staff)
      // Notice there is not need tinsert numbers into the brackets because each passed array name is a starting memory address.
      
    // Using the length field with a Two-Dimensional Array:
      // with a two-dimentional array, the length field holds the number of rows in the array. Each row, in turn, has a length field that holds the number of columns in the row. For exmaple, suppose you declate a rents array as follows:
      int[][] rents = { {400, 450, 510}.
                        {500, 560, 630},
                        {625, 676, 740}.
                        {1000, 1250, 1600,} };
      // rents.length is 4 because there are four rows in the array.
      // rents[0].length is 3 because there are three columns.
      // rents[1].length is also 3 because there are three columns in the second row.
      
      // exmple:
      class DisplayRents
      {
        public static void main(String[] args)
        {
          int[][] rents = { {400, 450, 510}.
                            {500, 560, 630},
                            {625, 676, 740}.
                            {1000, 1250, 1600,} };
          int floor;
          int bdrms;
          for(floor = 0; floor < rents.length; ++floor)
          {
            for(bdrms = 0; bdrms < rents[floor].length; ++bdrms)
            {
              System.out.println("Floor " + floor + " Bedrooms " + bdrms + " Rent is $" + rents[floor][bdrms]);
            }
          }
        }
      }
      
  // Understanding Ragged Arrays:
      // Ragged Array: an array with a differetent length row then the rest of the array.
      // You can create a ragged array by defining the number of rows for a two-dimensional array, but not defining the number of columns in the rows.
      
      // example:
      double[][] sales = new double[4][];
      // this statement declars an array with four rows, but the rows are not yet created. Then, you can declare the individual rows, based on the number of states covered by each sales person.
      sales[0] = new double[12];
      sales[1] = new double[18];
      sales[2] = new double[9];
      sales[3] = new double[11];
      
      // Using other multidimensional arrays:
      // Multidimensional - Arrays: these are arrays that have more then two columns and rows.
      // example:
      rents[5][1][3];
      
// Using the arrays class:
  // Methods for manipulating arrays:
  // Method:                                                Purpose:
     static int binarySearch(type[] a, type key)            // Searches the specified array for the specified key value using the binary search algorithm
     static boolean equals(type[] a, type[] a2)             // Returns true if the two specified arrays of the same type atre equal to one another
     static void fill(type[] a, type val)                   // Assigns the specified value to each element of the specified array
     static void sort(type[] a, int fromIndex, int toIndex) // Sorts the specified range of the specified array into ascending order.
     
     // The methods in the arrays class atre static methods, which means you use them with the class name without instantiating an arrays object.
     // The array's method is located in java.util package. so import java.util.*; will pull them in
     
     // example of the Arrays methods:
     import java.util.*;
     public class ArraysDemo
     {
       public static void main(String[] args)
       {
         int[] myScores = new int[5];
         display("Original array:             ", myScores);
         Arrays.fill(myScores, 8);
         display("After filling with 8s:      ", myScores);
         myScores[2] = 6;
         myScores[4] = 3;
         
         display("After changing two values:  ", myScores);
         Arrays.sort(myScores);
         display("After sorting:              ", myScores);
       }
       public static void display(String message, int array[])
       {
         int sz = array.length;
         System.out.print(message);
         for(int x = 0; x < sz; ++x)
         {
           System.out.print(array[x] + " ");
         }
         System.out.println();
       }
     }
     
     // The Array's class binarySearch() methods provide convenient ways to search through sorted lists of values of various data types.
        // It is important that the list be in order before you use it in a call to binarySearch(); otherwise, the results are unpredictable.
        
    // example of the varifyCode application:
    import java.util.*;
    import javax.swing.*;
    public class VerifyCode
    {
      public static void main(String[] args)
      {
        char[] codes = {'B', 'E', 'K', 'M', 'P', 'T'};
        String entry;
        char usersCode;
        int position;
        // user input:
        entry = JOptionPane.showInputDialog(null, "Enter a product code");
        usersCode = entry.charAt(0)
        position = Arrays.binarySearch(codes, userCode);
        if(position >= 0)
        {
          JOptionPane.showMessageDialog(null, "Position of " + usersCode + " is " + position);
        }
        else
        {
          JOptionPane.showMessageDialog(null, usersCode + " is an invalid code");
        }
        
      }
    }
    
// Using the ArrayList class:
    // ArraysList class: can be used to crate containers that store list of objects. The ArraList class provides some advantages over the Arrays class. Specifically, an ArrayList is dynamically resizable.
      // dynamically resizable: the size can change durign progeram execution.
          // You can add an item at any point in an ArrayList container, and the array size expands automatically to accommodate the new item.
          // You can remove an item at any point in an ArrayList contain, and the array size contracts automatically.
          
      // to use the ArrayList class you must use one of the following import statements:
      import java.util.ArrayList;
      // or
      import java.util.*;
      
      // Then, to declare an ArrayList, you can use the default constructor, as in the following example:
      ArrayList names = new ArrayList();
      // the default construct create an arrayList with a campacity of 10 items.
        // An ArrayList's capacity is the number of items it can hold witout having to increase its size.
        
      // you can also specify a capacity if you like:
      ArrayList names = new ArrayList(20);
      // this makes an array list with 20 names!
      // if you know that you are going to need more than 10 items at the outset, it is more effcient to create an ArrayList with a larger capacity.
      
      // Method:                                       // Purpose:
      public void add(Object)                          // Adds an item to an ArrayList; the default version adds an item at the next available location;
      public void add(int, Object)                     // an overloaded version allows you to spevify a position at which to ass the item.
      
      public void remove(int)                          // Removes an item form an ArrayList at a specified location
      public void set(int, Object)                     // Alters an item at a specified ArrayList location.
      Object get(int)                                  // Retrieves an item from a specified location in an ArrayList
      public int size()                                // Returns the current ArrayList size
      
      // To add an item to the end of an ArrayList, you can use the add() method
      names.add("Abigail");
      // You can insert an item into a specific position in an ArrayList by using an overloaded version of the add() method that includes the position.
      // example:
      names.add(0, "Bob");
      
      // you can also alter and remove items from an ArrayList. and the size() method returns the current size of the ArrayList.
      
      // example:
      import java.util.ArrayList;
      public class ArrayListDemo
      {
        public static void main(String[] args)
        {
          ArrayList names = new ArrayList();
          names.add("Abigail");
          display(names);
          names.add("Brian");
          display(names);
          names.add("Zachary");
          display(names);
          names.add(2, "Christy");
          display(names);
          names.remove(1);
          display(names);
          names.set(0, "Annette");
          display(names);
        }
        public static void display(ArrayList names)
        {
          system.out.println("\nThe size of thel ist is " + names.size());
          for(int x = 0; x < names.size(); ++x)
          {
            System.out.println("Position " + " Name: " + names.get(x));
          }
        }
      }
     
     
     // You can display contents of an ArrayList of Strings without loop through the values
     // example:
     import javax.swing.*;
     import java.utilArrayList;
     public class ArrayListDemo2
     {
       public static void main(String[] args)
       {
         ArrayList students = new ArrayList();
         String name;
         final int LIMIT = 4;
         for(int x = 0; x < LITMIT; ++x)
         {
           name = JOptionPane.showInputDialog(null, "Enter a student's name");
           students.add(name);
         }
         System.out.println("The names are " + students);
       }
     }
     
     // you can also sort an ArrayList using the Collections.sort() method an providing the ArrayList as the argument -- for example:
     Collections.sort(students);
     
     
// Understanding the limitations of the ArrayList class:
    // An ArrayList can be used to store any type of object reference.
      // In fact, one ArrayList can store mulitople types, however this creates two drawbacks:
        // You cannot use an ArrayList to store primitive types such as int, double, or char becasue those types are not references. If you want to work with primitive types, you can create an array or use the Arrays class, but yo cannot use the ArrayList class
        //When you want to store ArrayList elements, you must cast them to the appropriate reference type before you can do so, or you must declate a reference type in the ArrayList declaration.
      
      // for example, if you want to declare a String to hold the first name in the names ArrayList, you must make statements such as the following:
      String firstName;
      firstName = (String)name.get(0);
      
      // You can eliminate the need to perform a cast with ArrayList objects by specifying the type that an ArrayList can hold. For example, you can declate an ArrayList of names as follows:
      ArrayList<String> names = new ArrayList<String>();
        // The advantages to this are:
            // You no longer have to use the cast operator when retrieving an item from the ArrayList
            // java Checks to make sure that the only items of the appropriate type are added to the list.
            // The compiler warning that indicates your program uses an unchecked or unsage operation is eliminate.
            
// Creating Enumerations:
    // Enumerated data type: A programmer created data type with a fixed set of values.
    // example of creating a enum:
    enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};
    
    // by convention, the identifier for an enumerated type begins with an uppercase letter. This convention makes sensee because an enumerated type is a class.
    // Also by convention, the enum constants, like other constants, appear in all uppercase letters. The constatnts are not strings and they are not enclosed in quotes; they are Java identifietrs.
    
    Month birthMonth;
    // You can assign any of the enum constants to the variable. Therefore, you can code a statement such as the following:
    birthMonth = Month.MAY;
    // An enumerated type like Month is a class, and it enum constants act like objects instantiatyed from the class, including having access to the methods of the class. These built-in methods include theo nes shown:
    // Method       Descripton                                                                        Example if birthMonth=Month.MAY
    toString()      // The toString() method returns the name of the calling constant object.         // birthMonth.toString() has the value "MAY"
                                                                                                      // Yu can pass birthMonth to print() or println() and                                                                                                       it is automatically converted to its string equivalent.
    ordinal()       // The ordian() method returns an integer that represents the constant's position
                    // in the list of constatnts; as with array, the first position is 0.             // birthMonth.ordinal() ==> 4
    
    equals()        // The equals() method returns true if its argument is equal to the calling       // birthMonth.equals(Month.MAY) ==> true
                    // object's value.                                                                // birthMonth.equals(Month.NOV) ==> false
    
    compareTo()     // The compareTo() method returns a negative integer if the calling object's      // birthMonth.compareTo(Month.JUL) ==> negative
                    // ordinal value is less than that of the argument, 0 if they are the same, and   // birthMonth.compareTo(Month.FEB) ==> positive
                    // a positive integer it the callign object's ordinal value is gre3ater than that // birthMonth.compareTo(Month.MAY) ==> 0
                    // of the argument.
    
    // Statice methods are also avaiable to use with enumerations. these are used with the type and not with the individual constants:
    // Method       // Description                                                                    // Example with Month Enumeration:
    valueOf()       // The valueOf() methods accepts a string parameter and teturns an enumeration    // Month.valueOf("DEC") ==> DEC enum constant
                    // constant.
    
    values()        // The values() method returns an array of the enumerted constant.                // Month.values() returns an array with 12 elements
                                                                                                      // that contain the enum constants.
    
    // Example: An application that declates a Month enumeration and demonstrates its use:
    import java.ustil.Scanner;
    public class EnumDemo;
    {
      enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};
      
      public static void main(String[] args)
      {
        Month birthMonth;
        String userEntry;
        int position;
        int comparison;
        Scanner input = new Scanner(System.in);
        
        System.out.prinln("The month are:");
        for(Month mon : Month.values())
        {
          System.out.print(mon + " ");
        }
        System.out.print("\n\nEnter the first three letters of " + "your birth month >> " );
        userEntry = input.nextLine().toUpperCase();
        birthMonth = Month.valueOf(userEntry);
        System.out.println("You entered " + birthMonth);
        position = birthMonth.ordianl();
        System.out.println(birthMonth + " is in position " + position);
        System.out.println("So its month number is " + (position + 1));
        comparison = birthMonth.compateTo(Month.JUN);
        if(comparison < 0)
        {
          System.out.println(birthMonth + " is earlier in the year than " + Month.JUN);
        }
        else
        {
          if
          {
            if(comparison > 0)
            {
              System.out.println(birthMonth + " is later in the year than " + Month.JUN);
            }
            else
            {
              System.out.println(birthMonth + " is " + Month.JUN);
            }
          }
        }
      }
    }
    

    
    // This is another example:
    import java.util.Scanner;
    public class EnumDemo2
    {
      enum Propery {SINGLE_FAMILY, MULTIPLE_FAMILY, CONDOMINIUM, LAND, BUSINESS};
      
      public static void main(String[] args)
      {
        Propery propForSale = Property.MULTIPLE_FAMILY;
        switch(propForSale)
        {
          case SINGLE_FAMILY:
          case MULTIPLE_FAMILY:
            System.out.println("Listing fee is 5%");
            break;
          case CONDOMINIUM:
            System.out.println("Listing fee is 6%");
            break;
          case LAND:
          case BUSINESS:
            System.out.println("We do not handle this type of property");
        }
      }
    }