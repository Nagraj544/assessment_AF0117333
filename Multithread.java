package practice;
import java.lang.*;
public class Multithread extends Thread {
	public void run()
	{
		try {
			System.out.println("thread is executing now.....");		
			}catch(Exception e) {
		}
	}
	public static void main(String[] args) {
		Multithread m1=new Multithread();
		m1.start();
		m1.start();

	}

}
