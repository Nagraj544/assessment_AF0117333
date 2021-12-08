package practice;

import java.util.Arrays;

public class Sort {
	public static void main (String args[]) {
		int arr[]= {5,7,3,4,8,2,1,6,9};
		String arr2[]= {"nikhil","amar","rahul","vishal","sanjeev"};
		Arrays.sort(arr);
		System.out.println("the sorted numeric values are:" +Arrays.toString(arr));
		Arrays.sort(arr2);
		System.out.println("the sorted string values are:" +Arrays.toString(arr2));
	}

}
