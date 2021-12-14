package practice;

public class Testdaemon extends Thread {
	public void run() {
		System.out.println("Running thread is daemon...");
	}
public static void main(String args[]) {
	Testdaemon td=new Testdaemon();
	td.start();
	td.setDaemon(true);
}
}
