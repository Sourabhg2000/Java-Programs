package collection;
import java.util.*;
public class ArrayList6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Integer> al=new ArrayList<>();
al.add(1);  al.add(2);  al.add(3); al.add(4); al.add(5); al.add(0);
System.out.println(al);
al.add(3, 6);
System.out.println(al);
al.addAll(al);
System.out.println(al);

System.out.println(al.get(4));
System.out.println(al.indexOf(al));
System.out.println(al.remove(al));
System.out.println(al.remove(4));

	}

}
