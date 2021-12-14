package nagraj;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr any year");
		int year=sc.nextInt();
		if(year%4==0) {
			System.out.println("your Enetred year is leap year"+year);
		}else
			System.out.println("your Enetred year is not leap year"+year);

	}

}
