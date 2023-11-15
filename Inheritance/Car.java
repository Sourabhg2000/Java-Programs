package Inheritance;

public class Car extends Vehicle{
String Name;
String Model;
String Price;

public Car()
{
	Name = "Range Rover";
	Model = "Evoque";
	Price = "1.4 CR ONLY";
}
 void accelerate()
 {
	 System.out.println("I Have  " + Name +" " +  Model + "..");
 }
 
 void Break()
 {
	 System.out.println("I Have break");
 }
}
