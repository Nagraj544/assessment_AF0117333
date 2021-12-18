package Assignment16;

public class Callbyvalue {
	int data = 50;

	// creating method
	void change(int data) {
		data = data + 100;
	}

	// creating main method
	public static void main(String[] args) {
		Callbyvalue cv = new Callbyvalue();
		System.out.println("before change the value: " + cv.data);
		cv.change(500);
		System.out.println("after change the value: " + cv.data);
	}

}
