package Assignment16;

public class Room {
	private static final boolean ture = false;
	private int roomNo;
	private String roomType, roomArea;
	private boolean acMachine;

	Room() {
		// TODO Auto-generated constructor stub
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getRoomArea() {
		return roomArea;
	}

	public void setRoomArea(String roomArea) {
		this.roomArea = roomArea;
	}

	public boolean isAcMachine() {
		return acMachine;
	}

	public void setAcMachine(boolean acMachine) {
		this.acMachine = acMachine;
	}

	public static boolean isTure() {
		return ture;
	}

	void dispalyData() {
		System.out.println("the room#.is: " + getRoomNo());
		System.out.println("the roomType is: " + getRoomType());
		System.out.println("the roomArea is: " + getRoomArea());
		String s = (acMachine) ? "Yes" : "No";
		System.out.println("the A/C room needed: " + s);
	}

	public static void main(String[] args) {
		Room room1 = new Room();
		room1.setRoomNo(101);
		room1.setRoomType("Dulex");
		room1.setRoomArea("250.0f");
		room1.setAcMachine(ture);
		room1.dispalyData();
	}
}