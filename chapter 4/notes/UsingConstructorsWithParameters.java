/*

	notes:
	1. 

*/

public class UsingConstructorsWithParameters {
	private int empNum;

	// This is a constructor that will automatically set empNum to 999;
	Employee() {
		empNum = 999;
	}
	// This is a constructor that will automatically set empNun to the int that is passed.
	Employee(int num) {
		empNum = num;
	} // when this is called in a main it can not be like the normal way
		// normal way:  Employee partTimeWorker = new Employee();
		// since the constructor now needs a parameter so does that way that we call the class:
			// new way:
			// Employee partTimeworker = new Employee(882); // this will pass the parameter to the constructor and set empNum to 882.
}

