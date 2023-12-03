package TreeSet;
import java.util.*;
public class Book implements Comparable<Book>{
	int id;
	String title,author;
	double price;

	 public Book(int id,String title,String author,double price) {
		this.id=id;
		this.title=title;
		this.author=author;
		this.price=price;
	}
		
	public int compareTo(Book b) {
		 if(id>b.id) {
			 return 1;
		 }
		 
		 
		 
		 else if(id<b.id) {
			 return -1;
		 }
		 
		 else return 0;
	 }


	

	
		// TODO Auto-generated method stub
}
	