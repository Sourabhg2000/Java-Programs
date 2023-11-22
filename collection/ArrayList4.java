package collection;

import java.util.*;

public class ArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String array[]= {"Lion","Tiger","Monkey","Fox"};
System.out.println(array);
//[Ljava.lang.String;@50040f0c This is the output of array without converting it into list
System.out.println("Array :" + Arrays.toString(array));

ArrayList<String> list=new ArrayList<String>();

for(String str : array) {
	list.add(str);
}
System.out.println("Print list : " + list);
	
	
	list.add("Panda");
	list.add("Penguin");
	list.add("Jackel");
	list.add("Ostrich");
	
	String[] arr=list.toArray(new String [list.size()]);
	System.out.println("Array : " + Arrays.toString(arr));
	System.out.println(list);
	}

}
