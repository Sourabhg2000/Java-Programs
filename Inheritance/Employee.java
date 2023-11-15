package Inheritance;

public class Employee extends Person{
static int emp_id;
static String dept;

void display()
{
	super.display();
	System.out.print(". My Employee id is " + emp_id + " and i works in " + dept + " department");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e= new Employee();
emp_id = 121;
dept = "CDAC";
e.display();
	}

}
