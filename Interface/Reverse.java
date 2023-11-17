package Interface;

public interface Reverse {
static int rev(int n)
{
	int rem=0;
	while(n!=0)
	{
	int d = n%10;
	rem = rem *10 +d;
	n=n/10;
	
}
	return rem;
}
}