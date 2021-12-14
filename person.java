package practice;

public class person {
	private String name;
	private String city;
	String gatName() {
		return name;
		}
	void setName(String n) {
		name = n;
		{
			void setCity(String c) {
				if(c == null)throw new
				NullPointException();
				city=c;
			}
			String getCity() {
				return city;
			}
		}
	}
}

