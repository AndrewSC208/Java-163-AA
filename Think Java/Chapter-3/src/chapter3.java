// Think Java Chapter 3 Notes
//
// 3.1 Floating-point:
	// In java the floating point int's are called "double." this is short for "double-precision"
// syntax example:
	// double pi;
	// pi = 3.14159;
	// it is also legal to declare variable and assign a value to it at the same time:
		// int x = 1;
		// String emptly = "";
		// double pi = 3.14159;
	// This syntax is common, a combined declaration and assignment is sometimes called an initialization.
// 3.2 Converting from double to int:
// as mentioned before Java converts ints to doubles automatically if necessary, because no information is lost in the translation
// on the other hand, going from double to int requires rounding off. Java doesn't perform this operation automatically, in order to make sure that youm as the programmer, are aware of the loss of the fractional part of the number.
// The simplest way to convert a floating-point value to an integer is to use a typecast. 
	//Typecastinf is so called because it allows you to take a value that belongs to one type and "cast" it into another type (in the sense of moling and reforming).
// syntax: 
	// double pi = 3.14159;
	// in x = (int) pi;
	// The (int) operator has the effect of converting what follows into an integer, so x gers the value 3. 
// typecasting takes prcedence over arithmetic operations, so in the following example, the value of pi gets converted to an int first, and the result is 60.0, not 62.
// example: 
// double pi = 3.14159;
// double x = (int) pi * 20.0;
// Converting to an integer always round down, even if the fraction part is .99999999. These behaviors (precedence and rounding) can make typecasting error-prone.

// 3.3 Math Methods:
// Java provides funcations that perform the most common mathematical operations. These functions are called "methods."
// Math methods are invoked using a syntax that is similar to the print statements we have already seen:
// double root = Math.sqrt(17.0);
// double angle = 1.5;
// double height = Math.sin(angle);
// To convert from degrees to radiants, you can divide by 360 and multiply by 2(PI). Conveniently, Java provides Math.PI;
// douvle degree = 90;
// double angle = degrees * 2 * Math.PI / 360.0;
// Another useful method in the Math class is round, which rounds a floating-point value off to the nearest integer and returns and int.
	// int x = Math.round(Math.PI * 20.0); The answer is 63 that is rounded up from 62.8319.

// 3.4 Composition: 

//  Just as Mathematical functions, Java methods can be composed, meaning that you use one expression as part of another. 
// example: double x = Math.cos(angle + Math.PI/2);

// You can also take the result of one method and pass it as an argument to anoteher:
	// double x = Math.exp(Math.log(10.0));
	// In Java, the log method always uses base e, so this statement finds the log base e of 10 and then taises e to that power. The result gets assigned to x;

// 3.5 Adding new methods:
public static void NAME( List of parameters ) {
	//statements	
}
// The list of parameters specifices what inforamtion, if any, you have to provide to use (or invoke) the new method.
// example the parameter for main is String[] args, which means that whoever invokes main has to provide an array of strings.

// fist new method:
public static void newLine() {
	 System.out.println("");
}
// the name of this new method is newLine and the empty parentheses mean that it takes no parameters. 
// it contains one statement, which prints an empty String, indicated by "". this method basically skips a line.
// in main we invoke this new method the same way we invoke Java methods:
public static void main(String[] args) {
	System.out.println("First line.");
	newLine();
	System.outprintln("Second line");
}

// Output of the programm is:
//First line

//Second line

// What if we wanted more space?
// We could invoke the same method repeatedly:
public static void main(String[] args) {
	System.out.println("Fisrt Line");
	newLine();
	newLine();
	newLine();
	System.out.println("Second Line");
}

// or we could write a new method, named threeline, that prints the new lines:

public static void threeLine() {
	newLine();
	newLine();
	newLine();
}

public static void main(String[] args) {
	System.out.println("First Line");
	threeLine();
	System.out.println("Second Line");
}

