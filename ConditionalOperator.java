package Assignment17;

class ConditionalOperator {

	public static void main(String[] args) {
		int x = 5, y = 4, z = 7;
		/* (true && false) || ture */
		System.out.println((x > y && x > z) || y < z);
		/* true || (false && ture) */
		System.out.println((x < z || y > z) && x < y);

		// if condition is false then Expression2 will execute
		y = (x == 1) ? 61 : 90; // Expression1 : Expression2
		System.out.println("Value of y is: " + y);
		y = (x == 5) ? 61 : 90;
		System.out.println("Value of y is: " + y);
		y = (z == 7) ? 61 : 90;
		System.out.println("Value of y is: " + y);
	}
}
