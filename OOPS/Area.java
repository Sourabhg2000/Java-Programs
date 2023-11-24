package OOPS;

public class Area {
double side;
double length;
double breadth;
double diagonal1;
double diagonal2;
 double square(double k)
 {
	 return side*side;
 }
 
 double triangle(double k,double c)
 {
	 return 0.5 * length * breadth;
 }
 
 double rhombus(double s,double y)
 {
	 return 0.5 * diagonal1 * diagonal2;
 }
 
 void display()
 {
	 System.out.println("The area Of Triangle is " );
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a = new Area();
		a.side = 12;
		a.breadth = 4;
		a.length = 4.5;
		a.diagonal1 = 8.4;
		a.diagonal2 = 9.5;
		System.out.println("The Area Of Square Is : "+ a.square(a.side));
		System.out.println("The Area Of triangle Is : "+ a.triangle(a.length , a.breadth));
		System.out.println("The Area Of rhombus Is : "+ a.rhombus(a.diagonal1 , a.diagonal2));

	}

}
