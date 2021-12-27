package Assignment17;

public class Book {
	private String Bname;
	private String Bauthor;
	private String Bnumber;

	public Book(String bname, String bauthor, String bnumber) {
		super();
		Bname = bname;
		Bauthor = bauthor;
		Bnumber = bnumber;
	}

	public String getBname() {
		return Bname;
	}

	public void setBname(String bname) {
		Bname = bname;
	}

	public String getBauthor() {
		return Bauthor;
	}

	public void setBauthor(String bauthor) {
		Bauthor = bauthor;
	}

	public String getBnumber() {
		return Bnumber;
	}

	public void setBnumber(String bnumber) {
		Bnumber = bnumber;
	}

	@Override
	public String toString() {
		return "Book [Bname=" + Bname + ", Bauthor=" + Bauthor + ", Bnumber=" + Bnumber + "]";
	}

	public static void main(String[] args) {

		Book[] arr = { new Book("111", "bbbb", "london"), new Book("131", "aaaa", "nyc"),
				new Book("121", "cccc", "jaipur") };

		// System.out.println(Arrays.toString(arr));
		for (Book i : arr) {
			System.out.println(i);
		}
	}

}
