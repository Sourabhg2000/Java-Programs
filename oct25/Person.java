package oct25;
import java.util.*;
public class Person {
String name,address;
int age;
String phone;
public Person(String name,int age,String address,String phone)
{
	this.name=name;
	this.age=age;
	this.address=address;
	this.phone=phone;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p =new Person("Sourabh",23,"Hadapsar","7276765587");   
		Person p1 =new Person("Shashwat",23,"Chattisgarh","9696780989");
		Person p2 =new Person("Swapnil",22,"Shirdi","9370986661");
		ArrayList <Person> al=new ArrayList<Person>();
		al.add(p);
		al.add(p1);
		al.add(p2);
		
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			Person P =(Person)it.next();
			System.out.println(P.name+ " " +P.address + " " +p.age+ " "+p.phone);
		}
		System.out.println();
		System.out.println("Following are the Linked List: ");
		System.out.println();
	     LinkedList<Person> ll = new LinkedList<Person>();
	     ll.add(p);
	        ll.add(p1);
	        ll.add(p2);
	    
	        Iterator it1=al.iterator();
			while(it1.hasNext())
			{
				Person P =(Person)it1.next();
				System.out.println(P.name+ " " +P.address + " " +p.age+ " "+p.phone);
			}
	        
	        
	}

}
