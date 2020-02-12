package shapes;

import java.text.DecimalFormat;

public class Triangle implements Shape {
	
	private double firstSide;
	private double secondSide;
	private double thirdSide;
	public Triangle(double sideOne, double sideTwo, double sideThree) throws TriangleException {
		// TODO Auto-generated constructor stub
		if (sideTwo < (sideOne + sideThree) && sideThree < (sideOne + sideTwo) && sideOne < (sideTwo + sideThree)) {
			this.firstSide = sideOne;
			this.secondSide = sideTwo;
			this.thirdSide = sideThree;
		} else {
			throw new TriangleException("Invalid side(s)!");
		}
	}
	//Setters
	public void setFirstSide(double sideOne, double sideTwo, double sideThree) throws TriangleException {
		if (sideOne < (sideTwo + sideThree)) {
			this.firstSide = sideOne;
		} else {
			throw new TriangleException("Side one is invalid!");
		}
	}
	//Setters
	public void setSecondSide(double sideOne, double sideTwo, double sideThree) throws TriangleException {
		if (sideTwo < (sideOne + sideThree)) {
			this.secondSide = sideTwo;
		} else {
			throw new TriangleException("Side two is invalid!");
		}
	}
	//Setters
	public void setThirdSide(double sideOne, double sideTwo, double sideThree) throws TriangleException {
		if (sideThree < (sideOne + sideTwo)) {
			this.thirdSide = sideThree;
		} else {
			throw new TriangleException("Side three is invalid!");
		}
	}
	
	
	// Getters
	public double getFirstSide() {
		return firstSide;
	}
	// Getters
	public double getSecondSide() {
		return secondSide;
	}
	// Getters
	public double getThirdSide() {
		return thirdSide;
	}
	
	
	@Override
	public double perimeter() {
		return firstSide + secondSide + thirdSide;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " {s1=" + getFirstSide() + ", s2=" + getSecondSide() + ", s3=" + getThirdSide() + "} perimeter = " + new DecimalFormat("0.00000").format(perimeter());
	}

}
