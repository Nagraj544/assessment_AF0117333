package Assignment17;

import java.util.Scanner;

public class OutGradeLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Your Marks: ");
		int grade = sc.nextInt();
		if (grade <= 59)
			System.out.println("F");
		else if (grade >= 60 && grade <= 69)
			System.out.println("D");
		else if (grade >= 70 && grade <= 79)
			System.out.println("C");
		else if (grade >= 80 && grade <= 89)
			System.out.println("B");
		else if (grade >= 90 && grade <= 99)
			System.out.println("A");
	}

}
