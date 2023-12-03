package TreeSet;
import java.util.*;
public class TreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Integer> ts=new TreeSet<>();

ts.add(12);
ts.add(34);
ts.add(69);
ts.add(1);
System.out.println(ts);
System.out.println("Smallest Element: " + ts.getFirst());
System.out.println("Largest element: " + ts.getLast());
System.out.println("Descending order: " + ts.descendingSet());

System.out.println("Boolean value return : " +ts.remove(1));
System.out.println(ts);
	}

}
