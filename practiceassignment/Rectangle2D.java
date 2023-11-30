package practiceassignment;

public class Rectangle2D extends Shape2D{
private double length,breadth;
	public Rectangle2D(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	double get2DArea() {
		// TODO Auto-generated method stub
		return length*breadth;
	}

}
