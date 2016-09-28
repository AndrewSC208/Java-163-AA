// circle.java:

import java.lang.Math;
public class Circle {
	// data fields
	private double radius, diameter, area;

	// circle constructor:
	Circle() {

		radius = 1;
		diameter = radius * 2;
		area = (Math.PI) * radius * radius;

	} // end main

	// get and set methods:
	public double getRadius() {
		return radius;
	}
	public void setRadius(double x) {
		radius = x;
		diameter = radius * 2;
		area = (Math.PI) * radius * radius;

		System.out.println("If the radius is " + radius + " then the diameter is " + diameter + " and the area of the circle is " + area);
	}
}