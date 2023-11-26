package Day1;

class square{
	public static void main(String [] args) {
	 int i, j, n, m;
	 n=6;
	 m=6;
     for (i = 1; i <= n; i++)
     {
         for (j = 1; j <= m; j++)
         {
             if (i == 1 || i == n || 
                 j == 1 || j == m)            
                 System.out.print("*");            
             else
                 System.out.print(" ");            
         }
         System.out.println();
     }
}
}