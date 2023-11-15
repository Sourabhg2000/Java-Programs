package Inheritance;

public class Cat extends Mammel{

	void roar()
	{
		System.out.println(" roarr....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Cat c = new Cat();
         c.breathe();
         c.eat();
         c.roar();
         c.sleep();
	}

}