// You can invoke the same procedure more than once.
// you can have one method invoke another method. In this case, main invokes threeLine and threeLine invokes newLine.

// Why is it worh the rouble to create all these new methods?
	// Creating a new method gives you an opportunity to give a name to a group of statements. Methods can simplify a program by hiding a complex computation behind a single statement, and by using English words to place of arcane code.
	// Creating a new method can make a program smaller by eliminating repetitive code. For example, to print nine consecutive new lines, you could invoke threeLine three times.

// 3.6 Classes and methods: Pulling the code from the previous section, the class definition looks like this:
class NewLine { // indicats that this is the class definition for a new class called NewLine. A class is a collection or related methods. In this case the class named NewLine contains three methods, newLine, threeLine, and main. 

	public static void newLine() {
		System.out.println("");
	}

	public static void threeline() {
		newLine(); newLine(); newLine();
	}

	public static void main(String[] args) {
		System.out.println("First Line.");
		threeLine();
		System.out.println("Second Line.");
	}
}


//the other class that we have seen is the math class. It contains methods named sqrt, sin, and others. When we invoke a mathematical method, we have to specify the name of the class (Math) and the name of the method. That's why the syntax is slightly different for Java methods and the methods we write.
	// example: 
	// Math.pow(2.0, 10.0); // This line is calling the math class 
	// newLine(); // This line is calling the newLine() method that Java assumes that is in the class we are writing. 

// 3.7 Programs with multiple methods:

//Execution always begins at the first statment of main, regardless of where it is in the program (in this program I deliberately put it at the bottom.)

// Statements are executed one line at a time until you reach a method invocation. 
// Method invocations are like detours in the flow of execution. Instead of going to the next line you go to the first line of the invoked method, execute all of the statements their and then come back and pick up again where you left off. 

// 3.8 Parameters and arguments:
//some of the methods we have used require arguments, which are values that you provide when you invoke the method.
	// i.e: "sin" takes a double as an argument.
	// when you use a method, you provide arguments
	// When you write a method, you specify a list of parameters. 
// A parameter is a variable that stores an argument. The parameter list indicates whet arguments are required.
// i.e: printTwice specifies a single parameter, s, that has type String. I called it s to suggest that it is a String.
public static void printTwice(String s) {
	System.out.println(s);
	System.out.println(s);
}
// when we invoke printTwice, we have to provide a single argument with type String. 
printTwice("Don't make me say this twice!");
// when you invoke a method, the argument you provide are assigned to the parameters. In this example, the argument "Don't make me say this twice!" is assigned to the parameter s. 
// this is called parameter passing, because the value gets passed from outside the method to the inside. 

// an argument can be any kind of expression, so if you have a String variable, you can use it as an argument. 
String argument = "Never say never.";
printTwice(argument);
// this is basically passing the variable instead of the whole string. 
// the value you provide as an argument must have the same type as the parameter. For example, if you try:
printTwice(2); // this will generate an error.

// 3.9 Stack diagrams:
// parameters and other variable only exist inside their own methods. Whitin the confines of main, there is no such thing as s. 

// Stack diagram: is a simple way of keeping track of where each variable is defined. 
// this is a modified version of a stack diagram refer to page 53:
main : argument : "Never say never."

printTwice : s : "Never say never."

// for each method there is a gray box called a frame that contains the method's parameters and variavle. The name of the method appears outside the frame. As usual, the value of exh variavle is drawn inside a box with the name of the variavle beside it. 

// 3.10 Methods with multiple parameters:
// the syntax for declaring and invoking methods with multiple parameters is a common source of errors. 
	// remeber that you have to declare the type of every parameter. i.e:
	public static void printTime(int hour, int minute) {
		System.out.print(hour);
		System.out.print(":");
		System.out.println(minute);
	}
// another common source of confusion is that you do not have to declare the types of arguments. The following is wrong!
	int hour = 11;
	int minute = 59;
	printTime(int hour, int minute); // wrong
