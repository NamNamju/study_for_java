package lecture_ten;

public class Example_one_Student {

	public String name;
	public String address;
	public String phone;
	public String email;
	
	public Example_one_Student(String name, String address, String phone, String email)
	{
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		
	}
	public boolean equals(Object obj) {
		
		if (this == obj) return true;  // 주소가 같으므로 당연히 true
		if (obj == null) return false; // obj가 null이므로 당연히 false
		
		if (getClass() != obj.getClass()) return false; // 클래스의 종류가 다르므로 false
		
		Example_one_Student other = (Example_one_Student) obj; // 같은 클래스이므로 형변환
		
		// 밑으로 각 인스턴스 변수가 같은지 비교하는 작업
		
		if (name == null) { // name이 null일 때
			if (other.name != null) return false; // 비교 대상의 name이 null이 아니면 false
			
		}else if (!name.equals(other.name)) return false; // 두 개의 name 값이 다르면 false
		
		//
		
		if (address == null) {
			if (other.address != null) return false;
			
		} else if (!address.equals(other.address)) return false;
		
		//
		
		if (phone == null) {
			if (other.phone != null) return false;
					
		} else if (!phone.equals(other.phone)) return false;
				
		//
		
		if (email == null) {
			if (other.email != null) return false;
			
		} else if (!email.equals(other.email)) return false;
		
		
		
		//false를 리턴하지 않았다면 true를 리턴함
		
		return true;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		
		return result;
	}
}
