package lecture_eleven;

import lecture_ten.second_concept_DTO;

public class first_concept_Impl2 extends first_concept_MemberManagerAbstract{
	
	// extends 뒤에는 클래스가 단 하나만 존재할 수 있다.
	
	public boolean addMember(second_concept_DTO member) {
		return false;
	}
	
	public boolean removeMember(String name, String phone) {
		return false;
	}
	
	public boolean updateMember(second_concept_DTO member) {
		return false;
	}

}
