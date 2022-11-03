package studio7;

public class Rectangle {
	private double length;
	private double width;



	public Rectangle(double length, double width) {
		// same name as class, creating a new variable type "Rectangle" 
		this.length = length; // initialize length
		this.width = width;
	}

	public double getArea() {
		double getArea = this.length * this.width;
		return getArea;
	}

	public double getPerimeter() {
		double getPerimeter = 2 * (this.length + this.width);
		return getPerimeter;
	}

	public boolean square() {
		if (this.length == this.width) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean compareArea(Rectangle rectangle1) {
		if (this.getArea() < rectangle1.getArea()) {
			return true;
		}
		else {
			return false;
		}
	}



}
