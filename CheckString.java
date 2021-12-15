package Assignment15;

import java.util.Scanner;

public class CheckString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter your First Sentence");
		String s1=sc.next();
		System.out.println("Eneter your Second Sentence");
		String s2=sc.next();
		  
		if(s1.equals(s2)) {
			System.out.println("your entered Sentence is successfully compared: "+s1);
	}else
		System.out.println("your entered Sentence is not same: "+s2);
		}

	}


