package OOPS;

public class Constructor {
	String name;
	int age;
	
	Constructor(String s, int  n)
	{
		name = s;
		age = n;
	}
	
	

	void display()
	{
		System.out.println("Hello My Name Is " + name + " And i Am " + age + " old..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Constructor c1 = new Constructor("Sourabh Gaikwad" , 22);
       Constructor c2 = new Constructor("Tejas Dhurde" , 22);
       c1.display();
       c2.display();
	}

}
