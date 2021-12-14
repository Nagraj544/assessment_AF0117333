package nagraj;
import java.io.*;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<> ();
		l1.add(10);
		l1.add(40);
		l1.add(80);
		l1.add(50);
		l1.add(60);
		l1.set(3,99);
		System.out.println(l1);

	}

}