// in this case, Java can tell the type of "hour" and "minute" by looking at their declarations. It is not necessary to include the type when you pass them as arguments. The correct syntax is printTime(hour, minute).

// 3.11 Methods that return values:

// what happends if you invoke a method and you don't do anything with the result (i.e. you don't assign it to a variable or use it as part of a larger expression)?
// what happend if you us a print method as part of an expression, like System.out.println("boo!") + 7

// 3.12 Glossary
	//initialization: A statement that declares a new variable and assigns a value to it at the same time.
 
	//floating-point: A type of variable (or value) that can contain fractions as well as integers. The floating-point type we will use is double.
 
	//class: A named collection of methods. So far we have used the Math class and System class, and we have written classes named Hello and NewLine.
 
	//method: A named sequence of statements that performs a useful function. Methods may or may not take parameters, and may or may not return a value. 
 
	//parameter: A piece of information a method requires before it can run. Parameters are variables: they contain values and have types.
 
	//arguments: A value that you provide when you invoke a method. This value must have the same type as the corresponding parameter.
 
	//frame: A structue (represented by a gray box in stack diagrams) that contains a method's parameters and variables.

	//invoke: cause a method to execute. 

// 3.13 Exercises:
	// 1. Draw a stack frame that shows the state of the program in section 3.10 when main invokes printTime with the arguments 11 and 59.
	// 2. The point of this exercise is to practice reading code and to make sure that you understand the flow of execution through a program with multiple methods.
		// What is the output of the following program? Be precise about where there are spaces and where there are newline.
		// HINT: Start by describing in words what pint and baffle do when they are invoked.
		// Draw a stack diagram that shows the state of the program the first time ping is invoked. 

public static void zoop() {
	baffle();
	System.out.print("You wugga ");
	baffle();
}

public static void main(String[] args) {
	System.out.print("No, I ");
	zoop();
	Systme.out.print("I ");
	baffle();
}

public static void baffle() {
	System.out.print("wug");
	ping();
}

public static void ping() {
	System.out.println(".");
}

// output:
No, I wug.
You Wugga wug.
I wug.
// this is cool because all of the different methods call each other and it really makes you follow them.

	// 3. The point of this exercise is to make sure you understand how to write and invoke methods that take parameters.
		// Write the first line of a method named zool that takes three parameters: an int and two strings.
		// Write a line of code that invokes zool, passing as arguments the value 11, the name of your first pat, and the name of the street that you grew up on. 

public class exercise3_3 {
	public static void zool(int value, String petName, String street) {
		System.out.println(value);
		System.out.println(petName);
		System.out.println(street);
		// so I tried System.out.println(value, petName, street) and it throws an error. you have to print out variables speratly. this is not that bad.
		System.out.println(value + petName + street); // this will work to print out all of the arguments in one invoked method.  
	}

	public static void main(String[] args) {
		//invokes zool with the parameters. 
		zool(11, "Manhatten", "32785 North Roundhead dr.");

	}
}

	// Exercise 3.4: The purpose of this exercise is to take code from a previous exercise and encapsulate it in a method that eakes parameters. You should stat with a working solution to Exercise 2.2:
		// 1. Write a method called printAmerican that takes the day, date, month and year as parameters and that prints them in American format.
		// 2. Test your method by invoking it from main and passing apporpriate arguments. The output should look something like this (except that the date might be differnt):
			Saturday, July 16, 2011
		// 3. Once you have debugged printAmerican, write another method called printEuropean that prints the date in European format.

public class exercise 3_4 {

	public static void printAmerican(String day, int date, String month, int year) {
		System.out.print(day + ", " + month + " " + date + ", " + year);
	}

	public static void printEuro(String day, int date, String month, int year) {
		System.out.print() // I am not to sure what Euro format is so i am not going to do this exercise right now. 
	}

	public static void main(String[] args) {
		printAmerican("Saturday", 16, "November", 2013);
	}

}

// Great work you now have a formate that you can study and get through all of the differnt chapters. On to chapter 4. 












































