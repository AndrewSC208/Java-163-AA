/*  Overloading constructors: 

	notes: this is just like any other overloaded method, super cool and you can do some really cool things with it to make sure that different constructors are called when needed.

*/

public class OverloadingConstructos {
	private int empNum;
	Employee(int num) {
		empNum = num;
	} // called if: Employee aWorker = new Employee(41243);
	Employee() {
		empNum = 999;
	} // called if a parameter is not sent through the methods: 
}