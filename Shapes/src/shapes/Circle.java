package shapes;

import java.text.DecimalFormat;

public class Circle implements Shape {
	private double radius;
	
	//Custom Constructor which accepts the radius as double parameter
	public Circle(double rad) throws CircleException {
		if (rad > 0) {
			this.radius = rad;			
		} else {
			throw new CircleException("Invalid radius!");
		}
	}
	
	// Setters
	public void setRadius(double rad) throws CircleException {
		if (rad > 0) {
			this.radius = rad;
		} else {
			throw new CircleException("Invalid radius!");
		}
	}
	// Getters
	public double getRadius() {
		return radius;
	}
	
	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " {r=" + getRadius() + "} perimeter = " + new DecimalFormat("0.00000").format(perimeter());
	}
}
