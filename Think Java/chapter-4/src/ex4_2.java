
public class ex4_2 {

		public static void baffle(String blimp) {
			System.out.println(blimp);                        //
			zippo("Ping", -5);
		}

		public static void zippo(String quince, int flag) {
			if (flag < 0) {                                     
				System.out.println(quince + "zoop");            
			} else {
				System.out.println("ik");                      //2
				baffle(quince);                                //3
				System.out.println("boo-wa-ha-ha");
			}
		}

		public static void main(String[] args) {
			zippo("rattle",13);                                 //1 
		}


}
