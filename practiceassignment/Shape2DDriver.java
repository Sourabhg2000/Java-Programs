package practiceassignment;

public class Shape2DDriver {
void displayArea(Shape2D s) {
	double area =s.get2DArea();
	System.out.println("Area: "+ String.format("%.if", area));
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Rectangle2D rt=new Rectangle2D(12,34);
     Circle2D cr=new Circle2D(3.14);
    System.out.println(rt.get2DArea());
    System.out.println(cr.get2DArea());
    
    
 }
     
	}


