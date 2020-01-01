package lecture_eleven;

import lecture_ten.second_concept_DTO;
public abstract class first_concept_MemberManagerAbstract {
	
	// class 앞에 abstract라는 예약어를 추가한다.
	// abstract 클래스 안에넌 abstract로 선언된 메소드가 0개 이상 있다.
	// abstract로 선언된 메소드가 하나라도 있다면, 그 클래스는 반드시 abstract이어야만 한다.
	// abstract 클래스는 implements를 사용하여 구현할 수 없다. (인터페이스가 아닌, 클래스 이기 때문)
	
	public abstract boolean addMember(second_concept_DTO member);
	public abstract boolean removeMember(String name, String phone);
	public abstract boolean updateMember(second_concept_DTO member);
	public void printLog(String data) {
		System.out.println("Data = " +data);
	}
}