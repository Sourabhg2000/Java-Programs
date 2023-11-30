package oops_basic;

public class Bank {
	
	static int amount = 12900;
static int Fd_year = 3;
static float roi =(float) 7.2;

float intrest (float k,float c , int e)
{
	float p = k*c*e/100;
	
	return p;
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Bank b1 = new Bank();
	float principle = amount + b1.intrest(roi, amount, Fd_year)
 ; System.out.println("The Total Amount Recieve After FD matures is " + principle);
	}

}
