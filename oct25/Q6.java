package oct25;
import java.util.*;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<Integer> al =new ArrayList<Integer>();
  al.add(13);
  al.add(12);
  al.add(18);
  al.add(40);
  
  System.out.println(al);
  
  for(Integer i :al) {
	  if(i%2==1) {
		  System.out.println("The odd ELement in ArrayList is: " + i);
	  }
  }
  		System.out.print("this are even number: ");
	  for(Integer i :al) { 
	   if(i%2==0) {
		  System.out.print(" " + i);
	  }
  }
	}
}


