package OOPS;

public class Employee {
int id;
String add;

void cal(int k,String s)
{
	id =k;
	add =s;
	System.out.println(id + add);
}

int cal(int s)
{
	return s*10;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Employee e = new Employee();
          e.cal(35, "sourabh");
        
          System.out.println(e.cal(65));
	}

}
