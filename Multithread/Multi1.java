package Multithread;

public class Multi1 extends Thread{

	public void run() {
		System.out.println(" I Am Running Thread....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi1 m =new Multi1();
		m.start();

	}

}
