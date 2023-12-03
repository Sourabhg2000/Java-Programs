package TreeSet;
import java.util.*;
public class Treeset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet <Integer> t=new TreeSet<Integer>();
t.add(24);
t.add(12);
t.add(56);
t.add(50);
System.out.println(t);
//System.out.println("Head : " + t.headSet(24,true));
System.out.println("Sub set: " + t.headSet(24, false));
//to remove the first value
//System.out.println(" after removing first value: " +t.pollFirst());
//System.out.println(" after removing last Value : " + t.pollLast());
//System.out.println("Descending set : " + t.descendingSet());

	}

}
