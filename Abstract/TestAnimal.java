package Abstract;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Animal a;
  a=new Tiger("tiger" ,"jungle");
  a.domestic();
  a.wild();
  System.out.println(a.name + a.type);
	}

}
