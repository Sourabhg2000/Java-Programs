package Interface;

public class Dog implements Animal{
public void bark()
{
	System.out.println(" Dog Is Barking ");
}
public static void main(String [] args)
{
	Dog d = new Dog();
	d.bark();
}
}
