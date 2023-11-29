package oct25;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList <Integer> al=new ArrayList();
     al.add(12);
     al.add(45);
     al.add(69);
     System.out.println(al.isEmpty());
     
     al.removeAll(al);
     System.out.println(al.isEmpty());
	}

}
