package OOPS;

public class Date {
int dd,mm,yy;
void date(int c,int v,int b)
{
	this.dd =c;
	this.mm = v;
	this.yy= b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Date d =new Date();
         d.dd =15;
         d.mm =10;
         d.yy = 2023;
         System.out.println(d.dd + "/" + d.mm + "/" +d.yy);
	}

}
