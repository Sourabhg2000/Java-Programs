package aggregate1;

public class Employee {
String name;
String position;

public Employee()
{
	name = null;
	position=null;
}

public Employee(String name ,String position)
{
	this.name =name;
	this.position = position;
}

void show()
{
	System.out.println(name + " " + position);
}
}
