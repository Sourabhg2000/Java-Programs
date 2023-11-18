package assignment;

public class AuthorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Author a= new Author("Sourabh Gaikwad", "sourabhg9009@gmail.com", 'M');

	       a.setEmail("sourabhg9009@gmail.com");
	      System.out.println("My name is " + a.getName());
	       System.out.println("Mail Id is : " + a.getEmail());
	       System.out.println("My Gender is : " + a.getGender());
	}

}
