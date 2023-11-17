package Interface;

public class Account1 implements Bank1{

double intrest;
double balance;
	
	public void deposit(double k)
{
	balance = balance +k;
	
}
	
	public void withdraw(double n)
	{
		balance = balance - n;
	}
	
	public void calculateintrest(double r,int year)
	{
		intrest = 7.2;
	}
	
	public void viewbalance ()
	{
		System.out.println(balance);
	}


}
