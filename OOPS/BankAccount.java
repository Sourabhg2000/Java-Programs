package OOPS;

public class BankAccount {
	String name;
	int acc_no;
	static double i_bal;
	static double roi;
	static int year;
	
	
	BankAccount(String c , int k,double s)
	{
		this.name = c;
		this.acc_no = k;
		this.i_bal = s;
		System.out.println("My Name is " + name + " And My Account No is " + acc_no + " And I Have Initial Balance is " + i_bal);
	}
	
	void display()
	{
		System.out.println("My Name is " + name + " And My Account No is" + acc_no + " And I Have Initial Balance is " + i_bal);
	}
    double deposit(double k)
    {
       return i_bal = k+ i_bal;	
    }
    double withdrawal( double c)
    {
    	return i_bal = i_bal-c;
    }
    double saving()
    {
    	return i_bal;
    }
    
    double fixeddeposit(double k,double y,int i)
    {
    	this.i_bal = k;
    	roi = y;
    	year = i;
    	
    	double intrest= i_bal *year * roi;
    	i_bal = i_bal + intrest;
    	return i_bal;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       BankAccount b = new BankAccount("Sourabh" , 12346412,1234.34);
     
       System.out.print("The Amount After Deposit is : "+ b.deposit(10000));
       System.out.println();
       System.out.print("The Amount After Withdrawal is : "+ b.deposit(1045.65));
       System.out.println();
      System.out.println("The Saving Amount In Your Account Is : " + b.saving());
      System.out.println();
      System.out.println("The Fixed Deposit Amount After is : " + b.fixeddeposit(1200, 7.4, 3));
	}

}
