package Abstract;

public class DemoExample extends Example {
 public void a_method()
 {
	 System.out.println("This is abstract method");
 }
 
 public static void main(String [] args)
 {
	 Example de = new DemoExample();
	 de.a_method();
	 de.b_method();
 }
}
