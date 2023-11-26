package Day1;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,reverse =0;
		n=15;
		int og=n;
		int res;
		while(n>0)
		{
			res = n%10;
			reverse = reverse *10 +res;
			n=n/10;
		}
		System.out.println(reverse);

	
      if(og == reverse)
      {
    	  System.out.println("This is pallindrome");
      }
      else {System.out.println("This is not Pallindrome");
}
	}
}
 