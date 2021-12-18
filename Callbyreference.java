package Assignment16;

public class Callbyreference {
	int data = 100;

	void operation(Callbyreference cf) {
		cf.data = cf.data + 100;
	}

	public static void main(String[] args) {
		Callbyreference cf = new Callbyreference();
		System.out.println("before chage: " + cf.data);
		cf.operation(cf);
		System.out.println("After change: " + cf.data);

	}

}
