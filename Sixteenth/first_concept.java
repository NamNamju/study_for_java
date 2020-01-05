package lecture_fifteen;

import lecture_nine.forth_concept_parent;

public class first_concept extends forth_concept_parent{
	@Override
	// @Override 어노테이션을 추가히주면, 어떤 메소드가 부모 클래스에 있는 것을 Override 했는지 알아보기 쉽다.
	public void printName() {
		System.out.println("AnnotationOverride");
	}

}
