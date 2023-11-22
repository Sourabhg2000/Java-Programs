package HashSet;
import java.util.*;
public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Set<String> set = new HashSet<>();

	        // Add animal names to the HashSet
	        set.add("Lion");
	        set.add("Tiger");
	        set.add("Monkey");
	        set.add("Fox");
	   

	        // Print the HashSet
	        System.out.println("HashSet: " + set);

	        // Add more animal names to the HashSet
	        set.add("Panda");
	        set.add("Lion");
	        set.add("Jackal");
	        set.add("Ostrich");

	        // Print the HashSet after adding more elements
	        System.out.println("HashSet: " + set);
	    Iterator it = set.iterator();
	        while(it.hasNext()) {
	        	System.out.println(it.next());
	        }
	 
	}

}


 