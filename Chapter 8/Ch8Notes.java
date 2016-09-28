// Chapter 8 notes:
// Arrays:

public class Ch9Notes {
	public static void main (String[] args) {
		// This is just to get the file to compile. Not sure why I put it in.
	}
}

// Declaring and initializing an array
// Array: is a named list of data items that all have the same type.

// declaring array of doubles:
double[] salesFigure;
int[] idNum;
// create array object with 20 objects:
sale = new double[20];

// you can also declare and create an array in one statement with the following:
double[] sale = new double[20];

// When you declare or access an array, you can use any expression to represent the size, as long as the expression is an integer. For example, to declare a double array named money, you might use any of the following:

// a literal integer constant; for example:
double[] money = new double[10];

// a named integer constant:
double[] money = new double[NUMBER_ELS];

// an integer variable:

double[] money = new double[numberOfEls];
	// in this example, the variable numberOfEls must have been declared previously and assigned a value.

// a calculation:
double[] money = new double[x + y * z];
	// in this variables x,y and z must have been declared previouslty and assigned values.

// a method's return value:
double[] money = new double[getElement()];
	// in this example, the method gerElements() must return an intger.

// INITIALIZING AN ARRAY:

// When you use the keyword new to define an array, the array name acquires an actual memory address value.
// ie:
int[] someNumes = new int[10];
	// when you declare int[] someNums = new int[10]; each element of someNums has a value of 0 because someNumes is a numeric array.
	// each double or float is assigned 0.0
	// each char is assigned \u0000
	// and boolean array elements automatically are assigned the false value

// you already know hot to assign a different value to a single element of an array is:
someNums[0] = 46;

// you can also assign none default values to array elements upon creation:
int[] tenMult = {10, 20, 30, 40, 50, 60, 70, 80, 90};

// populating the array: is progviding values for all the elements in an array.

// for exmaple the method that was just created tenMult[] has 9 elements.

// USING SUBSCRIPTS WITH AN ARRAY:
// the power of arrays come when you begin to use subscripts that are variables:

// exmaple: suppose you declare an array of five integers that holds quiz scores, such as the following:
int[] scoreArray = {2, 14, 35, 67, 85};
// you might want to perform the same operation of each array element, such as increating each score by a constant amount.
// you could do:
final int INCREASE = 3;
scoreArray[0] += INCREASE;
scoreArray[1] += INCREASE;
scoreArray[2] += INCREASE;
// and so on.
// or you can do this:
final int INCREASE = 3;
for(sub = 0; sub < 5; ++sub){

	scoreArray[sub] += INCREASE;
}

// this allows you to write three lines of code and not have to repeat yourself if your programs.

// say that you had 100 elements inside of your array:
final int INCREASE = 3;
for(sub = 0; sub < 100; ++sub) {
	scoreArray[sub} += INCREASE;
}


// you can also make things alot faster if you use a more variables:
int[] scoreArray = {2,14,35,67,85};
final int NUMBER_OF_SCORES = 5;
for(sub = 0; sub < NUMBER_OF_SCORES; ++sub) {
	scoreArra[sub] += INCREASE;
}
// this formate has two advantages:
	// first: by using the symbolic constant, NUMBER_OF_SCORES, the reader understands that you are processing every array element		for the size of the entire array.
	// second: if the array size changes because you romove or add scores, you change the symbolic constant value only once, and a		ll loop that yse the constant are automatically altered to perform the correct number of repetitions.

// as another option you can use the length field:
// if you create an array like this:
int[] scoreArray = {2,14,35,67,85}; // the .length field know that there are five elements in the array so you can increse all of them by 3 like this.
for(sub = 0; sub < scoreArray.length; ++sub) {
	scoreArray[sub] += INCREASE;
}

// leter if you change the size of the array and recomplie the program, the value in the length field of the array changes appropriately.

// WHEN YOU WORK WITH ARRAY ELEMENTS, IT IS ALWAYS BETTER TO USE A SYMBOLIC CONSTANT OR LENGTH FIELD WHEN WRITING A LOOP THAT MANIPULATES AN ARRAY!

