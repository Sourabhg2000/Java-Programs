package collection;
import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList <String> al =new ArrayList<String>();
        ArrayList <Integer> ai = new ArrayList<Integer>();
        
        al.add("Sourabh");
        al.add("Sandip");
        al.add("prem");
        al.add("bablu");
        ai.add(12);
        ai.add(34);
        ai.add(4);
        ai.add(69);
        
        System.out.println(al);
        System.out.println(ai);
     //Traversing through array list 
     Iterator<String> it =al.iterator();
     
     while(it.hasNext()) {
    	String current = it.next();
    	System.out.println(current);
    	 if(it.next()=="prem")
    	 {
    		 System.out.println("premjeet");
    	 }
     }
     
     for(Integer i: ai) {
    	 System.out.println(i);
     }
     
     al.set(2, "ty");
     ai.set(2, 16);
     
    System.out.println(al.removeFirst());
	}

}
