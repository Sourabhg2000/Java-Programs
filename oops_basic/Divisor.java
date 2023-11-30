package oops_basic;

public class Divisor {
static int k=18;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("The divisors " + k + " are : ");
        int sum =0;
		
        for(int i=1;i<=k;i++)
           {
        	   if(k%i==0)
        	   {
        		   System.out.print(i + " ");
        		   sum = sum+i;
        	   }
        	   
           }
        System.out.println();
        System.out.println("The sum of divisors are " + sum );
           
	}

}
