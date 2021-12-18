package Assignment17;

import java.util.Scanner;

class ForIfStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a value and check Even Or Odd: ");
		int num = sc.nextInt();
		if (num % 2 == 0)
			System.out.println(num + " :is Even");
		else

			System.out.println(num + " :is Odd");
	}
}
