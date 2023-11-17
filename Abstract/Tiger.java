package Abstract;

public class Tiger extends Animal {
  public Tiger(String name,String type)
  {
	  super(name,type);
  }
  public void domestic()
  {
	  System.out.println("i am not a domestic animal");
  }
  
  public void wild()
  {
	  System.out.println("i am wild animal");
  }
}
