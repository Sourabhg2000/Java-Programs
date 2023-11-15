package Inheritance;

public class LuxeryCar extends Car {
 void opensunroof()
 {
	 System.out.println("I have an additional fetaure called sunroof ..");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         LuxeryCar l = new LuxeryCar();
         l.accelerate();
         l.start();
         l.opensunroof();
	}

}
