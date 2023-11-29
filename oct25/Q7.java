package oct25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<Integer> al =new ArrayList<Integer>();
		  al.add(13);
		  al.add(12);
		  al.add(18);
		  al.add(40);
		  
		  Collections.sort(al);
		  System.out.println("The Sorted Array List is : " +  al);
		  
		  LinkedList<Integer> ll = new LinkedList<Integer>();
		  ll.add(2);
		  ll.add(7);
		  ll.add(1);
		  ll.add(69);
		  ll.add(34);
		  
		  Collections.sort(ll);
		  System.out.println("The Sorted Linked List is : "+ll);
	}

}
