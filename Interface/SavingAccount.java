package Interface;

public class SavingAccount implements Bank1{
	
	double pamt;
	double deposit;
	double amount;
	double withdraw;
	double intrest;
	double balance;
	int year;
	void priciple(int pamt)
	{
		this.pamt = pamt;
		System.out.println("The Initial amount is = " + pamt);
	}
	public void deposit(double k)
	{
		balance = pamt +k;
		System.out.println("The amount requested to deposit is = " + k);
		System.out.println("The balance after the deposit is = " + balance);
		
	}
		
		public void withdraw(double n)
		{
			balance = balance - n;
			System.out.println("The amount requested to withdraw " + n);
			System.out.println("the balance after the withdrawal is = " + balance);
		}
		
		public void calculateintrest(double r,int year)
		{
			intrest = balance *year*r /100;
			System.out.println("The Interest amount will be = " + intrest);
		}
		
		public void viewbalance ()
		{
			double viewbalance = balance + intrest;
			System.out.println("The balance after intrest amount is added in your saving account is = " + viewbalance);
			System.out.println();
			
		}
		public static void main(String [] args)
		{
			SavingAccount s=new SavingAccount();
			s.priciple(120000);
			s.deposit(1204);
			s.withdraw(12000);
			s.calculateintrest(7.2, 3);
			s.viewbalance();
			
			CurrentAccount c = new CurrentAccount();
			c.priciple(1000);
			c.deposit(100);
			c.withdraw(200);
			c.calculateintrest(12.6, 4);
			c.viewbalance();
		}
	
}
