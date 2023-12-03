package TreeSet;
import java.util.*;
public class TreeSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet <Book> ts=new TreeSet<>();

Book b1 = new Book(101," java "," abc ",450.0);
Book b2 = new Book(102," .net "," xyz ",450.0);
Book b3 = new Book(103," C++ "," zxc ",450.0);
Book b4 = new Book(104," Python "," qwe ",450.0);

ts.add(b1); ts.add(b2); ts.add(b3); ts.add(b4);

for(Book b:ts) {
	System.out.println("ID: "+b.id+ " Title:"+ b.title+ " Author:"+ b.author + " Price :"+ b.price );
}
	}

}
