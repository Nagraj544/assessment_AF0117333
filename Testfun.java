package practice;

import java.util.Arrays;
import java.util.List;

public class Testfun {
	public static void main(String args[]) {
		List<Integer>nums=Arrays.asList(1,2,3,4,5);
		nums.peek(n-> n%2==0).forEach(s-> System.out.print(""+s));
	}

}
