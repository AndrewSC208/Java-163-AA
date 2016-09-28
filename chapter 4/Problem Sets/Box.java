// box.java 
public class Box {
	// data fields:
	int length, width, height;


	// overloaded constructors:
	Box(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
		System.out.println("Box created");
	}
	Box(int l, int w) {
		length = l;
		width = w;
		height = 0;
		System.out.println("Rectangle Created");
	}
	Box(int l) {
		length = l;
		width = 0;
		height = 0;
		System.out.println("Line Created");
	}
}