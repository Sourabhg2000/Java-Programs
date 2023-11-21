package aggregate;

public class Person {
String name;
int age;
Details details;

Person()
{
	name = "Sourabh";
	age = 23;
	details = new Details();
}

Person(String name ,int age ,String area,String city,String state)
{
	this.name = name;
	this.age =age;
	this.details=details;
	details = new Details(area,city,state);
}
void display()
{
	System.out.println(name + " " + age);
	details.show();
	}
}
