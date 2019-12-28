package lecture_seven;

import lecture_seven_sub.first_concept_sub; // 다른 패키지에 있는 클래스를 명시해준다.

//패키지의 모든 클래스를 명시하고 싶으면 import lecture_seven_seven_sub.*라고 사용한다.

public class first_concept {

	public static void main(String[] args) {
		first_concept_sub sub = new first_concept_sub();
		sub.subClass();

	}
}
