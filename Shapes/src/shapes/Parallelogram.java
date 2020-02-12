package shapes;

import java.text.DecimalFormat;

public class Parallelogram implements Shape {

	private double width;
	private double height;
// constructor which accepts the height and width as parameters
	Parallelogram(double wdth, double hght) throws ParallelogramException {
		if (wdth > 0 && hght > 0) {
			this.width = wdth;
			this.height = hght;
		} else {
			throw new ParallelogramException("Invalid side(s)!");
		}
	}
	
	// Setter
	public void setWidth(double width) throws ParallelogramException {
		if (width > 0) {
			this.width = width;
		} else {
			throw new ParallelogramException("Invalid width!");
		}
	}
	// Setter
	public void setHeight(double height) throws ParallelogramException {
		if (height > 0) {
			this.height = height;
		} else {
			throw new ParallelogramException("Invalid height!");
		}
	}
	
	// Getters
	public double getWidth() {
		return width;
	}
	// Getter
	public double getHeight() {
		return height;
	}
	
	@Override
	public double perimeter() {
		//Formula for finding the perimeter of a parallelogram
		return 2 * (width + height);
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " {w=" + getWidth() + ", h=" + getHeight() + "} perimeter = " + new DecimalFormat("0.00000").format(perimeter());
	}

}
