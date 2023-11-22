package collection;
import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> ai=new ArrayList<Integer>();
	   ai.add(12);
	   ai.add(34);
	   ai.add(1);
	   ai.add(-1);
	   
	   ListIterator <Integer> it =ai.listIterator(ai.size());	
	while(it.hasPrevious())
	{
		System.out.println(it.previous());
	}
	
	}

}
