
public class ex4_4 {
	

		public static void zoop(String fred, int bob) {
			if (bob == 5) {
				ping("Not ");
			} else {
				System.out.println("!");
			}
		}

		public static void main(String[] args) {
			int bizz = 5;
			int buzz = 2;
			zoop("just for", bizz);
			clink(2*buzz);
		}

		public static void clink(int fork) {
			System.out.print("It's ");
			zoop("breakfast ", fork);
		}

		public static void ping(String strangStung) {
			System.out.println("any " + strangStung + "more ");
		}

	
}

