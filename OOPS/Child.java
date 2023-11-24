package OOPS;

public class Child extends Father{
	
		void name()
		{
			super.name();
			System.out.println("Hello I Am Child..");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.name();

	}

}
