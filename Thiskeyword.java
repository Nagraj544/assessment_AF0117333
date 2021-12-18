package Assignment16;

class Thiskeyword {
	private String Fname, Lname;

	Thiskeyword() {
		// TODO Auto-generated constructor stub
	}

	Thiskeyword(String fname, String lname) {
		super();
		this.Fname = fname;
		this.Lname = lname;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	void dispaly() {
		System.out.println("Student first name: " + getFname());
		System.out.println("stutend last name: " + getLname());

	}

	public static void main(String[] args) {
		Thiskeyword tk = new Thiskeyword("nagraj", "keshwar");
		tk.dispaly();

	}

}
