package lecture_eleven;

import lecture_ten.second_concept_DTO;

public interface first_concept {
	
	// ���� �ܰ迡 �ش�
	// �ܺο� ����Ǵ� ���� ������ ������ �� �� ���.
	// interface ���ο� ����� �޼ҵ���� ������ �����ϸ� �ȵȴ�.
	public boolean addMember(second_concept_DTO member);
	public boolean removeMember(String name, String phone);
	public boolean updateMember(second_concept_DTO member);
	
}
