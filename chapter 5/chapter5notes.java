// chapter 5 notes
// Notes:

	/*
		1. Planning Decision-Making Logic:
			A. pseudo-code: A tool that helps them plan a program's logic by writing plain English statements. Pseudo-code requires that you write down the steps needed to accomplish a given task.
				* A flowchart is similar to pseudo-code but your write the steps in diagram form, as a series of shapes connected by arrows.
		2. The if and if... else structures:
			A. if Statement: The simplest statement you can use to make a decision.
	*/
			if(quizScore == 10)
				System.out.println("The score is perfect");

	/*
			B. Pitfall: Misplacing a Semicolon in an if Statement:
				1. there is no semicolon at the end of the first line of the if statement because the statement does not end there. 
					i.e: (quizScore == 10)
			C. Pitfall: Using the assignment operator instead of the equivalency operator:
				1. An alternative to using a Boolean expression in an if statement, such as quizScore == 10, is to store the Boolean expression's value in a Boolean variable. 
					i.e:
	*/
					isPerfectScore = (quizScore == 10);

					// then you can write:
					if(isPerfectScore)
						System.out.println("The core is perfect");

					// this adds an extra step to the program, but makes the if statement more similar to an English-language statement.
	/*
			D. Pitfall: Attempting to compare objects using the relational operators:
				1. You can use the standard relational operators (==, <, >, <=, >=, and !=) to compare the values of primitive data types such as int and double. However, you cannot use <, >, <=, or >= to compare objects; a program containing such objects does not compile. 

		2. The if ... else Structure:
			if(quizScore == 10)
				System.out.prinln("The score is perfect");
				// this is called a single alternative, because you only perform an action, or not, based on one alternative;

				// A dual-alternative if: is the decision structure you use when you need to take one or the other of two possible courses of action.
	*/
			if(quizScore == 10)
				System.out.println("The score is perfect");
			else
				System.out.println("No, it's not");
			// only one or the other is going to run.
	/*
		3. Using Multiple Statements in an if or if... else structure:
			A. To execute more than one statement that depends on the evaluation of a Boolean expression, you use a pair of curly braces to place the dependent statement within a block.
	*/
			if(hoursWorked > FULL_WEEK) {
				regularPay = FULL_WEEK * rate;
				overtimePay = (hoursWorked - FULL_WEEK) * OT_RATE * rate;
			}

	// This is example 5-8

			import java.util.Scanner;
			public class Payroll {
				public static void main(String[] args) {
					// variables
					double rate;
					double hoursWorked;
					double regularPay;
					double overtimePay;
					final int FULL_WEEK = 40;
					final double OT_RATE = 1.5;
					// Creating keyboard scanner object:
					Scanner keyboard = new Scanner(System.in);
					// Getting hours worked from user:
					System.out.print("Hour many hours did you work this week? ");
					hoursWorked = keyboard.nextDouble();
					// Getting pay rate from user:
					System.out.print("What is your regular pay rate? ");
					rate - keyboard.nextDouble();
					// if statement:
					if(hoursWorked > FULL_WEEK) {
						regularPay = FULL_WEEK * rate;
						overtimePay = (hoursWorked - FULL_WEEK) * OT_RATE * rate;
					} else {
						regularPay = hoursWorked * rate;
						overtimePay = 0.0;
					}

					System.out.prinln("regular pay is " + regularPay + "\nOvertime pay is " + overtimePay);
				}
			}

			// When you block statements, you must remember that any variable you declare within a block is local to that block.
			//i.e:

			if(a == b) {
				int sum = a + b;
				System.out.println("The two variables are equal");
			}
			System.out.prinln("The sum is " + sum);
			// sum is not a declared variable that is in this block and this will not compile. Make sure that if you need to use the variable outside of the block that you declare it in the parent block. 
	/*
		4. Nesting if and if... else Statements:
			A. within an if or else, you can code as many dependent statements as you need, including other if and else structures. 
				1. Statements in which an if structure is contained inside another if structure are commonly called nested if statement. 
				2. Nested if statements are particularly useful when two conditions must be met before some action is taken. 
	*/
				//i.e:
				final int MIN_ITEMS = 3;
				final int MIN_VALUE = 1000;
				final int SALES_BONUS = 50;
				int bonus= 0;

				if(itemsSold >= MIN_ITEMS)
					if(totalValue >= MIN_VALUE)
						bonus = SALES_BONUS;

	/* 		B. When you use nested if statements, you must pay careful attention to placement of any else clauses. 
	*/
				// i.e:
				final int MIN_ITEMS = 3;
				final int MIN_VALUE = 1000;
				final int LARGE_BONUS = 50;
				final int MEDIUM_BONUS = 25;
				final int SMALL_BONUS = 10;

				int bonus = 0;
				// this is outside if statement:
				if(itemsSold >= MIN_ITEMS)
					// this is a nested if statement:
					if(totalValue >= MIN_VALUE)
						bonus = LARGE_BONUS;
					// nested else statement
					else
						bonus = MEDIUM_BONUS;
				// outside else statement:
				else
					bonus = SMALL_BONUS;

	/*
		5. Using Logical and or or operators:
			A. for an alternative to some nested if statement, you can use the logical AND operator between two Boolean expressions to determine whether both are true. 
				1. (&&) is the syntax for the logical AND.
				i.e: 5-12 Code for bonus-determining decision using nested ifs and using the && operator:
	*/
			if(itemsSold >= MIN_ITEMS)
				if(totalValue >= MIN_VALUE)
					bonus = SALES_BONUS;

			// or you can write the same statement with the logical &&:
			if(itemsSold >= MIN_ITEMS && totalValue >= MIN_VALUE)
				bonus = SALES_BONUS;

			// When you use the && operator, you must include a complete Boolean expression on each side. 

			// If you want to set a bonus to $400 when a salesAmount is both over $1000 and under $5000 the correct statement is:

			if((salesAmount > 1000) && (salesAmount < 5000))
				bonus = 400;
				// use this statement it is more clean.
	/* 
			B. The expression on each side of the && operator are evaluated only as far as necessary to determine whether the entire expression is true or false. This feature is called short-circuit evaluation. 
				1. when you want some action to occur even if only one of two conditions is true, you can use nested if statements, or you can use the conditional OR operator, which is written as ||.

				example: If you want to give 10% discount to any customer who satisfies at least one of two conditions -- buying at least five items or buying any number of items that total at least $3,000 dollars:
	*/
				final int MIN_ITEMS = 5;
				final double MIN_VALUE = 3000;
				final double DISCOUNT = .10;
				double discountRate = 0;

				if(itemsBought >= MIN_ITEMS)
					discountRate = DISCOUNT;
				else
					if(itemsValue >= MIN_ITEMS)
						discountRate = DISCOUNT;

				// OR you can use the logical or:
				if(itemsBought >= MIN_ITEMS || itemsValue >= MIN_VALUE)
					discountRate = DISCOUNT;
				// this statement will do the same thing!

				// as with the && operator, the || operator uses shout-circuit evaluation. In other words, because only one of the Boolean expression in an || expression must be true to cause the Dependant statements to execute, if the expression to the left of the || is true, them there is not need to evaluate the expression to the right of the ||;


	/* 

		6. Making Accurate and Efficient Decisions:
			A. Range Check: is a series of statements that determine within which of a set of ranges a value falls.  

			// proper logic for evaluating three different outcomes:
	*/
			final double HIGH_LIM = 1000.00;
			final double HIGH_RATE = .08;
			final double MED_LIM = 500.00;
			final double MED_RATE = .06;
			final double LOW_RATE = .05;

			if(saleAmount >= HIGH_LIM)
				commissionRate = HIGH_RATE;
			else 
				if(salesAmount >= MED_LIM)
					commissionRate = MED_RATE;
				else
					commissionRate = LOW_RATE;

			// you can also start from the lower rate and progress to the higher rate if you know that the sales commissions are generally in the lower range to make the code more concise and improve the speed. 
	/* 
		7. Using && and || Appropriately:
			A. Make sure that you do not use and (&&) because the and was said in the description of the problem or parameters that you are trying to evaluate. This is a very common mistake. Make sure that you know the difference between && and || and learn to use them correctly. 
		8. Using the switch statement:
	*/

		//example: Display a student's class year based on a stored number:
		if(year == 1)
			System.out.println("Freshman");
		else
			if(year == 2)
				System.out.println("Sophomore");
			else
				if(year == 3)
					System.out.println("Junior")
				else
					if(year == 4)
						System.out.println("Senior");
					else
						System.out.println("Invalid year");

		// An alternative to using the series of nested if statements is to use the switch statement.
			// Switch Statement is useful when you need to test a single variable against a series of exact integer (including int,byte, and shot types), character, or string values.
			// The switch structure uses four keywords:
				// switch: Starts the structure and is followed immediately by a test expression enclosed in parentheses.
				// case: if followed by one of the possible values for the test expression enclosed in parentheses.
				// Break: optionally terminates a switch structure at the end of each case.
				// default: optionally is used prior to any action that should occur if the test variable does not match any case.

		// example: shows the switch structure used to display the four school years.

		int year;
		// Get year value from user input, or simply be assigning
		switch(year) {
			case 1:
				System.out.println("Freshman");
				break;
			case 2:
				System.out.println("Sophomore");
				break;
			case 3:
				System.out.println("Junior");
				break;
			case 4:
				System.out.println("Senior");
				break;
			default:
				System.out.println("Invalid year");
		}

		// example 2: On the other hand you might use strings in a switch structure to determine whether a supervisor name is valid:
		public static boolean isValidSupervisor(string name) {
			boolean isValid;
			switch(name) {
				case "Jones":
				case "Staples":
				case "Tejano":
					isValid = true;
				break;
				default:
					isValid = false;
			}
			return isValid;
		}

		// when several char variables must be checked an you want to ignore whether they are uppercase or lowercase, one frequently used technique employs empty case statements:

		switch(departmentCode) {
			case 'a':
			case 'A':
				departmentName = "Accounting";
				break;
			case 'm':
			case 'M':
				departmentName = "Marketing";
				break;
			// and so on for ever and ever.
		}

		
		// You are never required to use a switch structure; you can always achieve the same results with nested if statement. The switch structure is simply convenient to use when there are several alternative course of action the depend on a single integer, character, or string value.


	/*
		9. Using the conditional and NOT operators:
			A. Besides using if statements and switch structures Java provides one more way to make decision. 
				1. The conditional operator: requires three expressions separated with a question mark and a colon, and is used as a abbreviated version of the if... else structure.
	*/
				//syntax:
				testExpression ? trueTesult : falseResult;

				// The first expression (test expression): is a Boolean expression that is evaluated as true of false.
					// If it is true, the entire conditional expression takes on the value of the expression following the question mark(trueResult)
					// if the value of the testExpression is false, the entire expression takes on the value of falseResult. 
					// the conditional operator is a ternary operator: one that needs three operands. 

				// example: suppose you want  to assign the smallest price to a sale item. Let the variable a be the advertised price and the variable b be the discounted price on the sale tag. 
				// the expression for assigning the smallest cost is:
				smallerNum = (a < b) ? a : b;
				// when evaluating the expression a<b, where a is less than b, the entire conditional expression takes the value of a, which then is assigned to smallerNum. 
				// If a is not less than b, the expression assumes the value of b, and b is assigned to smallerNum.

				// You could do the same thing with the following if .. else structure:

				if(a < b)
					smallerNum = a;
				else
					smallerNum = b;
				// The advantage of using the conditional operator is the conciseness of the the statement.
	/*

			B. Using the NOT operator:
				1. You use the NOT operator, which is written as the exclamation paint (!), to negate the result of any Boolean expression. 
	*/
				//example: suppose a monthly car insurance premium is $200 if the driver is age 25 or younger and $125 if the driver is age 26 or older. 
				// Each of the if... else statements correctly assigns the premium values:

				// first:
				if(age <= 25)
					premium = 200;
				else
					premium = 125;

				// second:
				if(age >= 26)
					premium = 125;
				else
					premium = 200;

				// Third:
				if (!(age <= 25))
					premium = 125;
				else
					premium = 200;

				// Fourth:
				if(!(age >= 26))
					premium = 200;
				else
					premium = 125;

	/*	
			10. Understanding operator precedence:
				A. 

				precedence		Operator(s) 						Symbol(s) 
				-------------------------------------------------------------
				Highest			Logical NOT 						!
				Intermediate 	Multiplication, division, modulus   * / %
								Addition, Subtraction 				+ - 
								Relational 							> < >= <=
								Equality 							== !=
								Logical AND 						&&
								Logical OR 							||
								Conditional 						?:
				Lowest 			Assignment 							=


				B. In general, the order of precedence agrees with common algebraic usage.







			































