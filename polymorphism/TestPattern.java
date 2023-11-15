package polymorphism;

public class TestPattern {
void display()
{
	for(int j=1;j<=5;j++)
	{
		System.out.println("Sourabh");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Pattern p = new Pattern();
         p.display();
         TestPattern  t= new TestPattern();
         t.display();
	}

}
