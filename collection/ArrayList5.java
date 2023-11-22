package collection;
import java.util.*;
public class ArrayList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<>();

al.add("Apple"); al.add("Banana"); al.add("Cherry");
System.out.println(al);
System.out.println(al.get(0));

al.set(1, "Grapes");  
System.out.println("After replacing :" + al);

al.remove("Cherry");
System.out.println("After removing :"+al);

System.out.println(al.contains("Banana"));
System.out.println(al.contains("Cheery"));
System.out.println(al.size());

//for(String Fruit : al) {
	//System.out.println(Fruit);
}
	}


