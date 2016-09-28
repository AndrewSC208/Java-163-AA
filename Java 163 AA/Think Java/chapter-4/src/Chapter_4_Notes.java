// These are the chapter four notes
// CONDITIONALS AND RECURSION

// 4.1 The modulus operator:
// The modulus operator works on integers (and integer expressions) and yields the reaminder when the first operand is divided by the second.
// The java modulous operator is a percent sign, %. The syntax is the same for otheer operators:
	int quotient = 7/3; // yields 2
	int remainder = 7 % 3; // yields 1. thus,7 divided by 3 is 2 with 1 left over. 
// usefull to find out if one number is divisible by another number. 
// also, you can use the modulus operator to extract the rightmost digit of digits from a number. 
	// i.e:
	x % 10 // yields the right most digit of x (in base 10). 
	x % 100 // yields the last two digits. 

// 4.2 Conditional execution:
// conditional statements allow us to compare and evaluate things:
	// the simplest for of a conditional statement is the if statement:
	if (x > 0) {
		System.out.println("x is positive");
	}

// if the statement is true then the statement in the brackets is executed. Pretty straight forward! If the statement is not true then nothing happens.
// relational operators are:
	x == y   // x equals y
	x != y 	 // x not equal to y
	x > y    // x greater than y
	x < y    // x less than y
	x >= y   // x greater than or equal to y
	x <= y 	 // x less than or equal to y
// the two sides of the comparison have to be the same. int's to int's can't do string's to int's 
// The operators == and != work with Strings, but they don't do what you expect. And the other realational operators don't do anything at all. 

// 4.3 Alternative execution:
// A second for of conditional execution is alternative execution, in which there are two possibilities, and the condition determines which one gets executed. The syntax looks like this:
	if ( x%2 == 0) {
		System.out.println("x is even");
	} else {
		System.out.println("x is odd");
	}

// As an aside, if you think that you might want to check the parity (evenness or oddness) of numbers often, you might want to "wrap" this code up in a method, as follows:
	public static void printParity(int x) {
		if (x%2 == 0) {
			System.out.println("x is even");
		} else {
			System.out.println("x is odd");
		}
	}
	// now you have a method named printParity that will print an appropriate message for any integer you care to provide. In main you would invoke this method like this:
		printParity(17);
		// always remeber that when you invoke a method, you do not have to declare the types of the arguments you provide. Java can figure out what type they are. You should resist the temptation to write thrings like:
		int number = 17;
		printParity(int number); // this is wrong


// 4.4 chained conditionals
// Sometimes you want to check for a number of related conditions and choose one of several actions. One way to do this is by chaining a series of ifs and elses:
	if (x > 0) {
		System.out.println("x is positive");
	} else if ( x < 0) {
		System.out.println("x is negative");
	} else {
		System.out.println("x is zero");
	}

// 4.5 Nested conditionals: 
// In addition to chaining, you can also nest one conditional within another.
// We could have written the previous example as:
	if ( x == 0) {
		System.out.println("x is zero");
	} else {
		if (x > 0) {
			System.out.println("x is positive");
		} else {
			System.out.println("x is negative");
		}
	}
	// There is now an outer conditional that contains two branches. The first contains a simple print statement, the second contains another conditional statement, which has two branches that determin wheather x is positive or negative. 

// 4.6 The return statement:
// The return statement allows you to terminate the execution of a method before you reach the end. One reason to use it is if you detect an error condition:
	public static void printLogarithm(double x) {
		if (x <= 0.0) {
			System.out.println("Positive number only, please.");
			return;
		}

		double result = Math.log(x);
		System.out.println("The log of x is " + result);
	}
	// This defines a method named printLogarithm that takes a double names x as a parameter. It checks whether x is less than or equal to zero, in which case it prints an error message and then uses return to exit the method. The flow of execution immediately returns to the caller and the remaining lines of the method are not executed. 
	// I used a floating-point value on the right side of the condition because there is a floating-point on the left.

// 4.7 Type conversion:
// You might wonder how you can get away with an expression like "The log of x is " + result, since one of the operands is a String and the other is a double. In this case Java is being smart on out behalf, automatically converting the double to a String before it does the string concatenation. 

// 4.8 Recursion:
// I mentioned in the last chapter that it is legal for one method to invoke another, and we have seen several examples. I neglected to mention that it is also legal for a method to invoke itself. It may not be obvious why that is a good thing, but it turns out to be one of the most magical and interesting things a program can do.
	// i.e:
	public static void countdown(int n) {
		if (n == 0) {
			System.out.println("Blastoff!");
		} else {
			System.out.println(n);
			countdown(n-1);
		}
	}
	// The name of the method is countdown and it takes a single integer as a parameter. If the parameter is zero, it prints the word "Blastoff" Otherwise, it print the number and then invokes a method named countdown --itself-- passing n-1 as an argument.

	// what happens if we invoke this method, in main, like this:
	countdown(3);
	// the total output is:
	3
	2
	1
	Blastoff!

// As a second example, let's look again at the methids newLine and threeLine.
	public static void newLine() {
		System.out.println("");
	}

	public static void threeLine() {
		newLine(); newLine(); newLine();
	}
