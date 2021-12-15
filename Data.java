package Assignment15;

public class Data {
	private int month;
	private int day;
	private int year;
	public Data(int myMonth, int myDay, int myYear) {
		this.month=myMonth;
		this.day=myDay;
		this.year=myYear;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	  public void displayDate(){
	        System.out.printf("%d/%d/%d\n", getMonth(), getDay(), getYear());
	    }
	}
   