package lecture_eleven;

import lecture_ten.second_concept_DTO;
public abstract class first_concept_MemberManagerAbstract {
	
	// class �տ� abstract��� ���� �߰��Ѵ�.
	// abstract Ŭ���� �ȿ��� abstract�� ����� �޼ҵ尡 0�� �̻� �ִ�.
	// abstract�� ����� �޼ҵ尡 �ϳ��� �ִٸ�, �� Ŭ������ �ݵ�� abstract�̾�߸� �Ѵ�.
	// abstract Ŭ������ implements�� ����Ͽ� ������ �� ����. (�������̽��� �ƴ�, Ŭ���� �̱� ����)
	
	public abstract boolean addMember(second_concept_DTO member);
	public abstract boolean removeMember(String name, String phone);
	public abstract boolean updateMember(second_concept_DTO member);
	public void printLog(String data) {
		System.out.println("Data = " +data);
	}
}