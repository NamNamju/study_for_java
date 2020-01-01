package lecture_eleven;

import lecture_ten.second_concept_DTO;

public interface first_concept {
	
	// 설계 단계에 해당
	// 외부에 노출되는 것을 정의해 놓고자 할 때 사용.
	// interface 내부에 선언된 메소드들은 몸통이 존재하면 안된다.
	public boolean addMember(second_concept_DTO member);
	public boolean removeMember(String name, String phone);
	public boolean updateMember(second_concept_DTO member);
	
}
