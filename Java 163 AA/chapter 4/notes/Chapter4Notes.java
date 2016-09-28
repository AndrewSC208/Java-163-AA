// chapter 4 notes:
/*
I. Understanding Blocks and scope:
	A. within any class or method, the code between a pair of curly braces is called a block.
		1. Outer block: the outer most block.
		2. Inside block: Is contained within the second set of curly braces. 
			a. The inside block is nested, or contained entirely within, the outside block. 
			b. A block can exist entirely within another block or entirely outside an separate from another block, but blocks can never overlap. 
				i.e: If a method contains two opening curly braces, indicating the start of two blocks, the next closing curly brace always closes the inner(second) block - it cannot close the outer block, because that would make the blocks overlap. 
		3. When you declare a variable, you cannot refer to that variable outside its block. 
			a. A variable come into existence, or comes into scope, when you declare it.
			b. A variable ceases to exist, or goes out of scope, at the end of the block in which it is declared. 
		4. Within a method, you can declare a variable with the same name multiple times, as long as each declaration is in its own non-overlapping block. 
			a. You cannot declare the same variable name more than once within a block, even it a block contains other blocks. 
			b. when you declare a variable more than once in a block, you are attempting to redeclare the variable -- this is illegal action.
		5. Although you cannot declare a variable twice within the same block, you can declare a variable within one method of a class and use the same variable name within another method of the class.
			a. When you use the variable's name within the method in which it is declared, it takes precedence over, or overrides, any other variable with the same name in another method. 
			b. In other words, a locally declared variable always masks or hides another variable with the same name else where in the class. 
II. Overloading a Method:
	A. Overloading: Involves using one term to indicate diverse meanings, or writing multiple methods with the same name but with different parameters list. 
III. Learning about ambiguity:
	A. Ambiguous situation: One in which the compiler cannot determine which method to use. 

IV. Using Constructors with Parameters:
	A. You learned that Java will provide a constructor to a methods, or you can write your own default constructor. You can also write your own default constructor that will take parameters.
		1. when you create an class that has a constructor that takes a parameter you can no longer just pass the default value to the class. You then have to provide the data that is needed for the constructor. 
			i.e: Employee partTimeWorker = new Employee(); will not work is the constructor takes a parameter.
				 Employee partTimeWorker = new Employee(45); will work if the Employee() class takes a int in its constructor parameters. 

	B. Overloading Constructors:
		1. As with any other method, you can overload constructors. 
		2. Overloading constructors provides you with a way to create objects with different initializing arguments, or none, as needed. 

		Example:
*/
			public class Employee { // this is an example of an overloaded constructor. 
				private int empNum;

				Employee(int num) { // this creates your own default constructor that will take a parameter. 
					empNum = num;
				}
				Employee() { // this creates your own default constructor.
					empNum = 999;
				}
			}

			// this is super cool. It gives you the ability to create multiple different patterns that a method can accept. 
/*
V. Learning about the "this" Reference:
	A. This: is a reserved word in Java. 
		1. Frequently, you neither want nor need to refer to the this reference within the methods you write, but the this reference is always there, working behind the scenes, so that the data field for the correct object can be accessed. 
		2. On a few occasions, you must use the this reference to make your classes work correctly;

			example: A student class whose constructor does not work.
*/
			public class Student {

				private int stuNum;
				private double gpa;

				public Student(int stuNum, double gpa) {
					stuNum = stuNum; // don't do it: all four variables used in these two statements are local versions declared in the method's parameter list. The fields are never accessed and these statements accomplish nothing. 
					gpa = gpa;
				}

				public void showStudent() {
					System.out.println("Student #" + stuNum + " gpa is " + gpa);
				}
			}

			// example: the TestStudent class that instantiates a Student object:

			public class TestStudent {

				public static void main(String[] args) {

					Student aPsychMajor = new Student(111, 3.5);

					aPsycMajor.showStudnet();
				}
			}

			// the output for this program is #0 for student id number and 0.00 for gpa.

			// example: The Student class using the explicit this reference with-in the constructor:

			public class Student {
				private int stuNum;
				private double gpa;

				public Student(int stuNum, double gpa) {
					this.stuNum = stuNum;
					this.gpa = gpa;
				}
				public void showStudent() {
					System.out.println("Student #" + stuNum + " gpa is " + gpa);
				}
			}

			// output of last class: Student #111 gpa is 3.5
			// using the this reference fixes the problem.
