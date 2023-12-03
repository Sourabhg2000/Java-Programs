package Snack;

public class SaltySnack extends Snack{
public boolean nut;

public SaltySnack(String id,char size,boolean nut)
{
	super(id,size);
	this.nut=nut;
	calculateprice();
}

void calculateprice()
{
	super.calculateprice();
	if(nut) {
		price= price + 4.50;
	}
}
public void displaysnack()
{
	System.out.println("Type : Salty Snack");
	System.out.println("ID : " +id);
	System.out.println("Type : " + size);
	System.out.println("Nut Snack : " +nut);
	System.out.println("Price : $" +price);
}
}
