package queue;
import java.util.*;
public class Deque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deque <String> d=new ArrayDeque<String>();

d.add("one"); d.add("two"); d.add("three"); d.add("four");

System.out.println(d);
System.out.println(d.pollFirst());
System.out.println(d);
System.out.println(d.pollLast());
System.out.println(d);
System.out.println(d.pop());
System.out.println(d);
	}

}
