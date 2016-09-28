// this is the first section of chapter 3: creating methods section:

public class creatingMethods104 {
	public static void main(String[] args) {

		// Definitions:
			// method: Is a prohram module hat contains a series of statements that carry out a task.
				// To execute a method, you invoke or call it.
				// In other words, a calling method makes a method call, which invokes a called method. 
				//The calling method is also know as a client method.
					// A called method provides a service for its client. 

		// what a method needs to have:
			// Method header: A method's header provides information about how other methods can interact with it. 
				// A method header is also know as a declaration.
				// A method header is the first line of a method it contains the following:
					// * An option access specifier-- The access specifier for a Java method can be any of the following medifiers: public, private, protected, or, if left unspecified, package.
						// most often, methods are fiven public access. Endowing a method with public acceess means any class can use it. 
					// * The return type for the method: 
						// A method might return a value, or send it back, to its calling method. If, so the method's return type is the data type of the returned data. 
							// A method that returns no data has a return type of void. 
					// * The method name -- The name has to be any legal identifier:
					// * A set of parenthese-- the parentheses optionall might contain data to be sent to the method. 

			// Method body: Between a pair od curly braces -- the method body containers the statements that carry out the work of the method. A method's body is called it's implementation. 
		// Stub: this is an empty method that is used as a placeholder until the programmer filles it. 

		// The full name of the nameAndAddress() method is First.nameAndAddress(); This includes the class name, a dot, and the mothod name. (The name does not include an object an object because nameAndAddress() is a static method.)

		// Fully qualified identifier: A complete name that includes the class.
		// When you use the nameAndAddress() method inside of its own class you do not need to include the class, however, outside of its own class you do or the compiler will not recognize it. // A good example of this is JOptionPane.showMessageDialog(). JOptionPane is a different class then that one that you are using it in. 

		//Starting Line:
		System.out.println("This is my first method:");
		System.out.println(" ");

		//------------------------------
		// This is the first method call:
		nameAndAddress();

		// a space
		System.out.println(" ");
		// Just a line of text
		System.out.println("First java application");
	}

	// Make sure that you put the method declaration outside of the main() or it will not compile.
	// This is my first method:
	public static void nameAndAddress () {
			
			System.out.println("Andrew Meiling");
			System.out.println("224 S Dennis Ave");
			System.out.println("Republic, MO 65738");
		}
}