// you can also use the advaanced for loop to print out all of the elements that are inside the array:
for(int sub = 0; sub < scoreArray.length; ++sub)
	System.out.println(scoreArray[sub]);

// enhanced for loop method:
for(int val : scoreArray)
	System.out.println(scoreArray(val);

// Well I am kinda glade that all of the stuff that I just wrote was not saved I think that I just want something to be wrong so that I can have an issue to dwell on. I really think that everything right now is going well.

// DECLARING AN USING ARRAYS OF OBJECTS:
// Just as you can declare arrays of integers or doubles, you can declare arrays that hold elements of any type, including objects:
    // example:
    public class Employee
    {
      private int empNum;
      private double empSal;
      Employee(int e, double s)
      {
        empNum = e;
        empSal = s;
      }
      public int getEmpNum()
      {
        return empNum;
      }
      public double getSalary()
      {
        return empSal;
      }
    }

    // Now to crate an array named emp that holds seven Employee objects can be defined like this:
    Employee[] emp = new Employee[7];
    // this reserves cpu memory bust does not construct them.

    // you must call seven individual constructors
    // if you want to number your employees 101, 102 and so on, and start each Employee salary of $6.35, the loop constructs seven employess objects is as follows:
    final int START_NUM = 101;
    final double PAYRATE = 6.35;
    for(int x = 0; x < emp.length; ++x)
      emp[x] = new Employee(START_NUM + x, PAYRATE);

    // as x varies from 0 through 6, each of the seven emp objects is constructed with an employee number that is 101 more than x, and each of the seven emp objects holds the same salary of 6.35, and assigned in the constant PAYRATE.

    // suppose you have created a class named InventorItem but have not written a construct. 
    // To create an array of 1,000 InventoryItem objects you would write the following:
    final int NUM_ITEMS = 1000;
    InventoryItem[] items = new InventoryItem[NUM_ITEMS];
    for(int x = 0; x < NUM_ITEMS; ++x)
    {
      items[x] = new InventoryItem();
    }





// Manipulating Arrays of Strings:
String[] deptName = {"Accounting", "Human Resources", "Sales"};
// access these department name like any other array object:
for(int a = 0; a <deptName.length; ++a)
  System.out.prinln(deptName[a]);

//example:
import javax.swing.*;
public class SearchList {
  public static void main(String[] args) {
    String[] deptName = {"Accounting", "Human Resources", "Sales"};
    String dept;
    int x;
    boolean deptWasFound = false;
    dept = JOptionPane.showInputDialog(null, "Enter a department name");

    for(x = 0; x < deptName.length; ++x) {
      if(dept.equals(deptName[x]))
        deptWasFound = true;
      }
      if(deptWasFound) {
        JOptionPane.showMessageDialog(null, dept + " was found in the list");
      } else {
        JOptionPane.showMessageDialog(null, dept + " was not found in the list");
      }
  }
}

//SEARCHING AN ARRAY:
final int LOW = 101;
final int HIGH = 110;
boolean validItem = false;

if(itemOrdered >= LOW && itemOrdered <= HIGH) {
  validItem = true;
}
// initialize and array with the id numbers:
int[] validValues = {101, 108, 201, 213, 266, 304, 311, 409, 411, 412};
// use a for statement to loop through the array, and set a Boolean variable to true when a match is found:
for(int x = 0; x < validValues.length; ++x) {
  if(itemOrdered == validValues[x]) {
    validItem = true;
  }
}
// This simple for loop replaces the long series of if statements; it checks the itemOrdered value against each of the 10 array values in turn.
// Also, if a company carries 1000 items instead of 10, nothing changes in the for statement - the value of validValues.length is updated automatically.
// As an added bonus, if you set up another parallel array with the same number of elements and corresponding data, you can use the same subscropt to access additional informaton. // this is called an parallel array.
// for example if the 10 items your company carries have 10 different prices, you can set up an array to hold those prices as follows:
double[] prices = {0.29, 1.23, 3.50, 0.69 .....};


// this is the full of searching array's and also using a parallel array:
import javax.swing.*;
public class FindPrice {
  public static void main(String[] args) {
    // variables & arrays:
    final int NUMBER_OF_ITEMS = 10;
    int[] validValues = { 101,  108,  201,  213,  266,  304,  311,  409,  411,  412};
    double[] prices   = {0.29, 1.23, 3.50, 0.69, 6.79, 3.19, 0.99, 0.89, 1.26, 8.00};
    String strItem;
    int itemOrdered;
    double itemPrice = 0.0;
    boolean validItem = false;
    // Get info from user:
    strItem = JOptionPane.showInputDialog(null, "Enter the item number you want to order");
    // put the number from the string:
    itemOrdered = Integer.parseInt(strItem);
    //for loop:
    // if you wanted to use the while loop this is were it would be.******
    for(int x = 0; x < NUMBER_OF_ITEMS; ++x) {
      if(itemOrdered == validValues[x])
      {

        validItem = true;
        itemPrice = prices[x];
        // you use this statement to jump out of the loop if the value if identified before getting through the whole array.
        x = NUMBER_OF_ITEMS;

      } // end of if
    } // end of for statement
    if(validItem) {
      JOptionPane.showMessageDialog(null, "The price for item " + itemOrdered + " is $" + itemPrice);
    } else {
      JOptionpane.showMessageDialog(null, "Sorry - invalid item entered");
    }
  }
}
// or you can use a while loop: like this****
x = 0;
while(x < NUMBER_OF_ITEMS && itemORDERED != valid Values[x])
  ++x;
if(x != NUMBER_OF_ITEMS) {
  validItem = true;
  itemPrice = price[x];
}

// SEARCHING AN ARRAY FOR A RANGE MATCH:
// suppoes your compay gives discounts for different amounts of products purchased:
// range match: you compare a value to the endpoints of numerical ranges to find the category in which a value belongs.
import javax.swing.*;
public class FindDiscount {
  public static void main(String[] args) {
    	final int NUM_RANGES = 5;
    	int[] dicountRangeLimit = {   1,   13,  50,   100,  200};
    	double[] discountRate =   {0.00, 0.10, 0.14, 0.18, 0.20};
    	double customerDiscout;
    	String strNumOrdered;
    	int numOrdered;
    	int sub = NUM_RANGES -1;
	strNumOrdered = JOptionPane.showInputDialog(null, "How many items are ordered?");
	numOrdered = Integer.parseInt(strNumOrdered);
	while(sub >= 0 && numOrdered < discoutRangeLimit[sub])
		--sub;
	customerDiscount = discourRate[sub];
	JOptionPane.showMessageDialog(null, "Discount rate for " + numOrdered + " items is " + customerDiscount);
  }
}

// PASSING ARRAYS TO AN RETURNING ARRAYS FROM METHODS:
// example figure 8-11

public class PassArrayElemet {
	public static void main(String[] args) {
		final int NUM_ELEMENTS = 4;
		int[] someNums = {5, 10, 15, 20};
		int x;

		System.out.print("At strt of main: ");
		for(x = 0; x < NUM_ELEMENTS; ++x)
			System.out.prin("   " + someNums[x] );
		System.out.prinln();
		for(x = 0; x < NUM_ELEMENTS; ++x)
			methodGetOneInt(someNums[x]);
		System.out.println("At end of main: ");
		for(x = 0; x < NUM_ELEMENTS; ++x)
			System.our.print(" " +someNums[x]);
		System.out.println();
	}
	public static void methodGetsOneInt(int one) {
		System.out.print("At start of method one is: " + one);
		one = 999;
		System.out.println(" and at end of method one is: " + one);
	}
}


// RETURNING AN ARRAY FROM A METHOD:
// example:
public static int[] getArray() {
	int[] scores = {90, 80, 70, 60};
	return scores;
}
