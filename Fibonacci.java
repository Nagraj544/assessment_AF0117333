package Assignment15;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b=1,c;
		int count=10;
			System.out.println(a+" "+b);
			for(int i=1;1<count;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
