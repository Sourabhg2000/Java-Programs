package Multithread;

public class Multi2 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t = new Thread(" I Am Thread");
t.start();

String str=t.getName();
System.out.println(str);
	}

}
