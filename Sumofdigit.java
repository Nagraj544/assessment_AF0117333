package nagraj;

import java.util.Scanner;

public class Sumofdigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a value:");
		int sum=sc.nextInt();
		int num = sum%10;
		int remain = sum/10;
	    int add=num+remain;
    	System.out.println(add);
		}
		

	}


