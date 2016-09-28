
public static class Ch6Notes {
	public static void main(Sting[] args)
}

// Learning about the loop Structure:
	// Loop: is a structure that allows repeated execution of a block statement. With-in a looping structure, a Boolean expression is evaluated. If it is true, a block of statement called the loop body executes and the boolean expression is evaluated again. 
	// Iteration: One execution of any loop.
	// While loop: in which the loop-controlling boolean expression is the first statement in the loop
	// A for loop: is usually used as  concise format in which to execute loops
	// do... while loop: used in which the loop-controlling boolean expression is the last statement in the loop.
// Creating while loops:
	// while loop: to execute a body of statement continually as long as the Boolean expression that controls entry into the loop continues to be true.
		// you can use a while loop when you need to perform a task a certain number of times. this is a definite loop.
		//indefinite loop: you don't know how many times a loop is going to run.
	//Writing a definite while loop:
		// to write a definite loop, you initialize a loop control variable, a variable whose value is determines whether loop execution continues. 
		
		// example:
		int val; // loop control variable
		final int LIMIT = 11; 

		val = 1;
		while(val < LIMIT) { // loop control variable tested
			System.out.println(val);
			val = val + 1; // loop control variable altered. 
		}

	// Infinite Loop: A loop that never ends.

	// It is very common to alter the value of a loop control variable by adding 1 to it.

// writing an indefinite while loop:
	// example: 

	import java.util.Scanner;
	public class BankBalance {
		public static void main(String[] args) {
			double balance;
			String reponse;
			char responseChar;
			int tempBalance;
			int year = 1;
			final double INT_RATE = .3;
			Scanner keyboard = new Scanner(System.in);

			System.out.print("Enter initial bank balance > ");
			balance = keyboard.newDouble();
			keyboard.nextLine();
			System.out.println("Do you want to see next year's balance?");
			System.out.println("Enter y or n >");
			response = keyboard.nextLine();
			responseChar = response.charAt(0);

			// while loop:
			while(responseChar == 'y') {
				balance = balance + balance * INT_RATE;
				tempBalance = (int)(balance * 100);
				balance = tempBalance / 100.0;
				System.out.println("After year " + year + " at " + INT_RATE + " interest rate, balance is $" + balance);
				year = year + 1;

				System.out.print("Do you want to see the balance " + "\nat the end of another year? y or n? >");
				response = keyboard.nextLine();
				responseChar = response.charAt(0);
			}

		}
	}

// Using shortcut arithmetic operators:
	count = count + 1; or count += 1;
	count = count * 2; or count *= 2;

// prefix postfix operators:
	i = 1;
	i ++; // now equals 2
	i --; // now equals 0 

	// Increment Demo:
	public class IncrementDemo {
		public static void main(String[] args) {
			int myNumber, answer;
			myNumber = 17;

			System.out.println("Before incrementing, myNumber is " + myNumber);

			answer = ++myNumber;
			System.out.println(" and answer is " + answer);
			myNumber = 17;

			System.out.println("Before incrementing, myNumber is " myNumber);
			answer = myNumber++;
			System.out.println("After postfix increment, myNumber is " + myNumber);
			System.out.println(" and answer is " + answer);
		}
	}

// Creating a for loop:
	// For loop: is a special loop that is used when a definite number of loop iterations is required. It provides a convenient way to create a counter-controlled loop. 
	// you begin the for loop with the keyword for followed by a set of parentheses
		// within the parentheses there are three items that are required:
			// Initializing the loop control variable
			// Testing the loop control variable.
			// Updating the loop control variable.
	// for loop example:
		for(int val = 1; val < 11; ++val) 
			System.out.println(val);

			int val = 1;
			while(val < 11) {
				System.out.println(val);
				++val; 
			}

	// different things that you can do with for loops:
		// Initialization of more than one variable by placing commas between the separate statements, as in the following:
			for(g = 0, h = 1; g < 6; g++)

		// performace of more than one test using AND or OR operators, as in the following:
			for(g = 0; g < 3 && h > 1; g++)

		// derementation or performacne of some other task, as in the following:
			for(g = 0; g < 10; ++g, ++h sum += g)

		// you can leave leave one or more portions of a for loop empty, althought the two semicolons are still required as placeholders. 
			for(; x < 10; ++x)

		// every once in a while you will encounter a for loop that contains no body, such as the following:
			for(x = 0; x < 100000; ++x);
				// this kind of loop exists simply to use time - that occupy the central processing unit for thousands of processing cycles - when a brief pause is desired during program execution. 

