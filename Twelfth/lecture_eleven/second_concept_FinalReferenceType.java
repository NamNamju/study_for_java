package lecture_eleven;

import lecture_ten.second_concept_DTO;

public class second_concept_FinalReferenceType {

	final second_concept_DTO dto = new second_concept_DTO();
	
	public static void main(String args[]) {
		second_concept_FinalReferenceType referenceType = new second_concept_FinalReferenceType();
		referenceType.checkDTO();
		
	}
	
	public void checkDTO() {
		System.out.println(dto);
		// dto = new second_concept_DTO(); �� �� �̻� ���� �Ҵ��ϰų� ���� �����ڸ� ����Ͽ� �ʱ�ȭ�� �� ����.
		dto.name = "Sangmin";
		System.out.println(dto);
		// dto ��ü�� �ش� Ŭ�������� �� �� �̻� ������ �� ������, dto ��ü ���� ��ü�� �׷��� ������ ����.

	}
}
