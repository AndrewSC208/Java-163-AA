// Chapter 6
// Value Methods

// 6.1 Return Values
// Some of the methods we have used, like the Math functions, produce results. That is, the effect of invoking the method is to generate a new value, which we usuallu assign to a variable or use as part of an expression. I.e:
	double e = Math.exp(1.0);
	double height = radius * Math.sin(angle);
// but so far all of of our mathods have been void. Meaning that they do not return anythong. 
// when you invoke a void method it is typically on a line by itself like:
	countdown(3);
	nLines(3);
// value Methods: These are methods that returns a value. 
// The first i.e is area, which takes a double as a parameter, and returns the area of a circle with the given radius: 
	public static double area(double radius) {
		double area = Math.PI * radius * radius;
		return area;
	}

	// The fist thing you should notice is that the beginning og the method definition is different. Instead of public static void, which indicates a void method. We see public static double, which means that the return value from this method is a double. 

// The last line is a new form of the return statement that includes a return value. 

// This statement means, "return immediately from this method and use the following expression as the return value." the expression you provide can be arbitrarily complicated, so we could have written this method more concisely:

		public static double area(double radius) {
			return Math.PI * radius * radius;
		} // this will return the area.
// on, the other hand, temporary variable like area often make debugging easier. In eith case, the type of the epression in the return statement must match the return type of the method. In other words, when you declare that the return type is a double, you are making a promise that this method will eventually produce a duble. If you try to return with no expression or an expression with the wrong type, the compiler will take you to task.

// Sometime it is useful to have multiple return statements, one in each branch of a conditional:
		public static double absoluteValue(double x) {
			if (x < 0) {
				return -x;
			} else {
				return x;
			}
		}
// Since these return statements are in an alternative conditional, only one will ve executed. Although it is leal to have moew than one return statement in a method, you should keep in mind that as soon as one is executed, the method, you should keep in mind that as soon as one is executed, the method terminates without executing any subseqent statements. 

// dead code: code that appears after a return statement, or any place else where it can never be executed. 

// If you put return statements inside a conditional, then you have to guarantee that every possible path throught the program hits a return statement. 

// i.e:
	public static double absoluteValue(double x) {
		if (x < 0) {
			return -x;
		} else if (x> 0) {
			return x;
		}
	}  						// wrong!!

	// this program is not legal because if x is 0, neither condition is true and the method ends without hitting a return statement. 

// 6.2 Program Development:
// Incremental development
	// example, imagine you want to find the distance between two points giben by the coordinates: square root of : (x(2)-x(1))^2 + (y(2) - x(1))^2
	// the first step is to consider what a distance method should look like in Java.
	// In other words, what are the inputs (parameters) and what is the output (return value).
	// Outline of the of the method:
	public static double distance (doublex1, double y1, double x2, double y2) {
		return 0.0; // this is a placeholder, so that the program can be compiled.
	} 

	// to test we have to invoke it in main with sample values:

	double dist = distnace(1.0, 2.0, 4.0, 6.0);

	// the next step is to find the difference of x(2)-x(1) and y(2)-y(1) I store those walues in temporary variavles named dx and dy.
	public static double distance(double x1, double y1, double x2, double y2) {
		double dx = x2 - x1;
		double dy = y2 - y1;
		System.out.println("dx is " + dx);
		System.out.println("dy is " + dy);
		return 0.0;
	}
	// print statements are add so that we can check out work.
	// when the method is finished the print statements will be removed. It is called scaffolding.

	// the next step is to square dx and dy.

	public static double distance( double x1, double y1, double x2, double y2) {
		double dx = x2 - x1;
		double dy = y2 - y1;
		double dsquared = dx*dx + dy*dy;
		System.out.println("dsquraed is " + dsquared);
		return 0.0;
	}

	// again I would compile and run the program at this stage and check the intermediate value. (should be 25.0)

	// Finally, we can use Math.sqrt to compute and return the result.

	public static double distance(double x1, double y1, double x2, double x1) {
		double dx = x2 - x1;
		double dy = y2 - y1;
		double dsquared = dx*dx + dy*dy;
		double result = Math.sqrt(dsquared);
		return result;
	}
	// in main we can print and check the value of the result. 

	// incramental development can save a lot of time.
	// start with small programms and make changes from their.
	// use temp variables to hold intermediate values so you can print and check them.
	// once the program is working, you can remove scaffolding and consolidate multiple statements into compund expressions, but only if it does not make the program difficult to read. 

// 6.3 Composition:
// once you define a new method, you can use it as part of an expression, and you can build new methods using existing methods. 
	// example: lets say the center point is stored in the variablex xc and yc, and the perimeter point is in xp and yp. 

	// fisrt step: Find the radius of the circle, which is the distance between the two points:
	double radius = distance(xc, yc, xp, yp);
	// the second step is to find the area of a circle with the radius, and returned it:
	double area - area(radius);
	return area;
	// wrapping that all up in a method, we get:
	public static double circleArea(double xc, double yc, double xp, double yp) {
		double radius = distance(xc, yc, xp, yp);
		double area = area(radius);
		return area;
	}
	// The temporary variable radius and area are useful for development and debugging, but once the program is working we can make it more concise by composing the method invocations:

	public static double circleArea(double xc, double yc, double xp, double yp) {
		return area(distance(xc, yc, xp, yp));
	}

// 6.4 overloading:
// you might have noticed that circleArea and area perform similar funcitons-- finding the area of a circle -- but take different parameters. For area, we have to provide the radius, for circleArea we provide two points. 

