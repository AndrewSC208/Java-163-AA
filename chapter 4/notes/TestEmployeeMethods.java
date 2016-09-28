public class TestEmployeeMethods {
	public static void main(String[] args) {
		
		// declares new worker:
		Employee aWorker = new Employee();
		// sets value of variables:
		aWorker.setValues();
		// calls methods:
		aWorker.methodThatUsesInstanceAttributes();
		// calls methods:
		aWorker.methodThatUsesLocalVariables();
	}
}