package Interface;

public interface AdvancedArithmetic {

	static int divisor_sum(int n)
	{
		 System.out.print("The divisors " + n + " are : ");
	        int sum =0;
			
	        for(int i=1;i<=n;i++)
	           {
	        	   if(n%i==0)
	        	   {
	        		   System.out.print(i + " ");
	        		   sum = sum+i;
	        	   }
	        	   
	           }
	        System.out.println();
	        System.out.print("The sum of divisors are = ");
			return sum;
	           
	}
}
