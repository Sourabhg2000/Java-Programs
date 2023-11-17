package interface2;

public class Rectangle implements Shape{
protected double len,bre;

Rectangle(double len,double bre){
	this.len=len;
	this.bre=bre;
}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 2*len*bre;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(len+bre);
	}
	public static void main(String[] args) {
		Circle cr=new Circle(2.7);
		System.out.println(cr.area());
		System.out.println(cr.perimeter());
		
		Rectangle rt=new Rectangle(2.9,3.9);
		System.out.println(rt.area());
		System.out.println(rt.perimeter());
	}

}
