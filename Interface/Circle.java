package interface2;

public class Circle implements Shape{
protected double rad;

Circle(double rad){
	this.rad=rad;
}
	@Override
	public double area() {
		
		return Math.PI*rad*rad;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*rad;
	}

}
