package encapsulation;

public class Library extends Book{
  
	private String Librarian_name;
	private int Librarian_age;
	
	public Library(String Librarian_name,int Librarian_age,String title,String author,long isbn,boolean isBorrowed) {
		super(title, author, isbn,isBorrowed);
		this.Librarian_age=Librarian_age;
		this.Librarian_name=Librarian_name;
		
		
	}
	
	 public void displayBookStatus() {
	        super.displayStatus();
	        System.out.println("Librarian: "+Librarian_name+ " "+"Librarian Age: "+ Librarian_age);
	    }
}


