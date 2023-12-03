package Snack;

public class FruitSnack extends Snack{
public boolean citrus;

public FruitSnack(String id,char size,boolean citrus)
{
	super(id,size);
	this.citrus=citrus;
	calculateprice();
}

void calculateprice()
{
	System.out.println("Type : Fruit Snack ");
	System.out.println("ID : " + id);
	System.out.println("Type : " +size);
	System.out.println("Citrus Fruit:  "+ citrus );
}
}
