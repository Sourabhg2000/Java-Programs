package OOPS;

public class Calculator {
	double d;
	double c;
	
	Calculator()
	{
		d=c=0;
	}
	double add(double y ,double k)
	{
		return y + k;
	}
	
	double sub(double k, double c)
	{
		return k-c;
	}
	
	double mul(double o, double j )
	{
		return o*j;
	}
	 double div(double p, double i)
	 {
		 return p/i;
	 }
	 
	 double clear(double r,double t)
	 {
		return r=t=0;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		System.out.println("The Addition of Two Numbers is =  "+ cal.add(13.7, 45));
		System.out.println("The Subtraction of Two Numbers is =  "+ cal.add(45.78, 12.69));
		System.out.println("The Multiplication of Two Numbers is =  "+ cal.add(13, 45.69));
		System.out.println("The division of Two Numbers is =  "+ cal.add(69.69, 3.33));

	}

}