// Although these work, they would not be much help if we wanted to print 2 newLines, or 106. A better alternatice would be:
	public static void nLines(int n) {
		if (n > 0) {
			System.out.println("");
			nlines(n-1);
		}
	}
	// This program is similar to countdown; as long as n is greater than zero, it prints a newline and then invokes itself to print n-1 additional newlines.

// 4.9 Stack diagrams for recursive methods:
// the following is a stack diagram for countdown, called with n = 3: see page 64 for visual:
	main : 
	countdown: n : 3
	countdown: n : 2
	countdown: n : 1
	countdown: n : 0

	// The bottom of the stack, countdown with n=0 is called the base case. It does not make a recursice call, so there are no more frames for countdown.
	// The frame for main is empty because main does not have any parameters or variables. 

// 4.10 Glossary:

//modulus: An operator that works on integers and yields the remainder when one number is divided by another. In Java it is denoted with a percent sign (%).

// conditional: A block statements that may or may not be executed depending on some condition. 

// chaining: A way of joinging several conditional statements in sequnce.

// nesting: putting a conditional statement inside one or both branches of another conditional statement.

// typecast: an operator that converts from one type to another. In java it appears as a type name in parentheses, link (int).

// recursion: The process of invoking the same method you are currently executing.

// base case: A condition that causes a recursive method not to make a recursive call.

// 4.11 Exercises:
	// 4.1: Draw a stack diagram that shows the state of the program in section 4.8 after main invokes nLines with the parameter n=4, just before the last invocation of nLines returns. 

	// 4.2: review of flow of execution:
	public class Buzz {

		public static void baffle(String blimp) {
			System.out.println(blimp);
			zippo("Ping", -5);
		}

		public static void zippo(String quince, int flag) {
			if (flag < 0) {                                     //2
				System.out.println(quince + "zoop");            //3
			} else {
				System.out.println("ik");
				baffle(quince);
				System.out.println("boo-wa-ha-ha");
			}
		}

		public static void main(String[] args) {
			zippo("rattle",13);                                  //1
		}

	}
	// 1. Write the number 1 next to the first statement of this program that will be executed. Be careful to distinguish things that are statements from things that are not. 
	// 2. Write the number 2 next to the second statement and continue until you get throught the whole program. 
		// Okay, so I fugured it out I was not understanding that quince was being passed as a variable and not a string. This changed the whole problem for me and I was able to follow the flow of the whole program. I dont think it was that hard I just had to make sure that I am following the variables correctly.
	// 3. What is the value of the parameter blimp when baffle gets invoked?
		// rattle
	// 4. What is the output of this program?
		// I made the program and have it saved. 

// I need go back to this and make sure that I am able to follow the flow of following the flow of a method. 
// I need to find the answer to this problem I am not sure what is going on with it. 

// exercise 4.4: What is the output of the following program?
	public class Narf {

		public static void zoop(Sting fred, int bob) {
			if (bob == 5) {
				ping("Not ");
			} else {
				System.out.println("!");
			}
		}

		public static void main(String[] args) {
			int bizz = 5;
			int buzz = 2;
			zoop("just for", bizz);
			clink(2*buzz);
		}

		public static void clink(int fork) {
			System.out.print("It's ");
			zoop("breakfast ", fork);
		}

		public static void ping(String strangStung) {
			System.out.printl("any " + strngStrung + "more ");
		}

	}

	// I understand that I need to leatn the flow of all of these programs but really all of these random names are really hard to follow and also I don't see the relavence of have zoop and boop and all of these different random methods for me to follow. However, I did figure it out and that is all that matters. 

	*****************

	// exercise 4.5: Fermat's theorem says that there are no integers a, b, and c such that: a^n + b^n = c^n
	// except in the case when n = 2

	// Write a method named chechFermat that takes four integers as parameters a,b,c and n-- and that checks to see if Fermat's theorem holds. If n is greater than 2 and it turns out to be true that a^n + b^n = c^n, the program should print "Holy smokes, Fermat was wrong!" Otherwise the program should print "No, that doesn't work."

	// You should assume that there is amethod named raiseToPow that takes two ints as arguments and raises the first argument to the power of the second. For example:
		int x = raiseToPow(2, 3);

		//would assign the value 8 to x, because 2^3 = 8;

	public class ex4_5 {
	
	public static void checkFermat(int a, int b, int c, int n) {
		if (n > 2) {
			int x = raiseToPow(a,n);// this is what I was told to use instead of math.pow(x,n);
			int y = raiseToPow(b,n);
			int z = raiseToPow(c,n);
			if (x + y == c) {
				System.out.println("Holy crap Fermat's therom is wrong!");
			} else {
				System.out.println("No, that doesn't work!");
			}
		} else {
			System.out.println("Only powers that are above 2 please!");
		}
	}

	public static void main(String[] args) {
		checkFermat(5,10,3,5);
	}
}

	// this was super easy! I was actually able to do it. This will evaluate all of the parameters that the program needs to. I could put Math.pow(x,n) in to actually make the program work but right now I think that I just need to get used to writing the code. Well this chapter was a lot of fun I am not going to lie. I now see why I need to take so many math classes it all about problem solving, not how to write the program. This actually makes sens to me. 
	*******************






















