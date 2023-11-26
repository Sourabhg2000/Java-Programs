package encapsulation;

public class LibraryManagment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Library lb=new Library("Mr.Gandhi",59,"Rise Of Marathas","Baba Purandhakar",1235667,true);
   lb.displayBookStatus();
  System.out.println(lb.getBorrowed());
	}

}
