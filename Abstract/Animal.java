package Abstract;

public abstract class Animal {

	abstract void domestic();

	abstract void wild();
String name,type;

public Animal(String name,String type)
{
	this.name=name;
	this.type=type;
	System.out.println("hello");
}
}
