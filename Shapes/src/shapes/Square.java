package shapes;

import java.text.DecimalFormat;

public class Square extends Rectangle {
	
	public Square(double width) throws ParallelogramException {
		super(width, width);
	}
	

	@Override
	public double perimeter() {
		return getWidth() * 4;
	}
	

	@Override
	public String toString() {
		return getClass().getSimpleName() + " {s=" + getWidth() + "} perimeter = " + new DecimalFormat("0.00000").format(perimeter());
	}
}
