package Assignment17;

import java.util.Scanner;

public class Stringcompare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first statement: ");
		String s1 = sc.nextLine();
		System.out.println("Enter second statement: ");
		String s2 = sc.nextLine();
		System.out.println("Your entered statements are same: " + s1.equals(s2));

	}

}
