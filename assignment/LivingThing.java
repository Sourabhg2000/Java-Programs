package assignment;

public class LivingThing {
void eat()
{
	System.out.println("Hello I Am Human and I love Pizza..");
}

void breathe()
{
	System.out.println(" I Am Breathing..");
}

public static void main(String [] args)
{
	LivingThing l ;
	l = new Human();
	l.eat();
	l.breathe();
	
	LivingThing l1 = new Animals();
	l1.eat();
	l1.breathe();
	
	LivingThing l2 = new Plants();
	l2.eat();
	l2.breathe();
	
	LivingThing l3 = new Bacteria();
	l3.eat();
	l3.breathe();
	
}
}
