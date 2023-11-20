package assignment;

public class HillStation {
String location;
String famous;
void location()
{
	System.out.println("This is hillstation and it is");
}

void famous()
{
	System.out.println(" and it is famous for");
}
public static void main(String [] args)
{
	HillStation h;
	h = new Manali();
	h.location();
	h.famous();
	HillStation h1;
	h1 = new Mussoorie();
	h1.location();
	h1.famous();
	HillStation h2 = new Gulmarg();
	h2.location();
	h2.famous();
	
	
}
}
