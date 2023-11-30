package oops_basic;

public class Box1 {

	
		// TODO Auto-generated method stub
		  static  double rad;
		  static  int len;
		  static  int bre;
		   static int side;
		   void circle()
		   {
			  System.out.println(rad*rad *3.14);
		   }
		   
		   void rectangle()
		   {
			  System.out.println(0.5*len*bre);
		   }
		   
		   void cube()
		   {
			   System.out.println(side*side*6);
		   }
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				rad = 3.78;
				len = 6;
				bre=7;
				side = 9;
		        Box b1 = new Box();
		      
		       System.out.println("The area Of Circle is :" + b1.circle(rad));
		       
		       System.out.println("The Area of Rectangle is : " + b1.rectangle(len, bre));
		       
		       
		       System.out.println("The Area of Cube is : " + b1.cube(side));
		       
			}

		


	}

