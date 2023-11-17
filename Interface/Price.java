package Interface;

public class Price implements Car{
double charge;
double rate;
double km;
boolean choice;
public Price(double charge,double rate)
{
	this.charge=charge;
	this.rate=rate;
}
public void rent(double k)
{
	charge = k*charge *rate;
}

public void km(double k)
{
	km =k;
}
public void available(boolean n)
{
	choice=n;
}
}
