package aggregate;

public class Details {
String area,city,state;
public Details()
{
	area = "Hadapsar";
	city = "Pune";
	state = "Maharashtra";
}

Details(String area , String city , String state)
{
	this.area = area;
	this.city = city;
	this.state = state;
}

void show()
{
	System.out.println(area + " " + city + " " + state + " ");
}
}
