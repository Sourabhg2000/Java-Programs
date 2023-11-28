package Multithread;

public class Multi4 extends Thread{
public void run()
{
	for(int i=0;i<5;i++) {
		System.out.println("*");
		System.out.println("hello");
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Multi4 t1=new Multi4();
        Multi4 t2=new Multi4();
        Multi4 t3=new Multi4();
        
        t1.start(); t2.start(); t3.start();
        
        t1.stop(); t2.stop(); t3.stop();
	}

}