/*
VI. Using the this reference to make overloaded constructors more efficient:
	A. This example allows Students class to be overloaded four different times using the this reference:

		example: 
*/
			public class Student {
				private int stuNum;
				private double gpa;

				Student(int num, double avg) {
					stuNum = num;
					gpa = avg;
				}
				Student(double avg) {
					stuNum = 999;
					gpa = avg;
				}
				Student(int num) {
					stuNum = num;
					gpa = 0.0;
				}
				Student() {
					stuNum = 999;
					gpa = 0.0;
				}
			}
/*
			1. You can make the code more efficient and less error-prone by calling one constructor version from the others. To do so, you use the this reference from one constructor version to call another version. 

		example:
*/
			public class Student {
				private int stuNum;
				private double gpa;

				Student(int num, double avg) {
					stuNum = num;
					gpa = avg;
				}
				Student(double avg) {
					this(999, avg);
				}
				Student(int num) {
					this(num, 0.0);
				}
				Student() {
					this(999, 0.0);
				}
			}

			// the student class using this in three of four constructors.

			//	a. By writing each constructor to call one master constructor, your save coding and reduce the chance of errors. 
			//	b. Testing a variable to ensure it falls within the proper range of values requires decision making. The next chapter covers this topic.
			//	c. You cannot call this() from other methods in a class; you can only call it from constructors. If you call this() from a constructor, it must be the first statement within the constructor.
/*
VII. Using "static" variables:
	A. In chapter 3, you learned that methods you create to use without objects are static. 
		1. i.e: The main() method in a program and the methods that main() calls without an object reference are static. 
		2. You also learned that most methods you create within a class from which objects will be instantiated are non static. 
		3. Static methods do not have a "this" reference because they have no object associated with them; therefore, they are called class methods.
			a. class variable: are variables that are shared by every instantiation of a class.
			b. Instance variables: Exist separately for every object you create, there is only one copy of each static class variable per class. 

			example: 
*/
				public class BaseballPlayer {

					private static int count = 0;
					private int number;
					private double battingAverage;

					public BaseballPlayer(int id, double avg) {
						number = id;
						battingAverage = avg;
						count = count + 1;
					}
					public void showPlayer() {
						System.out.println("Player #" + number + " batting average is " + battingAverage + " There are " + count + " players");
					}
				}

			// example: this is the TestPlayer class that annunciates BaseballPlayer class.

				public class TestPlayer {
					public static void main(String[] args) {
						// creating data fields for the different players:
						BaseballPlayer aCatcher = new BaseballPlayer(12, .218);
						BaseballPlayer aShortstop = new BsaseballPlayer(31, .385);

						// show the newly created players:
						aCatcher.showPlayer();
						aShortstop.showPlayer();

						// Create a new player:
						BaseballPlayer anOutfielder = new BaseballPlayer(44, .505);
						// show the new player info
						anOutfielder.showPlayer();
						// show the aCatcher info again.
						aCatcher.showPlayer();
					}
				}

			//console output:
			/*
				Player# 12 batting average is 0.218 There are 2 players
				Player# 31 batting average is 0.385 There are 2 players
				Player# 44 batting average is 0.505 There are 3 players
				Player# 12 batting average is 0.218 There are 3 players
			*/
/*				
VIII. Using Constant Fields:
	A. You might want to store a school ID value that is the same for every Student object you create, so you declare it to be static. In addition, if you want the value for the school ID to be fixed so that all Student objects use the same ID value:

		example: The Student class containing a symbolic constant.
*/
			public class Student {
				private static final int SCHOOL_ID = 12345;
				private int stuNum;
				private double gpa;

				public Student(int stuNum, double gpa) {
					this.stuNum = stuNum;
					this.gpa = gpa;
				}
				public void showStudent() {
					System.out.println("Student #" + stuNum + " gpa is " gpa);
				}
			}

		// 1. You can use the keyword final with methods or classes. When used in this manner, final indicates limitations places on inheritance. 
		// 2. Fields that are final also can be initialized in a static initialization block.
		// 3. Fields declared to be static are not always final. If you want to create a field that all members of the class can access, but the field value changes, then it is static but not final. 
