package lecture_six;

public class Example_one {

	public String name;
	public String address;
	public String phone;
	public String email;
	
	public Example_one(String name) {
		this.name = name;
	}
	
	public Example_one(String name, String address, String phone, String email)
	{
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		
	}
	public static void main(String[] args) {
		

	}
	
	public String toString() {
		return name+" "+address+" "+phone+" "+email;
	}

}

