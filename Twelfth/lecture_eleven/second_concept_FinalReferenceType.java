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
		// dto = new second_concept_DTO(); 두 번 이상 값을 할당하거나 새로 생성자를 사용하여 초기화할 수 없다.
		dto.name = "Sangmin";
		System.out.println(dto);
		// dto 객체는 해당 클래스에서 두 번 이상 생성할 수 없지만, dto 객체 안의 객체는 그러한 제약이 없다.

	}
}
