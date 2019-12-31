package lecture_ten;

public class second_concept_DTO {

	public String name;
	public String phone;
	public String email;
	
	public second_concept_DTO (String name) {
		
	}
	
	public boolean equals(Object obj) {
		/*
		 * 조건
		 * 재귀, 대칭, 타동적, 일관, null과의 비교
		 */
		
		if (this == obj) return true;  // 주소가 같으므로 당연히 true
		if (obj == null) return false; // obj가 null이므로 당연히 false
		
		if (getClass() != obj.getClass()) return false; // 클래스의 종류가 다르므로 false
		
		second_concept_DTO other = (second_concept_DTO) obj; // 같은 클래스이므로 형변환
		
		// 밑으로 각 인스턴스 변수가 같은지 비교하는 작업
		
		if (name == null) { // name이 null일 때
			if (other.name != null) return false; // 비교 대상의 name이 null이 아니면 false
			
		}else if (!name.equals(other.name)) return false; // 두 개의 email 값이 다르면 false
		
		// name과 같음
		
		if (email == null) {
			if (other.email != null) return false;
			
		} else if (!email.equals(other.email)) return false;
		
		// name과 email과 같음
		
		if (phone == null) {
			if (other.phone != null) return false;
			
		} else if (!phone.equals(other.phone)) return false;
		
		//false를 리턴하지 않았다면 true를 리턴함
		
		return true;
	}
	
	//equals를 overriding 할 때에는 hashCode도 같이 overriding 해줘야 한다.
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		
		return result;
	}
	
	/*
	 * 항상 동일한 int 값을 리턴해 주어야 한다.
	 * equals() 메소드를 사용한 결과가 true일 경우 두 객체는 동일한 int값을 리턴해야 한다.
	 * 하지만 false를 리턴했다고 해서 호출한 int 값이 무조건 달라야 할 필요는 없다.
	 */
}
