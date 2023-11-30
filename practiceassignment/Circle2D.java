package practiceassignment;

public class Circle2D extends Shape2D {
private double rad;
	
	public Circle2D(double rad) {
		this.rad=rad;
	}
	
	double get2DArea() {
		// TODO Auto-generated method stub
		return Math.PI*rad*rad;
	}

}
