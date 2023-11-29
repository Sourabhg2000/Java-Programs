package oct25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<Integer> al = new ArrayList<Integer>();
		  al.add(23);
		  al.add(23);
		  al.add(45);
		  
		 ListIterator<Integer> it =al.listIterator(al.size());
		  while(it.hasPrevious()) {
			  System.out.println(it.previous());
		  }
	}

}
