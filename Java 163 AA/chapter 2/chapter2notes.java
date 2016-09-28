// These are the notes from chapter two 

// Using Constants and Variables:
	// Constant: A value that cannot be changed while a program is running. 
	// Variable: A names memory location that you can use to store a value. 
	// Data type: Describes the type of data that can be stored there, how mcuh memory the item occupries, and what type of operations can be performed on the data. 
		// Primitive type: A simple data type.
		
/*
		public class chapter2notes {

			public static void main(String[] args) {
				// these are the eight primitive data types:
				byte byte1; // byte-length integer
				short short1; // Short integer
				int int1; // integer
				long long1; // long integer
				float float1; // Single-precision floating point
				double double1; // double-precision floating point.
				char char1; // A single character
				boolean boolean1; // A boolean value(true or false)

				// This is also a legal way of declaring a variable:
				int myAge = 26, yourAge = 40;
				// variables can be strung together in a declaration statement to make writing them easier. 
			}
		}
*/
		// Variable Declaration: A statement that reserves a named memory location and includes the following.
			// A data type that identifies the type of data that the variable will store.
			// An indentifier that is the variable's name
			// An optional assignment operator and assigned value, if you want a variable to contain an intial value. 
			// An ending semicolon.

		// Strongly typed language: One in which all variables must be declared before they can be used.

		// the assignment operator has right to left associativity. Meaning that 25 = myAge is illegal.
			// Associativity: refers to the order in which values are used with operators. 

				// and identifier that can appear on the left side of an assignment is called lvalue
				// and identifier that can appear on the right side of an assignment is called the rvalue


// Declaring Named Constants
	// Named constant: A variable that the value will never change. 
	// A named constant is also know as a symbiotic constant. 
	// a named constant is different from a variable in a few ways:
		// its declaration statement is preceded by the keyword final.
		// A name constant can be assigned a value only once. 
		// if you do not initialize the constant at declaration, it is know as a blank final, and you can assign a value later. 
		// named constant conventionally are given identifiers using all uppercase letters, using underscores as needed to separate words. 
		
		// examples include: 
/*
		public class chapter2notes {
			public static void main(String[] args) {
				// these are all declaration statements of constants. To declare a constant you have to put final in front of the declaration statement. I recommend making them uppercase with underscores for spaces.
				final int NUMBER_OF_DEPTS = 20;
				final double PI = 3.14159;
				final double TAX_RATE = 0.015;
				final string COMPANY = "ABC Manufacturing";
			}
		}
*/
// The scope of variables and constants:
		// Scope: is the area in which it is visible to a program and in which you can refer to it using its simple identifier. 
		// A variable or constant is in scope from the point it is declared until the end of the block of code in which the declaration lies. 
		// This usually means that a variable or constant can be used from its declaration until the end of the method in which it is declared. 
			// However, if a method contains multiple sets of curly braces, then a data item is usable only until the end of the block that holds the declaration. 
			// each constant cna only hold one variable at a time. 
// Make the money don't let the money make you.

// Learning about integer data types: 
	// on page 58 this shows the size of a value that each variable can store:

		public class chapter2notes {
			public static void main(String[] args) {
				// type 			// Min value 				// Max Value 				// Size in bytes
				byte 				-128                		127 						1
				short 				-32,768 					32,767 						2
				int 				-2,147,483,647 				2,147,483,647 				4
				long 				-9,223,372,036,854,775,808  9,223,370,036,854,775,807 	8
			}
		}

		// it is very important that you choose a data type that 



















