package Assignment16;

public class SimpleObject {

	SimpleObject() {
		System.out.println("No argument constructor");
	}

	SimpleObject(int a) {
		System.out.println("One argument consrtuctor");
	}
}

class Constructor {
	public static void main(String[] args) {
		System.out.println();
		new SimpleObject();
		new SimpleObject(100);
	}
}
