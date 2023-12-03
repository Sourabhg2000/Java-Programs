package Snack;

public class Snack {
String id ;
char size;
double price;

public Snack(String id , char size)
{
	this.id= id;
	this.size= size;
	calculateprice();
}

void calculateprice()
{
	if(size=='s') {
		price=19.99;
	}
	else if(size=='m') {
		price =29.99;
	}
	else if(size=='l') {
		price = 39.99;
	}
}

public void displaysnack()
{
	System.out.println("Type : Snack ");
	System.out.println("ID : " + id);
	System.out.println("Size : " + size);
	System.out.println("Price : $ " + price);
}
}
