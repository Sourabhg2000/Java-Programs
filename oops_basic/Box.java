package oops_basic;

public class Box {
  static  double rad;
  static  int len;
  static  int bre;
   static int side;
   double circle(double k)
   {
	   return k * k *3.14;
   }
   
   int rectangle(int c, int k)
   {
	   return (2*c*k);
   }
   
   int cube(int c)
   {
	   return c*6;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rad = 3.78;
		len = 6;
		bre=7;
		side = 9;
        Box b1 = new Box();
       double circle =  b1.circle(rad);
       System.out.println("The area Of Circle is :" + circle);
       
       int rectangle = b1.rectangle(len, bre);
       System.out.println("The Area of Rectangle is : " + rectangle);
       
       int cube = b1.cube(side);
       System.out.println("The Area of Cube is : " + cube);
       
	}

}
