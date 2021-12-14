package nagraj;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		double r=5;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value");
		double r1=sc.nextDouble();
		
		double perimeter =2 * Math.PI * r1;
		System.out.println("Area perimetr is: "+perimeter);
		
		double circle = Math.PI * r1*2;
		System.out.println("Area of circle is:"+circle);
		

	}

}