/*
VIV. Using Automatically imported, pre-written constants and methods:
	A. Java has hundreds of different classes that are commonly used by programmers already created so that your can develop faster:
		1. Each of these classes is stored in a package, or a library of classes, which is simple a folder that provides a convenient grouping for classes. 
			a. The package that is implicitly imported into every Java program is named java.lang 
				i. the classes that it contains are fundamental classes or basic classes.
				ii. optional classes: these must be explicitly named. 
				iii. A good example of this is the java.lang.Math class

					example:

						areaOfCircle = Math.PI * radius * radius;

						// the java.lang.Math class contains a lot of different methods and functions that you can use.

X. Using the GregorianCalander class:
	A. Java contains hundreds of classes, only a few of which - those in the java.lang package -- are included automatically in the programs you write.
		1. To use any of the other pre-written classes, you must use one of three methods:
			a. Use the entire path with the class name.
				i.e: java.util.GregorianCalender myAnniversary = new java.util.GregorianCalender();
			b. Import the class
				i.e: import java.util.GregorianCalender; // as the first line of the class. 
			c. Import the package that contains the class you are using. 
				i.e: import java.util.*;

				* = wild card symbol this means that you want to import the whole package. 

		Example: this is an example of the GreforianCalendar.
*/
		import java.util.*;
		import javax.swing.*;

		public class AgeCalculator {
			public static void main(String[] args) {

				GregorianCalendar now = new GregorianCalendar();

				int newYear;
				int birthYear;
				int yearsOld;

				birthYear = Integer.parseInt(JOptionPane.showInputDialog(null, "In what year were you born?"));
				nowYear = now.get(GregorianCalendar.YEAR);
				yearsOld = nowYear - birthYear;

				JOptionPane.showMessageDialog(null, "This is the year you become " + yearsOld + " years old");

			}
		}

/*
XI. Understanding composition:
	A. The fields in a class can be simple data types like int and double, but they can also be class types. 
		1. Composition: describes the relationship between classes when an object of one class is a data field with another class. 
			a. when you use an object as a static member of another object, you must remember to supply values from the contained object if it has not default constructor.  

			for example: You might want to create a class named NameAndAddress that stores name and address information, such a class could be used for employee, customers, students, or anyone else who has a name and address:
*/
					public class NameAndAddress {
						private String name;
						private String address;
						private int zipCode;

						public NameAndAddress(String nm, String add, int zip) {
							name = nm;
							address = add;
							zipCode = zip;
						}
						public void display() {
							System.out.println(name);
							System.out.println(address);
							System.out.println(zipCode);
						}
					}
/*
				b. now you want to create a school class that holds information about a school. Instead of declaring fields for the schools name and address, you could use the NameAndAddress class.

				c. The relationship created is sometimes calls a has-a relationship because one class "has an instance of another."

				example: The school class.
*/
					public class School {

						private NameAndAddress nameAdd; // This is required to create the memory. Its like any other data type. 
						private int enrollment;

						public School(String name, String add, int zip, int enrolled) {
							nameAdd = new NameAndAddress(name, add, zip);
							enrollment = enrolled;
						}
						public void display() {
							System.out.println("The school information: ");
							nameAdd.display();
							System.out.println("Enrollment is " + enrollment);
						}
					}

				// super cool and now lest instantiate these programs:

				// example: The schoolDemo program.

					public class SchoolDemo {
						public static void main(String[] args) {
							School mySchool = new School("Audubon Elementary", 3500 Hoyne", 60618, 350");
							mySchool.display();
						}
					} 
/*
XII. A Brief look at Nested and Inner Classes:
	A. Nested classes: Classes stored inside of other classes.
		1. Static member classes: A static member class has access to all static methods of the top-level class.
		2. Non static member classes, also know as inner classes: This type of class requires an instance; it has access to all data and methods of the top-level class.
		3. Local classes: These are local to a block of code.
		4. Anonymous classes: These are local classes that have no identifier. 

			a. The most common reason to nest a class inside another is because the inner class is used only by the top-level class;
				i. it's a helper class. Putting them together makes their connection easier to understand and their code easier to maintain. 

			example: The RealEstateListing class:
*/
				public class RealEstateListing {
					private int listingNumber;
					private double price;
					private HouseData houseData;

					public RealEstateListing(int num, double price, String address, int sqFt) {
						listingNumber = num;
						this.price = price;
						houseData = new HouseData(address, sqFt);
					}
					public void display() {
						System.out.println("Listing number #" + listingNumber + " Selling for $" + price);
						System.out.println("Address: " + houseData.streetAddress);
						System.out.println(houseData.squareFeet + " square feet");
					}
					private class HouseData {
						private String streetAddress;
						private int squareFeet;
						public HouseData(String address, int sqFt) {
							streetAddress = address;
							squareFeet = sqFt;
						}
					}
				}
































































