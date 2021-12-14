package nagraj;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		for(int i=1;i<=2;i++) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a value");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println(num+":Is Even number");
	}else
		System.out.println(num+":Is Odd number");

}
}
}