package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Student s=new Student(101,"Sourabh Gaikwad",23);
Student s1=new Student(102,"Saurabh Nagane",22);
Student s2=new Student(103,"Sandip",24);
Student s3=new Student(104,"Shashwat",23);
Student s4=new Student(105,"Swapnil",22);

ArrayList<Student> al=new ArrayList<Student>();
al.add(s);
al.add(s1);
al.add(s2);
al.add(s3);
al.add(s4);

Iterator it=al.iterator();
while(it.hasNext()) {
	Student st= (Student)it.next();
	System.out.println(st.id+ " " +st.name+ " " + st.age);
}
	}

}