// if two methods do the same thing, it is natural to give them the same name. Having more than one method with the same name, which is called overloading, is legal in Java as long as ech version takes different parameters. 

	// so, we could rename circleArea:
	public static double area(double x1, double y1, double x2, double y2) {
		return area(distance(xc, yc, xp,yp));
	}
	// when you invoke an overloaded method, Java whick version you want by looking at the arguments that you provide. if you write:
	double x = area(3.0);
	// Java looks for a method named area that takes one double as an argument, and so it uses the first version, which interprests the argument as a radius, if you write:
	double x = area(1.0, 2.0, 4.0, 6.0);
	// java uses the second versino of area. And notice that the second version of area actually invokes the first. 

// many Java methods are overloaded, ,eaning that there are different versions that accept different numbers or types of parameters. For example, there are versions of print and println that accept a single parameter of any type. 

// in the math class, thre is a version of abs that works on doubles, and there is also a version for ints.

// 6.5 Boolean expressions: page 62.
	// the exeptions we have seen are the relational operators, which compare ints and floats and returneither true or false .

	// true and false are special values in Java, and togerher they make up a type called boolean.
	// boolean expressions and variables work just like other types of expressions and variables:
	boolean flag;
	flag = true;
	boolean testResult = false;

	// the result of a conditional operator is a boolean, so you can store the result of a comparison in a variable:

	boolean evenFlag = (n%2 == 0); // true if n is even
	boolean positiveFlag = (x > 0); // true if x is positive 

	// also you can use it as part of a conditional statement later:
	if (evenFlag) {
		System.out.println("n was even when I checked it");
	}

	// a variable used in this way is called a flag because it flags the presence of absence of some condition.

// 6.6 logiacal operators: page 63 
	//There are three logical operators in Java: AND(&&), OR (||), NOT (!)
	// The semantics of these operatores is similar to their meaning in English	
	// for exaple x > 0 && x < 10 is true only if x is greater than zero AND less than 10.

	evenFlag || n%3 == 0; // is true if either of the condition is true, that is, if evenFlag is true OR the number is divisible by 3. 

	// Finallyn the NOT operator invers a boolean expression, so !evenFlag is true is evenFlag is false -- if the number is odd. 

	// Logical operators can simplify nested conditinal statements. For example, can you re-write
	if ( x > 0) {
		if (x < 10) {
			System.out.println("x is a positive single diget.");
		}
	}

	// rewritten:

	if ( x > 0 && x < 10) {
		System.out.println("x is a positive single digit.");
	}
	// thsi is a lot more simple. 

// 6.7 Boolean methods: 
	// Methods can return boolean values just like any other type, which is often convenient for hiding tests inside methods. ie:
	public static boolean isSingleDigit(int x) {
		if (x >= 0 && x < 10) {
			return true;
		} else {
			return false;
		}
	}

	// the name if this method is inSingleDigit. It is common to give boolean methods names that sound like yes/no questions. The return type is boolean, which means that every return statement has to provide a boolean expression. 

	// the code is straightforward, although it it longer than it needs to be. 

	// remember that the expression x >= 0 && x < 10 has type boolean, so there is nothing wrong with returning it directly and avoiding the if statement altogether.

	public static boolean isSingleDigit(int x) {
		return (x >= 0 && x < 10);
	}
	// in main you can invoke this mathod in the usual ways:

	boolean bigFlag = !isSingleDigit(17);
	System.out.println(isSingleDigit(2));

	// The first line sets bigFlag to true only if 17 is not a single-digit number.
	// The second line prints true because 2 is a single-digit number.

	// The most common use of boolean methods is inside conditional statements
	if (isSingleDigit(x)) {
		System.out.println("x is little");
	} else {
		System.out.println("x is big");
	}

// 6.8 More Recursion:
	// Turning complete: programming language, which means that we can smpute anything computable, for any reasonable definition of "computable." This idea was developed by Alonzo Church and Alan Turning, si it is known as the Church-Turning thesis. 
	// A resursive definition is similar to a circular definition, in the sense that the definition contains a reference to the thing being defined.
	// A turly circular definition is not very useful:

	// recursive: an objective used to describe a method that is recursive.

	// definition of the mathematical function factorial:
		0! = 1
		n! = n*(n-1)!

		// (Factorial is usually denoted with the symbol !, which is not to be confused with the logical operator ! which means NOT.)
	// factorial of 0 is 1, and the factorial of any other value, n, is n multiplied by the factorial of n -1. so 3! is 3 times 2!, which is 2 times 1!, which is 1 times 0!. Putting it all together, we get 3! equal to 3 times 2 times 1 times, which is 6. 

	// If you can write a recursive definition of something, you can usually write a Java method to evaluate it. The first step is to decide what the parameters are and what the return type is. 

	// Since factorial is defined for integers, the method takes an integer as a parameter and returns an integer:

		public static int factorial(int n) {

		}
		// if the argument happens to be zero, return 1:

		public static int factorial(int n) {
			if (n == 0) {
				return 1;
			}
		}
		// that's the base case. 
		// Otherwise, and this is the interesting part, we have to make a recursive call to find the factorial of n - 1, and then multiply it by n.
		public static int factorial(int n) {
			if (n == 0) {
				return 1;
			} else {
				int recurse = factorial(n-1);
				int result = n * recurse;
				return result;
			}
		}














































