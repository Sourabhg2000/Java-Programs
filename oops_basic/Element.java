package oops_basic;

public class Element {
static int a[] = {34,5,45,87,12};
static int max = a[0];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
      System.out.println(max);
	}

}
