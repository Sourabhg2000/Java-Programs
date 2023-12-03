package queue;
import java.util.*;
public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue <String> p =new PriorityQueue<String>();
p.add("One"); p.add("two");p.add("three"); p.add("four");

System.out.println("Head :" + p.element());
System.out.println("First :" + p.peek());
System.out.println("remove : " + p.poll());
System.out.println(p);
	}

}
