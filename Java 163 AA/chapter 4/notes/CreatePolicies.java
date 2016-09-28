public class CreatePolicies {
	public static void main(String[] args) {
		CarInsurancePolicy first = new CarInsurancePolicy(123);
		CarInsurancePolicy second = new CarInsurancePolicy(456, 4);
		CarInsurancePolicy third = new CarInsurancePolicy(789, 12, "NewCastle");
		// CarInsurancePolicy fourth = new CarInsurancePolicy(); // this does not work it does not have a default constructor. 

		first.display();
		second.display();
		third.display(); 
	}
}