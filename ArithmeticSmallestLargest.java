package Assignment15;

import java.util.Scanner;

//exercise 2.17
public class ArithmeticSmallestLargest {

 public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

     int num1;
     int num2;
     int num3;
     int sum;
     int average;
     int product;
     boolean largest;

     System.out.print("Enter First Integer: ");
     num1 = input.nextInt();

     System.out.print("Enter Second Integer: ");
     num2 = input.nextInt();

     System.out.print("Enter Third Integer: ");
     num3 = input.nextInt();

     sum = num1 + num2 + num3;
     average = sum / 3;
     product = num1 * num2 * num3;


     if (largest =num1 > num2 & num2 > num3)
    	 System.out.println();

     System.out.println("The total sum is :"+sum);

     System.out.println("The sum of average is :"+average);

     System.out.println("The sum of product is :"+product);

     System.out.println("The biggest number is " + largest);
 }
}