// Learning how and when to use a do..while loop:
	// both while loops and for..loops are pretest loops: they test the evaluation before the loop is completed.
	// to make sure that the loop executes at least one time you would write a do..while loop
		// the parameters of a value is checked after the loop completes one iteration of the loop. 
			// this is called a post-test loop.

	// example: bank balance 2:
		import java.util.Scanner;
		public class BankBalance2 {
			public static void main(String[] args) {
				double balance;
				String reponse;
				char responseChar;
				int tempBalance;
				int year = 1;
				final double INT_RATE = .03;
				Scanner keyboard = new Scanner(System.in);

				System.out.print("Enter initial bank balance > ");
				balance = keyboard.nextDouble();
				keyboard.nextLine();

				// this is the do while loop:
				do {
					balance = balance + balance = * INT_RATE;
					tempBalacne = (int)(balance * 100);
					balance = tempBalacne / 100.00;
					System.out.println("After year " + year + " at " + INT_RATE + " interest rate, balance is $" + balance);
					year = year + 1;
					System.out.print("Do you want to see the balance? " + " \nat the end of another year? y or n > ");
					response = keyboard.nextLine()
					responseChar = response.charAt(0);
				} while(reponseChar == 'y');
			}
		}

	// this is a very effective way to use the do..while loop so that you execute one iteration of the loop and then check to see if the loop runs again.
	// when he body of a do..while loop contains a single statement, you do not need to use curly braces to block the state.
		// Example:
		do 
			total += numberValue;
		while(total < 200);

		// or you can write it like this to make it more clean an easy to read:

		do {
			total += numberValue;
		} while(tota < 200);
		// I personally feel that this is a much better way to write and read the loop.

// Learning about nested loops:
	// when loops are nested each contains an inner loop and an outer loop. 
	// this is an example that shows a bank balance that varies in years and interest rates:
		import java.Util.Scanner;
		public class BankBalanceRateAndYear {
			public static void main(String[] args) {
				double initialBalance;
				double balance;
				int year;
				double interest;
				final double LOW = .02;
				final double HIGH = .05;
				final double INCREMENT = .01;
				final int MAX_YEAR = 4;
				// Set up the scanner class;
				Scanner keyboard = new Scanner(System.in);

				System.out.print("Enter initial bank balance > ");
				initialBalance = keyboard.nextDouble();
				keyboard.nextLine();

				// this is the beginning of the nested loop:
				for(interest = initialBalance = LOW; interest <= HIGH; interest += INCREMENT) {
					balance = initialBalance;
					System.out.prinln("\nWith an initial balance of $" + balacne + " at interest rate of " + interest);

					for(year = 1; year <= MAX_YEAR; ++ year) {
						balance = balance + balance * interest;
						System.out.println("After year " + year + " balance is $" + balance);
					}
				}
			}
		}

		// Nested loops are the very wicked thing that you need to learn. You need to make sure that you see how all of the iterations work and be able to check the output and variables values at all time. 

// Improving loop Performance: Improve loop performance by doing the following:
	// Making sure the loop does not include unnecessary operations or statements.
	// Consider the order of evaluation for short-circuit operators
	// Making a comparison to 0
	// employing loop fusion

		// Avoiding Unnecessary Operations:
			// you could write a loop like this:
				while(x < a + b) {
					// this would work but if the loop runs 1000 times then a + b would calculated 1000 times and this is not very effective.
				}
			// write the loop like this instead:
				int sum = a + b;
				while( x < sum) {
					// body of the loop
					// do you see how this will cut down on the amount of work that the loop would have to do.
				}
			// Similarly try to avoid calling a method inside a loop. For example if a method getNumberOfEmployees() always returns the same value then assign that value to a variable and then use that inside the loop. This will cut down on the amount of times the methods is called. 

		// Considering the order of evaluation of short-circuit operators:
			// when a loop might execute many times, it becomes increasingly important to consider the number of evaluations that take place. 

		// Comparing to zero:
			// making comparisons to 0 is faster than making comparisons to any other value. 
				// therefore if you can make a comparison to 0 over any other value do that. 

		// Employing looping fusion:
				// Loop fusion: is the technique of combining two loops into one.
					// for example: suppose you want to call two methods 100 times each. you can set a constant named times to 100 and use the following code:
					for(int x = 0; x < TIMES; ++x)
						method();
					for(int x = 0: X < TIMES; ++x)
						method2();

					// however you can write the same code:
					for(int x = 0; x < TIMES; ++x) {
						method1();
						method2();
					}

				// fusion looping will not work in every situation; sometimes all the activities for method1() must be finished before those in method2() can begin.































